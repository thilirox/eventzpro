/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentHandling;

import ArrayHandling.ArrayOut;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import masmt2.agent.MaSMTAbstractAgent;
import masmt2.message.MaSMTMessage;
import masmt2.masmt.Settings;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

/**
 *
 * @author Thilini.Samaranayake
 */
public class ServiceManager extends masmt2.agent.MaSMTManager {

    MaSMTMessage tempmes;

    public String budgetIn;
    public String cusSelect;
    String header;
    public int guestsIn;
    

    public ServiceManager() {
        super();
    }

    public ServiceManager(String budgetIn, int guestsIn, String cusSelect, String header) {
        super();
        this.budgetIn = budgetIn;
        this.guestsIn = guestsIn;
        this.cusSelect = cusSelect;
        this.header = header;
        new Settings(50, 100, 30);

    }

    public void CreateAgentsWithRules() throws SQLException, IOException, ParserConfigurationException, SAXException {
        try {

            String xmlFileName = "F:\\thilifiles\\eventzpro.co.nf\\withoutArray\\Event_Planning - Copy\\ServiceAgent.xml";

            //.......................................................................
            File inputFile = new File(xmlFileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            //.................................................//
            NodeList nList1 = doc.getElementsByTagName("hotel");
            NodeList nList2 = doc.getElementsByTagName("photography");
            NodeList nList3 = doc.getElementsByTagName("decorations");
            NodeList nList4 = doc.getElementsByTagName("music");
            NodeList nList5 = doc.getElementsByTagName("catering");
            int x = nList1.getLength();
            int y = nList2.getLength();
            int z = nList3.getLength();
            int s = nList4.getLength();
            int p = nList5.getLength();
            setNumberofClients(x + y + z + s + p + 1);

            agents[0] = new CustomerAgent("masmt", "cus", 1, budgetIn, cusSelect, header);

            for (int temp1 = 0; temp1 < x; temp1++) {

                Node nNode = nList1.item(temp1);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    org.w3c.dom.Element eElement = (org.w3c.dom.Element) nNode;
                    String name = eElement.getAttribute("name");
                    String Pprice = eElement.getAttribute("up");
                    String pName = eElement.getAttribute("package");
                    String maxno = eElement.getAttribute("maxNo");
                    String ServType = eElement.getAttribute("type");

                    agents[temp1 + 1] = new HotelAgent(name, pName, Pprice,maxno,guestsIn,ServType, "masmt", "Hotel", (temp1 + 2));
                   // agents[temp1 + 1] = new ServiceAgent(name, pName, Pprice, "masmt", "Hotel", (temp1 + 2));
                }
            }

            for (int temp2 = 0; temp2 < y; temp2++) {

                Node nNode = nList2.item(temp2);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    org.w3c.dom.Element eElement = (org.w3c.dom.Element) nNode;
                    String name = eElement.getAttribute("name");
                    String Pprice = eElement.getAttribute("up");
                    String pName = eElement.getAttribute("package");
                    String ServType = eElement.getAttribute("type");

                    agents[temp2 + x + 1] = new ServiceAgent(name, pName, Pprice,ServType, "masmt", "Photography", (temp2 + x + 2));

                }
            }
            for (int temp3 = 0; temp3 < z; temp3++) {

                Node nNode3 = nList3.item(temp3);

                if (nNode3.getNodeType() == Node.ELEMENT_NODE) {

                    org.w3c.dom.Element eElement = (org.w3c.dom.Element) nNode3;
                    String name = eElement.getAttribute("name");
                    String Pprice = eElement.getAttribute("up");
                    String pName = eElement.getAttribute("package");
                    String ServType = eElement.getAttribute("type");

                    agents[temp3 + x + y + 1] = new ServiceAgent(name, pName, Pprice,ServType, "masmt", "decorations", (temp3 + x + y + 2));

                }
            }
            for (int temp4 = 0; temp4 < s; temp4++) {

                Node nNode4 = nList4.item(temp4);

                if (nNode4.getNodeType() == Node.ELEMENT_NODE) {

                    org.w3c.dom.Element eElement = (org.w3c.dom.Element) nNode4;
                    String name = eElement.getAttribute("name");
                    String Pprice = eElement.getAttribute("up");
                    String pName = eElement.getAttribute("package");
                    String ServType = eElement.getAttribute("type");

                    agents[temp4 + x + y + z + 1] = new ServiceAgent(name, pName, Pprice,ServType, "masmt", "music", (temp4 + x + y + z + 2));

                }
            }
            for (int temp5 = 0; temp5 < s; temp5++) {

                Node nNode5 = nList5.item(temp5);

                if (nNode5.getNodeType() == Node.ELEMENT_NODE) {

                    org.w3c.dom.Element eElement = (org.w3c.dom.Element) nNode5;
                    String name = eElement.getAttribute("name");
                    String Pprice = eElement.getAttribute("up");
                    String pName = eElement.getAttribute("package");
                    String ServType = eElement.getAttribute("type");

                    agents[temp5 + s + x + y + z + 1] = new ServiceAgent(name, pName, Pprice,ServType, "masmt", "catering", (temp5 + s + x + y + z + 2));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        activeAllClients();
        activeMessageParsing();
        //setLive(false);

//   activeTCPServer();
    }

    @Override
    public void active() {
        System.out.println("[Active] MANAGER  .... " + super.agent);

        try {
            // SET Number of Client agents 2
            CreateAgentsWithRules();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void live() {
    }

    @Override
    public void end() {
        System.out.println("End.");
    }

}
