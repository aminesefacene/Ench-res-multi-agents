
package Client;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class NegociateurAgent extends Agent {

        ParallelBehaviour parallelBehaviour;
        
        public double Prix_max;
        public int pourcentage;
        public double prix_personnel;
        private double p=100;
        private double prix_augmentation;
        private String nom;
        public int identifiant;
        
        
        
        protected void setup(){
            
            System.out.println("Salut je suis l'agent négociateur. Mon nom est: "+this.getAID().getName());
            prix_personnel=0;
       
            Object[] args=getArguments();
            if(args.length==1){
                nom=(String)args[0];
            }else{
                System.out.println("Veuillez spécifier le prix max ou le pourcentage ");
                doDelete();
            }
    
    
        System.out.println("Affichage de Agent négociateur :"+"Inscription aux pages jaunes");
        DFAgentDescription agentDescription=new DFAgentDescription();
        agentDescription.setName(this.getAID());
        ServiceDescription serviceDescription=new ServiceDescription();
        serviceDescription.setType("Négociateur_enchère");
        serviceDescription.setName("Négociateur_enchère");
        agentDescription.addServices(serviceDescription);
        try {
            DFService.register(this, agentDescription);
        } catch (FIPAException e1) {
            e1.printStackTrace();
        }
        System.out.println("Affichage de Agent négociateur :"+"Inscription réussi");
                
        
            parallelBehaviour=new ParallelBehaviour();
            addBehaviour(parallelBehaviour);
            
            parallelBehaviour.addSubBehaviour(new CyclicBehaviour(){
                @Override
                public void action() {
                    try{
                             MessageTemplate template=
                             MessageTemplate.or(
                             MessageTemplate.MatchPerformative(ACLMessage.REQUEST),
                             MessageTemplate.or(
                             MessageTemplate.MatchPerformative(ACLMessage.INFORM),
                             MessageTemplate.MatchPerformative(ACLMessage.ACCEPT_PROPOSAL)));
                    ACLMessage aclMessage=receive(template);
                    switch (aclMessage.getPerformative()){
                        case ACLMessage.REQUEST :
                            if(aclMessage!=null){
                                System.out.println("Message reçu"+"\n");
                                String prix_proposé=aclMessage.getContent();
                                String Prix_maxe=aclMessage.getOntology();
                                String Pourcentage=aclMessage.getLanguage();
                                Prix_max=Double.parseDouble(Prix_maxe);
                                pourcentage=Integer.parseInt(Pourcentage);
                                AID requester=aclMessage.getSender();
                                    
                            try{
                                System.out.println("Affichage de Agent négociateur :"+"\n");
                                System.out.println("##################"+"\n");
                                System.out.println("Requête de négociation d'enchere"+"\n");
                                System.out.println("Prix proposé à envoyer : "+ prix_proposé+"\n");
                                System.out.println("Envoie de la requête"+"\n");
                                prix_personnel=Double.parseDouble(prix_proposé);
                                ACLMessage msg=new ACLMessage(ACLMessage.PROPOSE);
                                msg.addReceiver(new AID("Agent Enchere", AID.ISLOCALNAME));
                                msg.setContent(prix_proposé);
                                System.out.println("Négociation en cours"+"\n");
                                System.out.println("Fin de l'affichage de Agent négociateur :"+"\n");
                                Thread.sleep(500);
                                myAgent.send(msg);
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                            }else block();
                        break;    
                        case ACLMessage.INFORM : 
                            if(aclMessage!=null){
                                String prix_enchere=aclMessage.getContent();
                                Double prix_enchere_nouveau;
                                AID requester=aclMessage.getSender();
                                String identifiant=aclMessage.getProtocol();
                                prix_enchere_nouveau=Double.parseDouble(prix_enchere);
                                if(prix_personnel==prix_enchere_nouveau){
                                    System.out.println("Affichage de Agent négociateur :"+"\n");
                                    System.out.println("Ceci est ma propre offre, je la réitère");
                                    ACLMessage aclMsg=new ACLMessage(ACLMessage.PROPOSE);
                                    aclMsg.addReceiver(requester);
                                    aclMsg.setContent(prix_enchere);
                                    myAgent.send(aclMsg);
                                }else{    
                                    System.out.println("Affichage de Agent négociateur :"+"\n");
                                    System.out.print("*******************"+"\n");
                                    System.out.print("Réception du nouveau prix de la voiture"+"\n");
                                    System.out.print("From : "+aclMessage.getSender().getName()+"\n");
                                    System.out.print("Prix = "+prix_enchere_nouveau+"\n");
                                    if(prix_enchere_nouveau>Prix_max){
                                        System.out.println("prix max dépassé"+"\n");
                                        ACLMessage aclMsg=new ACLMessage(ACLMessage.FAILURE);
                                            aclMsg.addReceiver(requester);
                                            aclMsg.setContent("Prix trop haut, j'abandonne"+"\n");
                                            myAgent.send(aclMsg);
                                            
                                        ACLMessage msg=new ACLMessage(ACLMessage.FAILURE);
                                            msg.setContent("Nous avons perdu l'enchère, Le prix maximum a été dépassé");
                                            msg.addReceiver(new AID(nom+" Interface", AID.ISLOCALNAME));
                                            myAgent.send(msg);    
                                            takeDown();

                                    }else{
                                        prix_augmentation=prix_enchere_nouveau*(pourcentage/p);
                                        prix_enchere_nouveau=prix_enchere_nouveau+prix_augmentation;
                                        System.out.println("prix augmentation : "+prix_augmentation);
                                        System.out.println("mon nouveau prix d'enchère est le suivant "+prix_enchere_nouveau);
                                    if(prix_enchere_nouveau>Prix_max){
                                        System.out.println("Je propose mon prix max qui est de :"+Prix_max +"\n");
                                        String prix_max_proposé=Double.toString(Prix_max);
                                        ACLMessage aclMsg=new ACLMessage(ACLMessage.PROPOSE);
                                        aclMsg.addReceiver(requester);
                                        aclMsg.setContent(prix_max_proposé);
                                        myAgent.send(aclMsg);
                                        
                                        ACLMessage msg=new ACLMessage(ACLMessage.INFORM);
                                        msg.addReceiver(new AID(nom+" Interface", AID.ISLOCALNAME));
                                        msg.setContent("Le nouveau prix d'enchère est :"
                                                +prix_enchere +"\n"+"Ma nouvelle proposition est :"+prix_max_proposé+"\n");
                                        myAgent.send(msg);
                                        
                                    }else{
                                        prix_personnel=prix_enchere_nouveau;
                                        System.out.println("Je propose le prix : "+prix_enchere_nouveau+"\n");
                                        ACLMessage aclMessage2=new ACLMessage(ACLMessage.PROPOSE);
                                        aclMessage2.addReceiver(requester);
                                        String Prix_nouveau=Double.toString(prix_enchere_nouveau);   
                                        aclMessage2.setContent(Prix_nouveau);
                                        myAgent.send(aclMessage2);

                                        ACLMessage msg1=new ACLMessage(ACLMessage.INFORM);
                                        msg1.addReceiver(new AID(nom+" Interface", AID.ISLOCALNAME));
                                        msg1.setContent("Le nouveau prix d'enchère est :"
                                                +prix_enchere +"\n"+"Ma nouvelle proposition est :"+Prix_nouveau+"\n");
                                        myAgent.send(msg1);
                                    }
                                    }
                                    }
                                    System.out.println("Fin d'affichage de Agent négociateur :"+"\n");
                            }
                        break;    
                        case ACLMessage.ACCEPT_PROPOSAL:
                            System.out.println("Affichage de Agent négociateur :"+"\n");
                            System.out.println("Message d'acceptation reçu, j'envoie la réponse à l'agent d'interface"+"\n");
                            ACLMessage msg=new ACLMessage(ACLMessage.ACCEPT_PROPOSAL);
                            msg.setContent("nous avons gagné l'enchère pour le prix de :"+prix_personnel);
                            msg.addReceiver(new AID(nom+" Interface", AID.ISLOCALNAME));
                            myAgent.send(msg);
                            System.out.println("Fin d'affichage de Agent négociateur "+"\n");
                        break;
                    }  

                    }catch (Exception e){
                        e.getStackTrace();
                    }
                }    
                
                
            });
            
        }
        
      
            protected void takeDown() {
                try {
                    DFService.deregister(this);
                } catch (FIPAException e) {
                    e.printStackTrace();
                }
            }    
            
    
    
    
    
    protected void onGuiEvent(GuiEvent ge) {
        
    }
    
}
