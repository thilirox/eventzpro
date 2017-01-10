<%-- 
    Document   : pendingOrderConfirm
    Created on : Jan 8, 2017, 4:00:55 PM
    Author     : user
--%>

<%@page import="DatabaseOperations.serviceReqHandling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventz</title>
         <!-- Sweet Alert -->
  <script src="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.min.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.css">
  
    </head>
    <body style="background-color: black">
        <% 
            String Id = request.getParameter("ReqId");
           serviceReqHandling sDetails = new serviceReqHandling();
           sDetails.setServiceConfirm(Id);
        %>
        <script>
           swal("Sucess!", "Confirmed the service order!", "success")
          function Redirect() {
               window.location="pendingServiceOrders.jsp";
            }
            setTimeout('Redirect()',5000);
        </script>
        
        
        
    </body>
</html>
