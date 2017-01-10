<%-- 
    Document   : AutomaticPG
    Created on : Nov 22, 2016, 1:26:38 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseOperations.servicePackageHandling"%>
<%@page import="DatabaseOperations.agentOutputHandling"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
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
            }
             
        </script>
        <script type="text/javascript" >
        function validateData(){
            var minFvHotel = parseFloat(document.getElementById("MinFvHotel").value);
            var minFrHotel = parseFloat(document.getElementById("MinFrHotel").value);
            var minOtHotel = parseFloat(document.getElementById("MinOtHotel").value);
            var minSPhotography = parseFloat(document.getElementById("MinSPhotography").value);
            var minPhotography = parseFloat(document.getElementById("MinPhotography").value);
            var mindeco = parseFloat(document.getElementById("Mindeco").value);
            var minSdeco = parseFloat(document.getElementById("MinSdeco").value);
            var minCalipso = parseFloat(document.getElementById("MinCalipso").value);
            var minClassic = parseFloat(document.getElementById("MinClassic").value);
            var minDJ = parseFloat(document.getElementById("MinDJ").value);
            var minCatering = parseFloat(document.getElementById("MinCatering").value);
            
            var hotelFvStar = document.getElementById("HotelFiveStar");
            var hotelFrStar = document.getElementById("HotelFourStar");
            var hotelOther = document.getElementById("HotelOther");
            var sPhotography  = document.getElementById("PhotographyPremium");
            var photography = document.getElementById("PhotographyNormal");
            var sDeco = document.getElementById("decorationsPremium");
            var deco = document.getElementById("decorationsNormal");
            var calipso = document.getElementById("MusicCalipso");
            var dj = document.getElementById("MusicDJ");
            var classic = document.getElementById("MusicClassic");
            var catering = document.getElementById("catering");
            
            var minRequirement = 0 ;
            if(hotelFvStar.checked){
               minRequirement = minRequirement+ minFvHotel;}
            else if (hotelFrStar.checked){ minRequirement = minRequirement+ minFrHotel;}
            else if (hotelOther.checked){minRequirement = minRequirement+ minOtHotel; }  
              
              if(sPhotography.checked){minRequirement = minRequirement+ minSPhotography; }
              else if(photography.checked){ minRequirement = minRequirement+ minPhotography;}
                    
               if(sDeco.checked){minRequirement = minRequirement+ minSdeco;}
               else if(deco.checked){ minRequirement = minRequirement+ mindeco;  }
              
              if(calipso.checked){ minRequirement = minRequirement+ minCalipso;}
              else if (dj.checked){ minRequirement = minRequirement+ minDJ;  }
              else if (classic.checked){minRequirement = minRequirement+ minClassic; }
                 
               if(catering.checked)
               {minRequirement = minRequirement+ minCatering;}
               $("#txtbudget").attr({
                
                   "min" : minRequirement
                });
                
                document.getElementById('requirement').style.display = "block";
               swal({
                    title: "Minimum budget Requirement for your selection will be",
                    text: minRequirement,
                    html: true
                });
           }
           
           
           
             </script>
              <script type="text/javascript" >
            function range() {
                var minInput = parseFloat(document.getElementById("txtbudget").min);
                var userInput = parseFloat(document.getElementById("txtbudget").textContent);
                
                if(minInput>userInput){
                    alert("sssss");
                }
                
            }
             
        </script>
    </head>

    <body>
        <% agentOutputHandling obj = new agentOutputHandling();
            obj.clearResults();%>
            <% servicePackageHandling minrange =new servicePackageHandling();
            int MinFvHotel = minrange.getMinPackageRange("FiveStar");
            int MinFrHotel = minrange.getMinPackageRange("FourStar");
            int MinOtHotel = minrange.getMinPackageRange("Other");
            int MinSPhotography = minrange.getMinPackageRange("Photo-Premium");
            int MinPhotography = minrange.getMinPackageRange("Photo-Normal");
            int Mindeco = minrange.getMinPackageRange("Deco-Premium");
            int MinSdeco = minrange.getMinPackageRange("Deco-Normal");
            int MinClassic = minrange.getMinPackageRange("Classic");
            int MinCalipso = minrange.getMinPackageRange("Calipso");
            int MinDJ = minrange.getMinPackageRange("DJ");
            int Catering = minrange.getMinPackageRange("catering");
            
            %>
            <input   type="hidden" id="MinFvHotel" value="<%=MinFvHotel %>" >
            <input   type="hidden" id="MinFrHotel" value="<%=MinFrHotel %>" >
            <input   type="hidden" id="MinOtHotel" value="<%=MinOtHotel %>" >
            <input   type="hidden" id="MinSPhotography" value="<%=MinSPhotography %>" >
            <input   type="hidden" id="MinPhotography" value="<%=MinPhotography %>" >
            <input   type="hidden" id="Mindeco" value="<%=Mindeco %>" >
            <input   type="hidden" id="MinSdeco" value="<%=MinSdeco %>" >
            <input   type="hidden" id="MinCalipso" value="<%=MinCalipso %>" >
            <input   type="hidden" id="MinClassic" value="<%=MinClassic %>" >
            <input   type="hidden" id="MinDJ" value="<%=MinDJ %>" >
            <input   type="hidden" id="MinCatering" value="<%=Catering %>" >
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
                                
                                <br>
                                <form  action="agentResultTimer.jsp" method="POST">
                                    
                                    <br>
                                    <br>
                                    <h3 class="section-heading">  Choose the services you need for your package </h3>
                                    <br>
                                    <fieldset id="1">
                                        <h4>  Hotels </h4> 
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox" id ="HotelFiveStar" name="id" value="HotelFiveStar"> Five Star</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="HotelFourStar" value="HotelFourStar"> Four Star</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="HotelOther" value="HotelOther"> Other</label>
                                        </div>
                                    </fieldset>
                                    
                                    <fieldset id="2">
                                        <h4>  Photography </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="PhotographyPremium" value="PhotographyPrePho">Premium</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="PhotographyNormal" value="PhotographyNorPho">Normal</label>
                                        </div>
                                    </fieldset>
                                    <fieldset>
                                        <h4> Decorations </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="decorationsPremium" value="decorationsPreDeco">Premium</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="decorationsNormal" value="decorationsNorDeco">Normal</label>
                                        </div>
                                    </fieldset>
                                    <fieldset>
                                        <h4> Music And Sounds </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="MusicClassic" value="musicClassic">Classic</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="MusicCalipso" value="musicCalipso">Calipso</label>
                                        </div>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox"  name="id" id="MusicDJ" value="musicDJ">DJ</label>
                                        </div>
                                    </fieldset>
                                    <fieldset>
                                        <h4>Other </h4>
                                        <div class="checkbox-inline">
                                            <label><input type="checkbox" name="id" id="catering" value="catering">Cutlary and Catering</label>
                                        </div>
                                       
                                        <br>
                                    </fieldset><br>
                                    <button type="button" onclick="validateData()" class="btn btn-warning" > Get Price Range</button>  
                                    
                                    
                                    <br>
                                    <div id="requirement" style="display:none;" >
                                    <h3 class="section-heading">  Enter Your Request </h3>
                                    
                                    <input class="form-control" type="text" value="Enter your budget"  onchange="range()" id = "txtbudget" name="txtbudget">
                                    <br>
                                    <input class="form-control" type="text" value="No of guests" name="txtguest">
                                    <br/>
                                                                      <div id="validator">
                                    <button type="submit"  class="btn btn-warning" >Search</button>
                                    <br>
                                   </div>
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
