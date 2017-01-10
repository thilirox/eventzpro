<%-- 
    Document   : DisplayPackageDetails
    Created on : Nov 23, 2016, 2:40:58 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseOperations.servicePackageHandling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
        <title>e -Eventz</title>
     <%@include file="headerScripts.jsp" %>
    
    <script type="text/javascript">
    
    document.getElementById("request").onclick = function () {
        location.href = "CustomerRequest.jsp";
    };
</script>
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
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
                            <h2 class="section-heading" style="color: black" >  Package Description </h2>   
                  
                      <br>
                  	<%   String Owner="";
             int Contact=0;
             String Email="";
             String Address="" ;
             String City="" ;
             String Province= "" ;
             String lat = "";
             String longt = "";
             String Weburl ="";
             String Service = request.getParameter("Service").replaceAll("\\s","");
             String Package = request.getParameter("Package").replaceAll("\\s","");
             session.setAttribute("Service", Service);
             session.setAttribute("Package", Package); 
             servicePackageHandling obj = new servicePackageHandling();
             ResultSet resultServiceDetails = obj.selectPackage(Service, Package);
             ResultSet resultPackagedetails= obj.selectPackageDetails(Service, Package);
             ResultSet images = obj.GetImages("HotelGaladari");
             while(resultServiceDetails.next()){
              Owner = resultServiceDetails.getString("OwnerName");
              Contact = resultServiceDetails.getInt("CNumber");
              Email=resultServiceDetails.getString("email");
              Address=resultServiceDetails.getString("Address");
              lat=resultServiceDetails.getString("Latitude");
              longt=resultServiceDetails.getString("Longitute");
              Weburl =resultServiceDetails.getString("WebsiteURL");
               }  
              
             %>
             <input type="hidden" id="lati" value="<%=lat %>" />
             <input type="hidden" id="longtitude" value="<%=longt %>" />
             <table style="width: 100%">
                 <tr>
                     <td>
            <div style="height: 400px; width:400px " class="col-lg-12 text-left"> 
             
                <h5>   Service: <%=Service %>  </br></br>
                 Package: <%=Package %>  </br></br>
                 Owner : <%=Owner %> </br></br>
                Address: <p>  <%=Address %> </p></br>
                 Contact Number: <p>(+94)<%=Contact %> </p> </br>
                  
                  <p> Package Includes Following Services:  </p>
                  <div>
                   <ol >
                 <% 
                  while(resultPackagedetails.next()){
                    String Options = resultPackagedetails.getString("OptionDes"); %>
                    <li>  <%=Options %> </li>
                 <%
                    }
                 if(Weburl != null){
                 %> 
                    
                    For more details visit <%=Weburl %>
                    
                    <%} %>
                   </ol>
                  </div></h5>
                   <br/> <br/>       
             </div>
                   </td>
                   <td>
                       <script type="text/javascript">
           function initMap() {
             var lati = parseFloat(document.getElementById('lati').value);
             var longti=parseFloat( document.getElementById('longtitude').value);
        var uluru = {lat:lati,lng: longti};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 10,
          center: uluru
             });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
}
    </script>
                        
            <div class="col-lg-12 text-right" style="height: 400px; width:600px " id="map">       
                       
            </div>    
                   </td>
                 </tr>
             </table>
                   <br>
                   <br>
                   <div>
                       <br>
                       <br>
                       <a href="ServiceImageGallery.jsp" >  Click here to view image gallery of <%=Service %> </a> <br>
                       Interested! Then click here to place a request:  <a href="CustomerRequest.jsp" >Submit a request</a>
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
      <%@include file="footer.jsp" %>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
   
    <%@include file="footerScripts.jsp" %>
          <!-- Gmap API -->              
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA8Kt4W7XfkrRObsgWdDbRjhN_BGhr0aJE&callback=initMap">
    </script> 
	

	
	
  

  </body>
</html>
