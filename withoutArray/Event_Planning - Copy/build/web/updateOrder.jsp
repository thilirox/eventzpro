<%-- 
    Document   : updateOrder
    Created on : Oct 23, 2016, 9:00:48 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DatabaseOperations.serviceReqHandling"%>
<%@page import="CommunicationHandling.mailHandling"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% 
            String Service="HotelGaladari";
            String Email="";
        String reqID = request.getParameter("id");
        serviceReqHandling obj = new serviceReqHandling();
        obj.setServiceConfirm(reqID);
        
      ResultSet cusdetail=  obj.getCustomerReq(Service,reqID);
        while(cusdetail.next()){
        Email= cusdetail.getString("contEmail");
        }
         
       mailHandling sendcustomer = new mailHandling();
       sendcustomer.notifyCustomerProvider(Email);
        
          
        
        %>
         
    </body>
</html>
