<%-- 
    Document   : CreateOntologyNew
    Created on : Aug 22, 2016, 5:27:20 AM
    Author     : Thilini.Samaranayake
--%>

<%@page import="com.mysql.fabric.Server"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.w3c.dom.Element"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page import="javax.xml.transform.stream.*" %>
<%@page import="javax.xml.transform.dom.*" %>
<%@page import="javax.xml.parsers.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
         <form name="addData" action="CreateOntology.jsp">
            Service:   <input type="text" name="txtService" value="" /></br>
            Location:  <input type="text" name="txtLocation" value="" /></br>
            Package :<input type="text" name="txtPakage" value="" /></br>
            Price:<input type="text" name="txtPrice" value="" /></br>
            <input type="submit" value="SAVE" />
            <%  
                 
                String service = request.getParameter("txtService");
                String location = request.getParameter("txtLocation");
                String pack = request.getParameter("txtPackage");
                String price = request.getParameter("txtPrice");}
    %>
        <%
         
         DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse("server.xml");
        Element root = document.getDocumentElement();
        
        Service service = new Service();
        ArrayList ServArray = new ArrayList<Service>();
        
        

        for (Service service : services) {
            // server elements
            Element RootElement = document.createElement("services");

            Element name = document.createElement("HotelService");
            name.setAttribute("name", "Hotel 01");
            //hotel.setAttribute("id", id);
            name.setAttribute("Location", location);
            name.setAttribute("price", price);
            name.setAttribute("pack", pack);
            //name.appendChild(document.createTextNode(service.getName()));
            RootElement.appendChild(name);

            Element port = document.createElement("port");
            port.appendChild(document.createTextNode(Integer.toString(service.getPort())));
            RootElement.appendChild(port);

            root.appendChild(RootElement); }
        
        %>
            <%! 
             public  class Service {
        public String getName() { return "foo"; }
        public Integer getPort() { return 12345; }
    }
            %>
            
            
    
         </form>
    
    
    </body>
</html>
