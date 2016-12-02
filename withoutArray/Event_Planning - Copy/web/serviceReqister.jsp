<%-- 
    Document   : serviceReqister
    Created on : Nov 17, 2016, 4:14:30 PM
    Author     : Thilini.Samaranayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form  method="post" enctype="multipart/form-data" action="uploadFile.jsp">
 
<p>
<input type="file" name="ImageFile" id="ImageFile" />
</p>
<p>
<input type="submit" name="submit" value="submit" />
</p>
</form>
    </body>
</html>
