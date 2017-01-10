<%-- 
    Document   : newjsp
    Created on : Jan 7, 2017, 5:16:24 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script>
                          function selectedvalue(){
                              var val = document.getElementById("getrange").value;
                              alert(val);
                              $("#range").val(val)
                          }
                      </script>
                      <input id="getrange" type="range" min="100" max="200"  onchange="selectedvalue()" />
                      <input id="range" />
                      
                        <%@include file="footerScripts.jsp" %>
    </body>
</html>
