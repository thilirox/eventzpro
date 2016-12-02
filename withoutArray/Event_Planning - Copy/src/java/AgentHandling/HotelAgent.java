/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentHandling;

import masmt2.agent.MaSMTAbstractAgent;
import masmt2.message.MaSMTMessage;
/**
 *
 * @author Thilini.Samaranayake
 */
public class HotelAgent extends masmt2.agent.MaSMTAgent {
    
    public String aname;
    public String pack;
    public float price;
    public float value;
    public float rem;
     String sendmes;
     String maxnumber;
     int guestsIn;
     int i;

    
    
    MaSMTMessage tempmes;
    

    public HotelAgent(){
    super();
    }
    public HotelAgent( String gp, String role, int id){
    super(gp, role, id);
    
    }
    
     public HotelAgent(String aname ,String pack, float price,  String maxnumber, int guestsIn ,String gp, String role, int id) {
        super(gp, role, id);
        this.aname = aname;
        this.pack = pack;
        this.price = price;
        this.maxnumber= maxnumber;
        this.guestsIn= guestsIn;
        
    }
    
    
    
    @Override
    public void active() {
System.out.println("[Active] .... " + super.agent);   
     i=0;}

    @Override
    public void live() {
      int  maxnoint = Integer.parseInt(maxnumber);
        tempmes = waitForMessage();
       // System.out.println(tempmes.message + "was recived by"+agent + " from "+ tempmes.sender);
        
      String agentRole = agent.getRole();
 
    //GET Message from customer
    if(tempmes.message.equals("get_sales"))
        {
           
       if (tempmes.content.contains(agentRole))
           { 
           
          String input = tempmes.content;
          final String result = stripNonDigits(input);
          //System.out.println(result);
          value = Float.parseFloat(result);
          
          if(value > price)
           {
           rem= value-price;
            
           sendmes = "("+aname +"-"+pack+ "-"+ price+")";              
           
           String removeAgent= removeString(input,agentRole);
           String newRoles = stripDigits(removeAgent);
           String AgentAnswer = agent + "has a package worth"+ price;
           String newContent= (newRoles+rem);
     
          //broadcast the remaining
  
      
          // System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmm"+i);
         MaSMTMessage m =new MaSMTMessage(agent,agent, agent, 
                "join_sales"+sendmes, newContent,"text", "broadcast");
         sendMessage(m);
         // System.out.println ("joinsales was broadcasted by"+agent);
         
         
         
  
           
           } }}
    
         
    if(tempmes.message.contains("join_sales"))
            {
        // System.out.println("/////////////////////JOINSALES");
        // System.out.println(tempmes.header +" from "+ tempmes.sender +" to "+agent.getRole()+agent.getId());
                
         if (tempmes.content.contains(agentRole))

        { 
             
          //System.out.println("/////////////////////JOINSALES"+agentRole);
        //  System.out.println(tempmes.content);
          String input3 = tempmes.content;
         
          final String resultDigits2 = stripNonDigits(input3);
          
          final String resultWords2 = stripDigits(input3);
          final String remainAgents2 = removeString(resultWords2, agent.getRole());
         
          //System.out.println(resultDigits2);
          //System.out.println(resultWords2);
          
          value = Float.parseFloat(resultDigits2);
          System.out.println("xxxxxxxxxxxxxxxxxxxxxxx"+value);
          
         if(value > price)
           {
           rem= value-price;
          String totalPackage = tempmes.message + ","+"("+aname +"-"+pack+ "-"+ price+")";      
            if(i<10){
    
         
                    MaSMTMessage m =new MaSMTMessage(agent,agent, agent, 
                          "join_sales"+totalPackage, remainAgents2 +rem ,"text", "broadcast");
                    sendMessage(m);
                      i++;
                    }  
            else{

                setLive(false);
                }
         // System.out.print(" xxxxxxxxxxxxxxxxxxxxxxxxxx   "+  i);
          

          MaSMTAbstractAgent customer =new MaSMTAbstractAgent("masmt", "cus",1);
          MaSMTMessage mes2 =new MaSMTMessage(agent, customer, agent, 
                "rep_get_sales", ""+totalPackage,"text", "local");
          sendMessage(mes2); 
}




        }
        
        }
    
//    if(tempmes.message.equals("rep_join_sales"))
//        {
//    //   MaSMTAbstractAgent sender =new MaSMTAbstractAgent("masmt", "sale",1);
//        MaSMTAbstractAgent customer =new MaSMTAbstractAgent("masmt", "cus",1);
//        MaSMTMessage mes =new MaSMTMessage(agent,customer, agent, 
//                "rep_get_sales", ""+ base_sale+" WITH "+ tempmes.content ,"text", "local");
//        sendMessage(mes); 
           
           
       // }
    }

    @Override
    public void end() {
    }
    public String stripNonDigits(String input){
    String digits = input.replaceAll("[^0-9.]", "");
    return digits;
}
    public String stripDigits(String input){
    String nonDigits = input.replaceAll("[0-9.]", "");
    return nonDigits;
}
   public static String removeString(String input, String toRemove){
   
   String newContent = input.replaceAll(toRemove,"");
    return newContent;

    
}
    
}
