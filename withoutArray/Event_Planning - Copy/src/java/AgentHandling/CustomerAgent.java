/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentHandling;

import ArrayHandling.ArrayOut;
import ArrayHandling.arrayItemHandling;
import DatabaseOperations.agentOutputHandling;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import masmt2.agent.MaSMTAbstractAgent;
import masmt2.message.MaSMTMessage;

/**
 *
 * @author Thilini.Samaranayake
 */
public class CustomerAgent extends masmt2.agent.MaSMTAgent {
   agentOutputHandling obj = new agentOutputHandling();

    public String price;
    public String cusSelect;
    public static int i=0;
     String header;

    

    MaSMTMessage tempmes;
    public ArrayList output = new ArrayList();

    public CustomerAgent() {
        super();
    }

    public CustomerAgent(String gp, String role, int id) {
        super(gp, role, id);
    }

    public CustomerAgent(String gp, String role, int id, String price , String cusSelect, String header) {
        super(gp, role, id);
        this.price = price;
        this.cusSelect=cusSelect;
        this.header = header;
    }

    @Override
    public void active() {
        
        System.out.println("[Active] .... " + super.agent);
        float fPrice = Float.parseFloat(price);
        System.out.println(cusSelect);
        MaSMTMessage m = new MaSMTMessage(agent, agent, agent, "get_sales", cusSelect + fPrice, "text", "broadcast");
        sendMessage(m);
        System.out.println("message broadcasted by customer"  );
    }

    @Override
    public void live() {

        tempmes = waitForMessage();
        if (tempmes.message.equals("rep_get_sales")) {
           System.out.println(tempmes.header +" from "+ tempmes.sender +" to "+agent.getRole()+agent.getId());
            System.out.println(tempmes.content);
            //String header = createHeader(headerSize);
            System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"+header);
        if(tempmes.content.contains(header.replaceAll("\\s+","")) )
       {
            
          String formatedOutput=removeString(tempmes.content,header);
           try {
               obj.saveInitial(formatedOutput);
               System.out.println(formatedOutput);
               } 
           catch (Exception ex) {
               Logger.getLogger(CustomerAgent.class.getName()).log(Level.SEVERE, null, ex);
                                   }
         }
       else{
       System.out.println("Total Package not included");
          
           }
        }
    }

    @Override
    public void end() {

        System.out.println("[End] .... " + super.agent);
    }
    
      

    
public static String removeString(String input, String toRemove){
   
   String newContent = input.replaceAll(toRemove,"");
    return newContent;

    
}

    public ArrayList getArray() {
        return output;

    }
    
    public String createHeader(int size){
    
     for (int i=0; i<size+1; i++ ){
     header = header+"joinsales";
     }
     
     return header;
    }}      
    
    

