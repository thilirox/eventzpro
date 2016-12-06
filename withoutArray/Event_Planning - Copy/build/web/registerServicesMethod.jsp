<%-- 
    Document   : registerServicesMethod
    Created on : Dec 6, 2016, 9:34:02 AM
    Author     : Thilini.Samaranayake
--%>

<%@page import="DatabaseOperations.userHandling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String sName = "";
            String oName = "";
            String cName = "";
            int cno = 0;
            String email = "";
            String address = "";
            String city = "";
            String province = "";
            String type = "";
            String url = "";
            String lat = "";
            String longti = "";
            sName = request.getParameter("txtSname").toString();
            oName = request.getParameter("txtOname").toString();
            cName = request.getParameter("txtCname").toString();
            cno = Integer.parseInt(request.getParameter("txtContact").toString());
            email = request.getParameter("txtEmail").toString();
            address = request.getParameter("txtAdd").toString();
            type = request.getParameter("txtType").toString();
            url = request.getParameter("txtURL").toString();
            lat = request.getParameter("txtLt").toString();
            longti = request.getParameter("txtLong").toString();
            
             userHandling service = new userHandling();
            String added= service.addService(sName, oName, cName, cno, email, address, type,url, lat, longti);
            if(added.equals("success")){
            System.out.println("Success");
            
            }


        %> 
    </body>
</html>
