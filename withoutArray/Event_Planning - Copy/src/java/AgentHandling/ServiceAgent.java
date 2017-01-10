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
public class ServiceAgent extends masmt2.agent.MaSMTAgent {

    public String aname;
    public String pack;
    public String price;
    public String servType;
    public int value;
    public int rem;
    String sendmes;
    int i;
    MaSMTMessage tempmes;

    public ServiceAgent() {
        super();
    }

    public ServiceAgent(String gp, String role, int id) {
        super(gp, role, id);

    }

    public ServiceAgent(String aname, String pack, String price,String servType, String gp, String role, int id) {
        super(gp, role, id);
        this.aname = aname;
        this.pack = pack;
        this.price = price;
        this.servType=servType;
    }

    @Override
    public void active() {
        System.out.println("[Active] .... " + super.agent);
        i = 0;
    }

    @Override
    public void live() {
        int agentprice = Integer.parseInt(price);
        tempmes = waitForMessage();
        System.out.println(tempmes.message + "was recived by" + agent + " from " + tempmes.sender);
        String agentRole = agent.getRole();
        //GET Message from customer
        if (tempmes.message.equals("get_sales")) {
            if (tempmes.content.contains(agentRole)) {
                if(tempmes.content.contains(servType)){
                String input = tempmes.content;
                final String result = stripNonDigits(input);
                //System.out.println("value:" + value + "price:" + price);
                value = Integer.parseInt(result);
               
                if (value > agentprice) {
                    
                                   rem = value - agentprice;
                    sendmes = "(" + aname + "-" + pack + "-" + agentprice + ")";
                    String removeAgent = removeString(input, agentRole);
                    String newRoles = stripDigits(removeAgent);
                    String AgentAnswer = agent + "has a package worth" + price;
                    String newContent = (newRoles + rem);
                    //broadcast the remaining

                    MaSMTMessage m = new MaSMTMessage(agent, agent, agent,
                            "join_sales" + sendmes, newContent, "text", "broadcast");
                    sendMessage(m);
                    System.out.println("joinsales was broadcasted by" + agent);

                }
            }
        }
        }
        if (tempmes.message.contains("join_sales")) {
            System.out.println(tempmes.header + " from " + tempmes.sender + " to " + agent.getRole() + agent.getId());
            if (tempmes.content.contains(agentRole)) {
                if(tempmes.content.contains(servType)){
                //System.out.println("/////////////////////JOINSALES"+agentRole);
                System.out.println(tempmes.content);
                String input3 = tempmes.content;

                final String resultDigits2 = stripNonDigits(input3);

                final String resultWords2 = stripDigits(input3);
                final String remainAgents2 = removeString(resultWords2, agent.getRole());

                //System.out.println(resultDigits2);
                //System.out.println(resultWords2);
                value = Integer.parseInt(resultDigits2);

                if (value > agentprice) {
                    rem = value - agentprice;
                    String totalPackage = tempmes.message + "," + "(" + aname + "-" + pack + "-" + agentprice + ")";
                    if (i < 150) {

                        MaSMTMessage m = new MaSMTMessage(agent, agent, agent,
                                "join_sales" + totalPackage, remainAgents2 + rem, "text", "broadcast");
                        sendMessage(m);
                        i++;
                    } else {

                        setLive(false);
                    }
                    // System.out.print(" xxxxxxxxxxxxxxxxxxxxxxxxxx   "+  i);

                    MaSMTAbstractAgent customer = new MaSMTAbstractAgent("masmt", "cus", 1);
                    MaSMTMessage mes2 = new MaSMTMessage(agent, customer, agent,
                            "rep_get_sales", "" + totalPackage, "text", "local");
                    sendMessage(mes2);
                }

            }}

        }
    }

    @Override
    public void end() {
    }

    public String stripNonDigits(String input) {
        String digits = input.replaceAll("[^0-9.]", "");
        return digits;
    }

    public String stripDigits(String input) {
        String nonDigits = input.replaceAll("[0-9.]", "");
        return nonDigits;
    }

    public static String removeString(String input, String toRemove) {

        String newContent = input.replaceAll(toRemove, "");
        return newContent;

    }

}
