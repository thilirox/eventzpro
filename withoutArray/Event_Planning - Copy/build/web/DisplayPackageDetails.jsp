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
           function initMap() {
        var uluru = {lat: -25.363, lng: 131.044};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 4,
          center: uluru
             });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
}
    </script>
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
                            <h2 class="section-heading" style="color: black" >  Package Generator </h2>   
                  <h3 class="section-heading">  Enter Your Request </h3>
                      <br>
                  	<%   String Owner="";
             int Contact=0;
             String Email="";
             String Address="" ;
             String City="" ;
             String Province= "" ;
            
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
              
              
             
              }    
             
    
             %>
             <table style="width: 100%">
                 <tr>
                     <td>
            <div class="col-lg-12 text-left"> 
             
                 Service: <%=Service %>  </br>
                 Package: <%=Package %>  </br>
                 Owner : <%=Owner %> </br>
                Address: <p>  <%=Address %> </p>
                 Contact Number: <p>(+94)<%=Contact %> </p>
                  
                  <p> Package Includes Following Services:  </p>
                   <ul >
                 <% 
                  while(resultPackagedetails.next()){
                    String Options = resultPackagedetails.getString("OptionDes"); %>
                    <li>  <%=Options %> </li>
                 <%
                    }
                 %>
                   </ul> 
                   <br/> <br/>       
             </div>
                   </td>
                   <td>
                        
            <div class="col-lg-12 text-right" style="height: 400px; width:600px " id="map">       
                       
            </div>    
                   </td>
                 </tr>
             </table>
                  <button type="button" class="btn btn-warning" id="gallery" >View Image Galary</button>  
                  <button type="button" class="btn btn-warning" id="request">Submit a request</button>
                  <a href="CustomerRequest.jsp" >Submit a request</a>
                  
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
          <!-- Gmap API -->              
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA8Kt4W7XfkrRObsgWdDbRjhN_BGhr0aJE&callback=initMap">
    </script> 
	

	
	
  

  </body>
</html>
