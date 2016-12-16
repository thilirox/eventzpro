<%-- 
    Document   : CustomerRequest
    Created on : Nov 23, 2016, 3:15:40 PM
    Author     : Thilini.Samaranayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="headerScripts.jsp" %>
    </head>

    <body>

        <section id="container" >

            <!--header start-->

            <!--header end-->
            <!--sidebar start-->
             <%@include file="header.jsp" %>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">

                    <div class="row">
                        <div class="col-lg-9 main-chart">
                            <div class="row mtbox">
                                <%
                                    String Sname = session.getAttribute("Service").toString();
                                    String Pname = session.getAttribute("Package").toString();
                                %>
                                <h2 class="section-heading" style="color: black" >  Service Request Submission </h2>   
                                <h3 class="section-heading">  Enter Your Request for  <%=Pname%>  of <%=Sname%> </h3>
                                <br>
                                <form action="customerReq.jsp" method="POST">
                                    <div class="form-group">


                                        <label>Requested Date</label>
                                        <div class="input-group date">
                                            <input name='ReqDate' type="text" class="form-control" value="10-22-2016" placeholder="Enter the reuested date">
                                            <div class="input-group-addon">
                                                <span class="glyphicon glyphicon-th"></span>
                                            </div>
                                            <br>
                                        </div>
                                        <label>Requested Time</label>
                                        <div class="input-group date">
                                            <input  name='ReqTime' type="text" class="form-control" value="10-22-2016" placeholder="Enter the reuested time">
                                            <div class="input-group-addon">
                                                <span class="glyphicon glyphicon-th"></span>
                                            </div>
                                        </div>
                                        <br>
                                        <label>Maximum No of guests</label>
                                        <input name='guests' type="text" class="form-control" value="" placeholder="no of guests">
                                        <br/>



                                        <button type="submit"  class="btn btn-primary btn-xl page-scroll" >Confirm Request</button>
                                    </div> 

                                </form>
                            </div><!-- /row mt -->	





                            <!-- **********************************************************************************************************************************************************
                            RIGHT SIDEBAR CONTENT
                            *********************************************************************************************************************************************************** -->                  


                        </div><! --/row -->
                </section>
            </section>
            <div>
                <br>
                <br>
                <br>
            </div>
            <!--main content end-->
            <!--footer start-->
            <%@include file="footer.jsp" %>
            <!--footer end-->
        </section>

        <!-- js placed at the end of the document so the pages load faster -->

        <%@include file="footerScripts.jsp" %>





    </body>
</html>
