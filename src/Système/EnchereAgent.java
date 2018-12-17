
package Système;

import jade.core.Agent;
import jade.core.*;
import jade.core.behaviours.*; 
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.*;
import java.util.ArrayList;
import java.util.List;

        
public class EnchereAgent extends Agent {
    private ParallelBehaviour parallelBehaviour;
    private double prix_enchere_courant ;
    private AID dernier_encherisseur,meilleurs_enchérisseur;
    private List<AID> acheteurs=new ArrayList<>();
    private String prix_final;
    private int compteur;
    private double prix_enchère_meilleurs;
    
    protected void setup(){
       
        System.out.println("...vendeur : "+this.getAID().getName());
        System.out.println("...........");
        prix_enchere_courant=0;
        compteur=0;
        prix_enchère_meilleurs=0;
        
        
         
        parallelBehaviour=new ParallelBehaviour();
        addBehaviour(parallelBehaviour);
        parallelBehaviour.addSubBehaviour(new CyclicBehaviour(){
            @Override
            public void action() {
                try {
                            MessageTemplate messageTemplate= MessageTemplate.or(
                            MessageTemplate.MatchPerformative(ACLMessage.PROPOSE),
                            MessageTemplate.MatchPerformative(ACLMessage.FAILURE));
                    ACLMessage aclMessage=receive(messageTemplate);
                    if(aclMessage!=null){
                        switch(aclMessage.getPerformative()){
                            case ACLMessage.PROPOSE :  
                                compteur++;
                                String pri=aclMessage.getContent();
                                AID acheteur=aclMessage.getSender();
                                System.out.println("Offre de : "+pri+" de la part de "+acheteur);
                                       
                                if(prix_enchère_meilleurs<Double.parseDouble(pri)){
                                    prix_enchère_meilleurs=Double.parseDouble(pri);
                                    meilleurs_enchérisseur=acheteur;
                                }
                                acheteurs=chercherServices(myAgent, "Négociateur_enchère");
                                System.out.println("Le nombre d'acheteurs est de "+acheteurs.size());
                                if(compteur==acheteurs.size()){
                                    System.out.println("La meilleurs offre est : "+prix_enchère_meilleurs+ " de la part de "+meilleurs_enchérisseur+"\n");
                                    String prix_proposé=Double.toString(prix_enchère_meilleurs);
                                    AID sender=meilleurs_enchérisseur;
                                    if(prix_enchere_courant>=Double.parseDouble(prix_proposé)){
                                        ACLMessage msg=new ACLMessage(ACLMessage.ACCEPT_PROPOSAL);
                                        msg.setContent("Vous avez gagné l'enchère pour le prix de :"+prix_proposé);
                                        msg.addReceiver(sender);
                                        myAgent.send(msg);
                                        System.out.println("Envoie du message d'acceptation de l'offre");
                                        ACLMessage message=new ACLMessage(ACLMessage.INFORM);
                                        msg.setContent("L'agent "+sender+" a gagné l'enchère pour le prix de "+prix_proposé);
                                        msg.addReceiver(new AID("Agent Principal", AID.ISLOCALNAME));
                                        myAgent.send(message);
                                        System.out.println("Informer l'agent principal du gagnant de l'enchère");
                                        
                                    }else{
                                    prix_enchere_courant=prix_enchère_meilleurs;
                                    dernier_encherisseur=meilleurs_enchérisseur;
                                    System.out.println("Nous avons reçu l'offre "+prix_enchere_courant+" de la part de l'acheteur "+dernier_encherisseur+"\n");
                                    
                                    System.out.println("Recherche de tous les agents qui veulent acheter ce produit"+"\n");
                                    
                                    acheteurs=chercherServices(myAgent, "Négociateur_enchère");
                                    System.out.println("Liste des acheteurs trouvée"+"\n");
                                    try{
                                    for(AID aid:acheteurs){
                                        System.out.println("==="+aid.getName());
                                    } 
                                        System.out.println("le nouveau prix est "+prix_proposé);

                                            ACLMessage msg=new ACLMessage(ACLMessage.INFORM);
                                            msg.setContent(prix_proposé);
                                                for(AID aid:acheteurs){
                                                    msg.addReceiver(aid);
                                                }
                                            System.out.println("Envoie du nouveau prix à tous les acheteurs");
                                            Thread.sleep(5000);
                                            myAgent.send(msg);
                                            
                                    }catch (Exception e){
                                        e.printStackTrace();
                                    }
                                    prix_final=prix_proposé;
                                    }
                                    compteur=0;
                                }    
                            break;
                            case ACLMessage.FAILURE :
                                AID sender=aclMessage.getSender();
                                String contenu=aclMessage.getContent();
                                System.out.println("L'acheteur "+sender+" s'est retiré");
                                System.out.println("Le contenu du message faillure : "+contenu);
                                acheteurs=chercherServices(myAgent, "Négociateur_enchère");
                                    System.out.println("Liste des acheteurs trouvée"+"\n");
                                    
                                    for(AID aid:acheteurs){
                                        System.out.println("==="+aid.getName());
                                    } 
                                    System.out.println("Le nombre d'acheteur qui reste est de : "+acheteurs.size());    
                                
                                    if(acheteurs.size()==1){
                                        ACLMessage msg=new ACLMessage(ACLMessage.ACCEPT_PROPOSAL);
                                        msg.setContent("Vous avez gagné l'enchère pour le prix de :"+prix_final);
                                        msg.addReceiver(dernier_encherisseur);
                                        myAgent.send(msg);
                                        System.out.println("Envoie du message d'acceptation de l'offre");
                                        ACLMessage message=new ACLMessage(ACLMessage.INFORM);
                                        msg.setContent("L'agent "+dernier_encherisseur+" a gagné l'enchère pour le prix de "+prix_final);
                                        msg.addReceiver(new AID("Agent Principal", AID.ISLOCALNAME));
                                        myAgent.send(message);
                                        System.out.println("Informer l'agent principal du gagnant de l'enchère");
                         
                                    }  
                            break;    
                        }
                    }else block();
             
                
                } catch (Exception e) {
                    e.getStackTrace();
                }
                
            }

            
            
            
        });
    }    
    
        public List<AID> chercherServices(Agent agent, String type){
           List<AID> acheteurs=new ArrayList<>();
           DFAgentDescription agentDescription=new DFAgentDescription();
           ServiceDescription serviceDescription=new ServiceDescription();
           serviceDescription.setType(type);
           agentDescription.addServices(serviceDescription);
           try {
               DFAgentDescription[] descriptions=DFService.search(agent, agentDescription);
           for(DFAgentDescription dfad:descriptions){
               acheteurs.add(dfad.getName());
           }    
           } catch (FIPAException e){
               e.printStackTrace();
           }
           return acheteurs;
        } 

        
    
    
    
}
