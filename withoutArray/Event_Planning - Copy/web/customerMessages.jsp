<%-- 
    Document   : customerMessages
    Created on : Dec 23, 2016, 4:41:48 PM
    Author     : user
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseOperations.servicePackageHandling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="headerScripts.jsp" %>
         <script >
             function saveMessage(){
                 var to = document.getElementById('to').value;
                 var header = document.getElementById('header').value;
                 var body = document.getElementById('content').value;
                 if (to !== "" && header !== "" && body !==""){
                    // alert("feilds cannot be empty");
                 var xhttp = new XMLHttpRequest();
                 xhttp.onreadystatechange= function(){
                     if(xhttp.readyState===4 & xhttp.status===200){
                        swal("Success!", "Submitted the message successfully!", "success");
                    }
                 };
                 xhttp.open("POST","addCusMessage?valto="+to+"&valheader="+header+"&valbody="+body,true);
                 xhttp.send();
                         } 
                     }
      </script>
    </head>
    <body>
                <section id="container" >
            <%@include file="headerServ.jsp" %>
            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row">
                        <div class="col-lg-9 main-chart">
                            <div class="row mtbox">
                                <h2 class="section-heading" style="color: black" > Leave a message </h2>   
                                                               <br>
                                <form >
                                    <% servicePackageHandling obj = new servicePackageHandling();
                                   ResultSet sTypes = obj.getServiceNames(); %>
                                 Directed to :
                                    <select class="form-control" id="to"  name="type" onchange="getservices()" >
                                    <% while (sTypes.next()){
                                        String serviceType= sTypes.getString("SName"); %>
                                    <option  value="<%=serviceType %>"><%=serviceType %></option>
                                    <%} %>
                                </select>
                                    <br>
                                    <input class="form-control" type="text" id="header" placeholder = "message heading" required>
                                    <br>
                                     <textarea class="form-control" id="content" rows="3" placeholder = "message body" required></textarea>
                                    <br>
                                    <button type="submit"  class="btn btn-warning" onclick="saveMessage()" >Search</button>
                                    <br>
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

