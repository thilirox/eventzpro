<%-- 
    Document   : CreateOntology
    Created on : Aug 21, 2016, 11:00:56 PM
    Author     : Thilini.Samaranayake
--%>


<%@page import="org.w3c.dom.Node"%>
<%@page import="java.io.File"%>
<%@page import="javax.xml.transform.stream.StreamResult"%>
<%@page import="javax.xml.transform.dom.DOMSource"%>
<%@page import="javax.xml.transform.OutputKeys"%>
<%@page import="javax.xml.transform.Transformer"%>
<%@page import="javax.xml.transform.TransformerFactory"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="org.w3c.dom.Element"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Adding data to ontology</h1>
        <form name="addData" action="CreateOntology.jsp">
            Service:   <input type="text" name="txtService" value="" /></br>
            Location:  <input type="text" name="txtLocation" value="" /></br>
            Package :<input type="text" name="txtPakage" value="" /></br>
            Price:<input type="text" name="txtPrice" value="" /></br>
            <input type="submit" value="SAVE" />
            <%
                String service = request.getParameter("txtService");
                String Location = request.getParameter("txtLocation");
                String Package = request.getParameter("txtPackage");
                String Price = request.getParameter("txtPrice");
            
            %>
            <% DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try{
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            //add elements to Document
            Element rootElement = doc.createElementNS("NSpace","Services");
            //append root element to document
            doc.appendChild(rootElement);
    //append first child element to root element
           NodeDescription des = new NodeDescription();
            rootElement.appendChild(des.getHotel(doc,"1",service , Location,Package,Price));
 
            //append second child
            
 
            //for output to file, console
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            //for pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
 
            //write to console or file
            StreamResult console = new StreamResult(System.out);
            //...................................................
            //Document mainDoc = .parse(new File("C:\\BN.xml"));
       // if 
     //      // Element root1 = mainDoc.createElement("Root1"); 
           // mainDoc.appendChild(root1);
       // } 
            StreamResult file = new StreamResult(new File("D://JADEagent//CreatingXML//sample.xml"));
 
            //write data
            transformer.transform(source, console);
            transformer.transform(source, file);
            System.out.println("DONE");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <%!public class NodeDescription {
   public  Node getHotel(Document doc, String id, String hname, String location, String pack,
            String price) {
        Element hotel = doc.createElement("Hotel");
 
        //set  attributes
        hotel.setAttribute("id", id);
        hotel.setAttribute("Sname", hname);
        hotel.setAttribute("Location", location);
        hotel.setAttribute("price", price);
        hotel.setAttribute("pack", pack);
        
 
        return hotel;
       
    }  
   private  Node getElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
} %>

        </form>
    </body>
</html>
