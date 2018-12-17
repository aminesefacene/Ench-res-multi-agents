
package Client;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import java.util.Scanner;

public class ClientContainer {
        
    
        public static void main(String[] args) {
               try {
                   Scanner clavier = new Scanner(System.in);
                   System.out.println("vôtre nom : ");
                   String nom=clavier.next();
                /*   System.out.println("Le prix maximum : ");
                   String prixMax=clavier.next();
                   System.out.println("Le pourcentage d'augmentation du prix : ");
                   String pourcentage=clavier.next();
                */  
                  
                   Runtime runtime=Runtime.instance();
                   ProfileImpl profileImpl=new ProfileImpl(false);
                   profileImpl.setParameter(ProfileImpl.MAIN_HOST, "localhost");
                   AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
        
                /*    AgentController agentController1=agentContainer.createNewAgent
                        (nom+" Interface", InterfaceAgent.class.getName(), new Object[]{nom});
                    AgentController agentController2=agentContainer.createNewAgent
                        (nom+" Négociateur", NegociateurAgent.class.getName(), new Object[]{prixMax,pourcentage,nom});
                */
                    
                //   agentController1.start();
                //   agentController2.start();
                
                  
                   
                    AgentController agentController=agentContainer.createNewAgent
                      (nom+" Négociateur", NegociateurAgent.class.getName(), new Object[]{nom});
                    AgentController agentController1=agentContainer.createNewAgent
                      (nom+" Interface", InterfaceAgent.class.getName(), new Object[]{nom});
                    agentController.start();
                    agentController1.start();


            
                   
                } catch (Exception e) {
                    e.printStackTrace();
            }
 
                
                
                
        }
}
