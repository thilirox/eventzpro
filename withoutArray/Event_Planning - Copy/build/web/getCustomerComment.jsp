<%-- 
    Document   : getCustomerComment
    Created on : Jan 8, 2017, 5:27:58 PM
    Author     : user
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseOperations.customerMessages"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver");%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="headerScripts.jsp" %>
      
    </head>
    <body>
        <section id="container" >
            <%@ include file="header.jsp" %>
            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row">
                        <div class="col-lg-9 main-chart">
                            <div class="row mtbox">
                                <h2 class="section-heading" style="color: black" > Customer Feedbacks </h2> 
                                <%            // dbConnection con = new dbConnection();  
                                    String serviceName = "HotelGaladari";
                                    customerMessages obj = new customerMessages();
                                    ResultSet cusreq = obj.getCustomerMsg(serviceName);%>
                                <table id="Pending" class="table table-bordered">
                                    <tr>
                                        <th>messege ID</th>
                                        <th> Message </th>
                                        
                                    </tr>
                                    <%   while (cusreq.next()) {%>
                                    <tr >
                           <td id="reqid"><%=cusreq.getString("msgID")%></td>
                                        <td><ul>
                                                <li>Customer ID :  <%=cusreq.getString("CusId")%></li>
                                                <li>Heading  :  <%=cusreq.getString("heading")%></li>
                                                <li>Message     :  <%=cusreq.getString("msgbody")%></li>
                                               
                                            </ul>
                                        </td> 
                                        
                                    
                                    </tr>
                                    <% }%>
                                </table>
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
