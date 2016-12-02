<%-- 
    Document   : packageDetails
    Created on : Oct 13, 2016, 3:09:31 PM
    Author     : Thilini.Samaranayake
--%>


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DatabaseOperations.servicePackageHandling"%>
<!DOCTYPE html>
<html>
    <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>e-Eventz</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/style/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="${pageContext.request.contextPath}/style/vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="${pageContext.request.contextPath}/style/css/creative.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
     <script src="${pageContext.request.contextPath}/style/js/imageSlider.js"></script>
    <script>
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
    

</head>
    <body>
       <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Eventz</a>
            </div>

            <!-- Main Navi -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">About</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Service Details</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#request">Request</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">SignOut</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
        
        <!-- page header -->
       <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">We've got what you need!</h2>
                    <hr class="light">
                    <p class="text-faded">Try our service locating agents and find the best to suit your needs</p>
                    
                </div>
            </div>
        </div>
    </section>
        
        <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Package Details</h2>
                    <hr class="primary">
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
              City= resultServiceDetails.getString("City");
              Province = resultServiceDetails.getString("Province");
             
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
            </div>
        </div>
                   
<section>
        
<style>
.jssora05l,.jssora05r{display:block;position:absolute;width:40px;height:40px;cursor:pointer;background:url('img/a17.png') no-repeat;overflow:hidden}.jssora05l{background-position:-10px -40px}.jssora05r{background-position:-70px -40px}.jssora05l:hover{background-position:-130px -40px}.jssora05r:hover{background-position:-190px -40px}.jssora05l.jssora05ldn{background-position:-250px -40px}.jssora05r.jssora05rdn{background-position:-310px -40px}.jssora05l.jssora05lds{background-position:-10px -40px;opacity:.3;pointer-events:none}.jssora05r.jssora05rds{background-position:-70px -40px;opacity:.3;pointer-events:none}.jssort01 .p{position:absolute;top:0;left:0;width:72px;height:72px}.jssort01 .t{position:absolute;top:0;left:0;width:100%;height:100%;border:none}.jssort01 .w{position:absolute;top:0;left:0;width:100%;height:100%}.jssort01 .c{position:absolute;top:0;left:0;width:68px;height:68px;border:#000 2px solid;box-sizing:content-box;background:url('img/t01.png') -800px -800px no-repeat;_background:none}.jssort01 .pav .c{top:2px;_top:0;left:2px;_left:0;width:68px;height:68px;border:#000 0 solid;_border:#fff 2px solid;background-position:50% 50%}.jssort01 .p:hover .c{top:0;left:0;width:70px;height:70px;border:#fff 1px solid;background-position:50% 50%}.jssort01 .p.pdn .c{background-position:50% 50%;width:68px;height:68px;border:#000 2px solid}* html .jssort01 .c,* html .jssort01 .pdn .c,* html .jssort01 .pav .c{width:72px;height:72px}
</style>

      <%
            servicePackageHandling objimg = new servicePackageHandling();
            ResultSet image = objimg.GetImages("HotelGaladari"); %>  
        
<div id="jssor_1" style="position: relative; margin: 0 auto; top: 0px; left: 0px; width: 800px; height: 456px; overflow: hidden; visibility: hidden;">
<div data-u="slides" style="cursor: default; position: relative; top: 0px; left: 0px; width: 800px; height: 356px; overflow: hidden;">
<% while(image.next()){ %>
<div data-p="144.50">
<img data-u="image" src="${pageContext.request.contextPath}/ServiceImages/SavedFolder<%=image.getString("ImagePath")%>" />
</div>
<%}%>
</div>
</div>
   
<script type="text/javascript">jssor_1_slider_init();</script>
<!-- #endregion Jssor Slider End -->

    
        
        
        </section>  
             
        </section>
         <section id="request">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Make a request!</h2>
                    <hr class="primary">
                    <br/>
                <div class="col-lg-12 text-left"> 
                    <form method="POST" action="customerReq.jsp"> 
                     
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
                     
  </div>
 
                        
                        
                </div>
            </div>
        </div>
         </section>
                   
                    
      <!-- Gmap API -->              
     <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA8Kt4W7XfkrRObsgWdDbRjhN_BGhr0aJE&callback=initMap">
    </script>               
       <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/style/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/style/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="${pageContext.request.contextPath}/style/vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="${pageContext.request.contextPath}/style/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="${pageContext.request.contextPath}/style/js/creative.min.js"></script>    
        
        
        
        
        
        
        </body>
    
</html>
