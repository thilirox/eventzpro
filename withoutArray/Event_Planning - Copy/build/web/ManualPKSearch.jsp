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
                         document.getElementById('services').innerHTML=xhttp.responseText;
                     }
                 };
                 xhttp.open("POST","loadService?valajax="+sType,true);
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
                      <form name="mannualPK" target="packageDetails.jsp">
                          <div class="form-group">
                                <label for="sel1">Select Service Type:</label>
                                <select class="form-control" id="sel1"  name="type" onchange="getservices()" >
                                    <% while (sTypes.next()){ %>
                                    <option id="stype" value="<%=sTypes.getString("Type") %>"><%=sTypes.getString("Type") %></option>
                                    <%} %>
                                </select>
                           </div>
                          <div  class="form-group">
                                <label for="sel1">Select list:</label>
                                <select class="form-control" id="services" name="SName">
                                  
                                </select>
                           </div>
                          <div class="form-group">
                                <label for="sel1">Select list:</label>
                                <select class="form-control" id="sel1">
                                  <option>PackageOne</option>
                                  <option>Packagetwo</option>
                                  <option>3</option>
                                  <option>4</option>
                                </select>
                           </div>
                          <br>
                          <button type="button" class="btn btn-warning">Search</button>
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
