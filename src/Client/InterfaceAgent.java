
package Client;


import Base_de_données.Principale;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.*;
import java.util.Map;
import java.util.Properties;

public class InterfaceAgent extends GuiAgent{
        private Principale principale;
        ParallelBehaviour parallelBehaviour;
        public double Prix_max;
        public int pourcentage;
        public String nom;
      
    @Override
    protected void setup() {
             System.out.println("Salut je suis l'agent d'interface. Mon nom est: "+this.getAID().getName());
          
             Object[] args=getArguments();
            if(args.length==1){
            //     Prix_max=Double.parseDouble((String)args[0]);
            //     pourcentage=Integer.parseInt((String)args[1]);
                 nom=(String)args[0];
            }else{
                System.out.println("Veuillez spécifier le nom de l'agent ");
                doDelete();
            }
        
             principale=new Principale(nom);
             principale.setInterfaceAgent(this);
             principale.setVisible(true);
             
            
            
            parallelBehaviour=new ParallelBehaviour();
            addBehaviour(parallelBehaviour);
            
            parallelBehaviour.addSubBehaviour(new CyclicBehaviour() {
                @Override
                public void action() {
                  try{
                        MessageTemplate msgTemplate=
                        MessageTemplate.or(
                        MessageTemplate.MatchPerformative(ACLMessage.REQUEST),
                        MessageTemplate.or(
                        MessageTemplate.MatchPerformative(ACLMessage.FAILURE),
                        MessageTemplate.or(
                        MessageTemplate.MatchPerformative(ACLMessage.INFORM),
                        MessageTemplate.MatchPerformative(ACLMessage.ACCEPT_PROPOSAL))));
                    ACLMessage aclMessage=receive(msgTemplate);
                    switch (aclMessage.getPerformative()){
                        case ACLMessage.REQUEST :
                            if(aclMessage!=null){
                                System.out.println("Affichage de Agent d'interface :"+"Message reçu"+"\n");
                                String prix_proposé=aclMessage.getContent();
                                AID requester=aclMessage.getSender();
                            try{
                                System.out.println("Prix proposé à envoyer : "+ prix_proposé+"\n");
                                System.out.println("Envoie de la requête vers l'agent négociateur"+"\n");
                                ACLMessage msg=new ACLMessage(ACLMessage.REQUEST);
                                msg.addReceiver(new AID(nom+" Négociateur", AID.ISLOCALNAME));
                                msg.setContent(prix_proposé);
                                System.out.println("Affichage de Agent d'interface :"+"Lancement des négociations"+"\n");
                                Thread.sleep(500);
                                myAgent.send(msg);
                                System.out.println("Fin de l'affichage de Agent négociateur :"+"\n");
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                            }else block();
                    break;
                        case ACLMessage.FAILURE :
                            System.out.println("Affichage de Agent négociateur :"+"\n");
                            System.out.println("Reçu de la confirmation de perte de l'enchère"+"\n");
                            System.out.println(aclMessage.getContent()+"\n");
                            System.out.println("Nous avons perdu"+"\n");
                            System.out.println("Fin de l'affichage de Agent négociateur :"+"\n");
                            
                            principale.showMessage(aclMessage.getContent(), true);
                            
                    break;
                        case ACLMessage.ACCEPT_PROPOSAL :
                            System.out.println("Affichage de Agent négociateur :"+"\n");
                            System.out.println("Reçu de la confirmation de la victoire"+"\n");
                            System.out.println(aclMessage.getContent()+"\n");
                            System.out.println("Nous avons gagné"+"\n");
                            System.out.println("Fin de l'affichage de Agent négociateur :"+"\n");
                            principale.showMessage(aclMessage.getContent(), true);
                            
                    break;
                        case ACLMessage.INFORM :
                            System.out.println("Nouveau prix d'enchère");
                            System.out.println(aclMessage.getContent());
                            principale.showMessage(aclMessage.getContent(), true);
                    }        
                }catch (Exception e){
                    e.getStackTrace();
                }
                }
            });
        
        
    }
    
    
    public void onGuiEvent(GuiEvent ev) {
        switch (ev.getType()){
            case 1:
                Map<String, Object> params=(Map<String, Object>) ev.getParameter(0);
                String Identifiant_produit=(String)params.get("Identifiant_enchère");
                String Prix_proposé=(String)params.get("Prix proposé");
                String Prix_maximum=(String)params.get("Prix maximum à proposer");
                String Pourcentage=(String)params.get("Pourcentage d'augmentation");
                ACLMessage aclMessage=new ACLMessage(ACLMessage.REQUEST);
                aclMessage.addReceiver(new AID(nom+" Négociateur", AID.ISLOCALNAME));
                aclMessage.setContent(Prix_proposé);
                aclMessage.setOntology(Prix_maximum);
                aclMessage.setLanguage(Pourcentage);
                send(aclMessage);
              
               break;
            default:
                break;
        }
    }

    

    
    
}
