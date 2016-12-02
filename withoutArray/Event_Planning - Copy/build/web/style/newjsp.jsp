<%-- 
    Document   : newjsp
    Created on : Nov 9, 2016, 1:28:43 PM
    Author     : Thilini.Samaranayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html >
<head>
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
</head>
<body>
    <form name="form1" method="post" enctype="multipart/form-data" action="newjsp3.jsp">
 
<p>
<input type="file" name="ImageFile" id="ImageFile" />
</p>
<p>
<input type="submit" name="submit" value="submit" />

</p>
</form>
</body>

</html>
