
package Système;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import java.util.Scanner;

public class AgentEnchèreContainer {
            
                public static void main(String[] args) {
                    try {
                        
     /*                     Scanner clavier = new Scanner(System.in);
                            System.out.println("vôtre produit : ");
                            String produit=clavier.nextLine();
                            System.out.println("vôtre produit : ");
                            String produit1=clavier.nextLine();
                            System.out.println("vôtre produit : ");
                            String produit2=clavier.nextLine();
                            System.out.println("vôtre produit : ");
                            String produit3=clavier.nextLine();
                            System.out.println("vôtre produit : ");
                            String produit4=clavier.nextLine();
       */                     

                            Runtime runtime=Runtime.instance();
                            ProfileImpl profileImpl=new ProfileImpl(false);
                            profileImpl.setParameter(profileImpl.MAIN_HOST, "localhost");
                            AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
                            AgentController agentController4=agentContainer.createNewAgent
                                ("Agent Enchere", EnchereAgent.class.getName(), new Object[]{});
                            
                            agentController4.start();
                            
                            
                        } catch (Exception e) {
                        e.printStackTrace();
                    }
    }
}
