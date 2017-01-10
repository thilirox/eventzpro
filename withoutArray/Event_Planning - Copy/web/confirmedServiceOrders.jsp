<%-- 
    Document   : confirmedServiceOrders
    Created on : Nov 20, 2016, 4:55:18 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DatabaseOperations.serviceReqHandling"%>
<%@page import="DatabaseOperations.dbConnection"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="headerScripts.jsp" %>
    </head>
    <body>
        <section id="container" >
            <%@ include file="headerServ.jsp" %>
            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row">
                        <div class="col-lg-9 main-chart">
                            <div class="row mtbox">
                                <h2 class="section-heading" style="color: black" > Completed Service Orders  </h2> 
                                <%            // dbConnection con = new dbConnection();  
                                    String serviceName = "HotelGaladari";
                                    serviceReqHandling obj = new serviceReqHandling();
                                   ResultSet cusreq = obj.getServiceConfirm(serviceName);%>
                                <table class="table table-bordered">
                                    <tr>
                                        <th>reqID</th>
                                        <th>Customer Details</th>
                                        <th>Set Complete</th>
                                    </tr>
                                    <%   while (cusreq.next()) {%>
                                    <tr>
                           <td><%=cusreq.getString("ReqID")%></td>
                                        <td><ul>
                                                <li>Customer name :  <%=cusreq.getString("ContName")%></li>
                                                <li>No of guests  :  <%=cusreq.getString("NoOfGuests")%></li>
                                                <li>Req Date      :  <%=cusreq.getString("ReqDate")%></li>
                                                <li>Contact No    :  <%=cusreq.getString("ContNo")%></li>
                                            </ul>
                                        </td> <td> <a href="completeConfirmedOrders.jsp?ReqId=<%=cusreq.getString("ReqID")%>" >
                                                Set Confirm </a> </td> </tr>
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