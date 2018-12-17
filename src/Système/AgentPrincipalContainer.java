/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Système;

import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;


public class AgentPrincipalContainer {
 
                   public static void main(String[] args) {
                    try {
                        jade.core.Runtime runtime=jade.core.Runtime.instance();
                        ProfileImpl profileImpl=new ProfileImpl(false);
                        profileImpl.setParameter(profileImpl.MAIN_HOST, "localhost");
                        AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
                        AgentController agentController=agentContainer.createNewAgent
                            ("Agent Principal", PrincipalAgent.class.getName(), new Object[]{});
                        agentController.start();
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
    }
}
