<%-- 
    Document   : registerUser
    Created on : Aug 23, 2016, 6:39:34 AM
    Author     : Thilini.Samaranayake
--%>
<%@page import="DatabaseOperations.userHandling"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.Date" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    

    <title>e -Eventz</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <script src="assets/js/chart-master/Chart.js"></script>
      <!-- Sweet Alert -->
  <script src="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.min.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.css">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
       <%
                String fname ="" ;
                String lname="";
                String un ="";
                String pw="";
                String email="";
                int contact =0;
                String type="customer";
                String City="";
                if (request.getParameter("txtFname")!= null){
                fname = request.getParameter("txtFname");
                
                }
                 if (request.getParameter("txtLname")!= null){
                lname = request.getParameter("txtLname");
                
                }
                  if (request.getParameter("txtEmail")!= null){
                 email = request.getParameter("txtEmail");
                
                }
                 if (request.getParameter("txtContact")!= null){
               contact = Integer.parseInt(request.getParameter("txtContact"));
                
                }
                  if (request.getParameter("txtUN")!= null){
               un = request.getParameter("txtUN");
                
                }
                   if (request.getParameter("txtPW")!= null){
               pw = request.getParameter("txtPW");
                
                }
              userHandling user = new userHandling();
              String result = user.addUser(fname, lname, un, pw, email, contact, type, City);
              System.out.println("dfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdf"+result);
  if("Success".equals(result)){
  %>
  <script type="text/javascript">
     function Redirect() {
               window.location="UserRegistration.jsp";
            }
            setTimeout('Redirect()', 1000);
           // swal("Oops...", "Wrong User Name and Password!", "Check Again");
          swal("Success!", "The data was saved", "success");
            
         //-->  
    
      
   </script>
  <%
  
  } 
  else{
%>  <script type="text/javascript">
      function Redirect() {
               window.location="UserRegistration.jsp";
            }
    sweetAlert("Oops...", "Something went wrong!", "error");
    setTimeout('Redirect()', 1000);
      
   </script>
<%

                   } %>

  <section id="container" >
     
      <!--header start-->
      <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
            <a href="index.html" class="logo"><b>EVENTZ</b></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">
              
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="HomePage.jsp">Logout</a></li>
            	</ul>
            </div>
        </header>
      <!--header end-->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  
              	 <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">Marcel Newman</h5>
              	  	
                  <li class="mt">
                      <a class="active" href="index.html">
                          <i class="fa fa-dashboard"></i>
                          <span>Dashboard</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-user"></i>
                          <span>Edit Profile</span>
                      </a>
                     
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-search"></i>
                          <span>Search Services</span>
                      </a>
                  </li>
                <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-list"></i>
                          <span>Request Status</span>
                      </a>
                  </li>
                  

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
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
                          
                      <br>
                  	
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

            
  
   