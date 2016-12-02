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
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
        <%
                         arrayItemHandling obj1 = new arrayItemHandling();
                         obj1.getIntialResultList();
                         
                       
                       
                       %>
   
    <% 
    agentOutputHandling obj = new agentOutputHandling();
    outputFormating format = new outputFormating();
    ResultSet formatedOutput = obj.displayResults();
    int x=0;
    
    %>

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
                            <h2 class="section-heading" style="color: black" >  Package Generator </h2>   
                  <h3 class="section-heading">  Enter Your Request </h3>
                      <br>
                  	<table class="table table-bordered">
                        <thead>
                          <tr>
                            <th>#</th>
                            <th>Package Details </th>
                           
                          </tr>
                          <% while(formatedOutput.next()){
                          String Pdetails =  formatedOutput.getString("PackageDe");
                          Float cost = formatedOutput.getFloat("cost");
                          String ForPdetails = Pdetails.replaceFirst(Pattern.quote(","), "");
                          
                         
                          
                          %>
                          <tr>
                            
                              <td><table>
                                  <%String[] outarray = format.splitOutput(ForPdetails.trim());
                                  for(int y=0;y<outarray.length;y++){
                                            String Val = outarray[y].replaceAll("-", ",").trim();

                                  %>
                                  
                                  <tr>
                                      <td>
                                      
                                      <%  String[] ItemDetails = format.splitOutput(Val);
                                      int length= ItemDetails.length ;
                                           if (length ==3){
                                          String ServiceName = ItemDetails[0].replaceAll("[(]", "").trim();
                                          String Pname =ItemDetails[2].trim(); 
                                          String Value = ItemDetails[1].replaceAll("[)]", "");
                                      
                                      %>
                                          
                                      <table class="table table-bordered"><tr>
                                           <td>
                                               <a href="DisplayPackageDetails.jsp?Service=<%=ServiceName %>&Package=+<%=Pname %>" > <%=ServiceName + " "+ Pname  %> 
                                               </a>
                                              <td>
                                             <%= Value
                                          %>         
                                             </td>
                                              
                                              </tr></table>
                                          <% } 
                                          if (length ==4){
                                          String ServiceName = ItemDetails[0].replaceAll("[(]", "");
                                          String Pname =ItemDetails[3]; 
                                          String Value = ItemDetails[2];
                                          String Num = ItemDetails[1].replaceAll("[)]", "");;
                                        
                                          %><table class="table table-bordered"><tr>
                                              <td>
                                          <%=ServiceName + " "+ Pname+ " "+Num
                                          %> </td>
                                              <td>
                                             <%= Value
                                          %>         
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
                                  
                                                              
                              <td > <%=cost %></td>

                          </tr>
                         <%} %>
                        </thead>
               
                    </table>
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