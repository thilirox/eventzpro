<%-- 
    Document   : manualPKSearch
    Created on : Nov 23, 2016, 1:07:26 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseOperations.servicePackageHandling"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
      <%@include file='headerScripts.jsp' %>
      <script >
             function getservices(){
                 var sType = document.getElementById('stype').value;
                 var xhttp = new XMLHttpRequest();
                 xhttp.onreadystatechange= function(){
                     if(xhttp.readyState===4 & xhttp.status===200){
                         document.getElementById('SName').innerHTML=xhttp.responseText;
                     }
                 };
                 xhttp.open("POST","loadService?valajax="+sType,true);
                 xhttp.send();
             } 
             
      </script>
      <script >
             function getpackages(){
                 var sType = document.getElementById('SName').value;
                 var xhttp = new XMLHttpRequest();
                 xhttp.onreadystatechange= function(){
                     if(xhttp.readyState===4 & xhttp.status===200){
                         document.getElementById('packageList').innerHTML=xhttp.responseText;
                     }
                 };
                 xhttp.open("POST","loadPackages?valajax="+sType,true);
                 xhttp.send();
             } 
             
      </script>
  </head>
  <body>
<section id="container" >
     <%@include file='header.jsp' %>
     
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">

              <div class="row">
                  <div class="col-lg-9 main-chart">
                        <div class="row mtbox">
                            <h2 class="section-heading" style="color: black" >  Search Your Favorite Packages </h2>   
                  
                      <br>
                  	<% servicePackageHandling obj = new servicePackageHandling();
                        ResultSet sTypes = obj.getAllServiceTypes(); %>
                        <form  action="DisplayPackageDetails.jsp" method="POST">
                          <div class="form-group">
                                <label for="sel1">Select Service Type:</label>
                                <select class="form-control" id="stype"  name="type" onchange="getservices()" >
                                    <% while (sTypes.next()){
                                        String serviceType= sTypes.getString("Type"); %>
                                    <option  value="<%=serviceType %>"><%=serviceType %></option>
                                    <%} %>
                                </select>
                           </div>
                          <div  class="form-group">
                                <label for="sel1">Select list:</label>
                                <select class="form-control" id="SName" name="Service" onchange="getpackages()">
                                </select>
                           </div>
                          <div class="form-group">
                                <label for="sel1">Select list:</label>
                                <select class="form-control" id="packageList" name="Package">
                                </select>
                           </div>
                          <br>
                           <button type="submit"  class="btn btn-primary btn-xl page-scroll" >Search</button>
                          
                             </form>
                          </div><!-- /row mt -->	    
                   </div><! --/row -->
          </section>
            </section>
            <!--main content end-->
            <!--footer start-->
            <%@include file="footer.jsp" %>
            <!--footer end-->
        </section>
       <%@include file="footerScripts.jsp" %>
 </body>
</html>
