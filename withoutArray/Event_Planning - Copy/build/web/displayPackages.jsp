<%-- 
    Document   : displayPackages
    Created on : Nov 23, 2016, 1:53:13 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ArrayHandling.outputFormating"%>
<%@page import="DatabaseOperations.agentOutputHandling"%>
<%@page import="ArrayHandling.arrayItemHandling"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">


        <title>e -Eventz</title>

        <%@include file="headerScripts.jsp" %>
        <script>
            function filterResults(){
             $("#Original").hide();
            var sType = document.getElementById('getrange').value;
                 var xhttp = new XMLHttpRequest();
                 xhttp.onreadystatechange= function(){
                     
                   if(xhttp.readyState===4 & xhttp.status===200){
                         
                         document.getElementById('Filter').innerHTML=xhttp.responseText;
                         
                     }
                 };
                 xhttp.open("POST","filterPackages?valajax="+sType,true);
                 xhttp.send();
             }
        </script>
    </head>

    <body>
        <%   arrayItemHandling obj1 = new arrayItemHandling();
            //        obj1.getIntialResultList(); %>

        <% 
            agentOutputHandling obj = new agentOutputHandling();
            outputFormating format = new outputFormating();
            ResultSet formatedOutput = obj.displayResults();
            int x = 0;
            int min = obj.getmaxMin("min");
            int max= obj.getmaxMin("max");
            int noResults= obj.countResults();

        %>

        <section id="container" >

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
                                <h2 class="section-heading" style="color: black" >  Package Generator </h2>   
                                <h3 class="section-heading"> Results for your selection </h3>
                                <br>
                                <script>
                                    function selectedvalue() {
                                        var val = document.getElementById("getrange").value;
                                        //alert(val);
                                        $("#range").text(val)
                                        $("#range").val(val)
                                    }
                                </script>
                                <div style="color: black">
                                <input  style=" border-color: black" id="getrange" type="range" min="<%=min %>" max="<%=max %>" value="<%=max %>" onchange="selectedvalue()" />
                                </div>
                                <div>
                                    Package range : <br>
                                    min:<%=min %> to max:
                                      <span id="range"></span>
                                 <button type="button" onclick="filterResults()" class="btn btn-warning" > Filter Request</button>
                                </div>
                                <br>
                                <br>
                                <div id="Filter">  </div>
                                <div id="Original">
                                    <div> <h4> No of Packages Generated = <%=noResults %> </h4> <div>
                                    
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>Package No</th>
                                            <th>Package Details </th>
                                            <th>Total Cost </th>

                                        </tr>
                                        <%                              int a = 1;
                                            while (formatedOutput.next()) {
                                                String Pdetails = formatedOutput.getString("PackageDe");
                                                Float cost = formatedOutput.getFloat("cost");
                                                String ForPdetails = Pdetails.replaceFirst(Pattern.quote(","), "");
  %>
                                        <tr>
                                            <td><%=a%></td>
                                            <td><table>
                                                    <%String[] outarray = format.splitOutput(ForPdetails.trim());
                                                        for (int y = 0; y < outarray.length; y++) {
                                                            String Val = outarray[y].replaceAll("-", ",").trim();

                                                    %>

                                                    <tr>
                                                        <td>

                                                            <%  String[] ItemDetails = format.splitOutput(Val);
                                                                int length = ItemDetails.length;
                                                                if (length == 3) {
                                                                    String ServiceName = ItemDetails[0].replaceAll("[(]", "").trim();
                                                                    String Pname = ItemDetails[2].trim();
                                                                    String Value = ItemDetails[1].replaceAll("[)]", "");

                                                            %>

                                                            <table class="table table-bordered"><tr>
                                                                    <td>
                                                                        <a href="DisplayPackageDetails.jsp?Service=<%=ServiceName%>&Package=+<%=Pname%>" > <%=ServiceName + " " + Pname%> 
                                                                        </a>
                                                                    <td>
                                                                        <%= Value%>         
                                                                    </td>

                                                                </tr></table>
                                                                <% }
                                                                    if (length == 4) {
                                                                        String ServiceName = ItemDetails[0].replaceAll("[(]", "");
                                                                        String Pname = ItemDetails[3];
                                                                        String Value = ItemDetails[2];
                                                                        String Num = ItemDetails[1].replaceAll("[)]", "");;


                                                                %><table class="table table-bordered"><tr>
                                                                    <td>
                                                                        <%=ServiceName + " " + Pname + " " + Num%> </td>
                                                                    <td>
                                                                        <%= Value%>         
                                                                    </td>

                                                                </tr></table><%
                                                                    }
                                                                %>

                                                        </td>
                                                    </tr>
                                                    <%
                                                        }
                                                    %>
                                                </table>

                                            </td>  
                                            <td > <%=cost%></td>

                                        </tr>
                                        <% a++;
                             }%>
                                    </thead>

                                </table>
                                </div>
                              
                            </div><!-- /row mt -->	





                            <!-- **********************************************************************************************************************************************************
                            RIGHT SIDEBAR CONTENT
                            *********************************************************************************************************************************************************** -->                  


                        </div><! --/row -->
                </section>
            </section>

            <!--main content end-->
            <!--footer start-->
            <footer class="site-footer">
                <div class="text-center">
                    EventZ@2016
                    <a href="index.html#" class="go-top">
                        <i class="fa fa-angle-up"></i>
                    </a>
                </div>
            </footer>
            <!--footer end-->
        </section>

        <!-- js placed at the end of the document so the pages load faster -->
        <script src="assets/js/jquery.js"></script>
        <script src="assets/js/jquery-1.8.3.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="assets/js/jquery.scrollTo.min.js"></script>
        <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
        <script src="assets/js/jquery.sparkline.js"></script>


        <!--common script for all pages-->
        <script src="assets/js/common-scripts.js"></script>

        <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
        <script type="text/javascript" src="assets/js/gritter-conf.js"></script>

        <!--script for this page-->
        <script src="assets/js/sparkline-chart.js"></script>    
        <script src="assets/js/zabuto_calendar.js"></script>	






    </body>
</html>