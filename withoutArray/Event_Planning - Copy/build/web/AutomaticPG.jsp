<%-- 
    Document   : AutomaticPG
    Created on : Nov 22, 2016, 1:26:38 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="DatabaseOperations.agentOutputHandling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="headerScripts.jsp" %>
        <script type="text/javascript" >
            function hotelrange() {
                swal({
                    title: "Hotel <small>Ranges</small>!",
                    text: "A custommessage.",
                    html: true
                });
            },
             function validateDate(){
                 if(document.getElementById('').onchange)
                 
             }
        </script>
    </head>

    <body>
        <% agentOutputHandling obj = new agentOutputHandling();
            obj.clearResults();%>

        <section id="container" >
            <%@include file="header.jsp" %>
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
                                <h3 class="section-heading">  Enter Your Request </h3>
                                <br>
                                <form  action="agentResultTimer.jsp" method="POST">
                                    <input class="form-control" type="text" value="Enter your budget" name="txtbudget">
                                    <br>
                                    <input class="form-control" type="text" value="No of guests" name="txtguest">
                                    <br>
                                    <br>
                                    <h3 class="section-heading">  Choose the services you need for your package </h3>
                                    <br>
                                    <fieldset id="1">
                                        <h4>  Hotels </h4> 
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox" name="id" value="HotelFiveStar" onchange=""> Five Star</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="HotelFourStar"> Four Star</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="HotelOther"> Other</label>
                                        </div>
                                    </fieldset>
                                    <button type="button" class="btn btn-primary btn-sm"  onclick="hotelrange()">Range Info</button>
                                    <fieldset id="2">
                                        <h4>  Photography </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="PhotographyPremium">Premium</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="PhotographyNormal">Normal</label>
                                        </div>
                                    </fieldset>
                                    <fieldset>
                                        <h4> Decorations </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="decorationsPremium">Premium</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="decorationsNormal">Normal</label>
                                        </div>
                                    </fieldset>
                                    <fieldset>
                                        <h4> Music And Sounds </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="MusicClassic">Classic</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="MusicCalipso">Calipso</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" value="MusicDJ">DJ</label>
                                        </div>
                                    </fieldset>
                                    <fieldset>
                                        <h4>Other </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox" name="id" value="Catering">Cutlary and Catering</label>
                                        </div>
                                        <br>
                                    </fieldset>
                                    <button onclick="validateData()" class="btn btn-warning" > Get Price Ranges </button>
                                    <div id="validator">
                                    <button type="submit"  class="btn btn-warning" >Search</button>
                                    <br>
                                    </div>
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
