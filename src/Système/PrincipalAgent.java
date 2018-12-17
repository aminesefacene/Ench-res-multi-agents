
package Système;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class PrincipalAgent extends Agent {
    
        protected void setup(){
           
            System.out.println("...principal : "+this.getAID().getName());
            System.out.println("...........");
        
            ParallelBehaviour parallelBehaviour = new ParallelBehaviour();
            addBehaviour(parallelBehaviour);
            
            parallelBehaviour.addSubBehaviour(new CyclicBehaviour(){
                @Override
                public void action() {
                    try{
                             MessageTemplate template=
                             MessageTemplate.or(
                             MessageTemplate.MatchPerformative(ACLMessage.REQUEST),
                             MessageTemplate.MatchPerformative(ACLMessage.INFORM));
                        ACLMessage aclMessage=receive(template);
                    switch (aclMessage.getPerformative()){
                        case ACLMessage.INFORM:
                            System.out.println(aclMessage.getContent());
                            break;
                    }  

                    }catch (Exception e){
                        e.getStackTrace();
                    }
          
                        
            
            
                }
            });
        }            
}

