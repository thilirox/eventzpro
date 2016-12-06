<%-- 
    Document   : registerServices
    Created on : Dec 5, 2016, 1:15:34 PM
    Author     : Thilini.Samaranayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
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
        
         <!-- Sweet Alert -->
  <script src="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.min.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.css">

        <!-- JS for range infor -->
        


        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        
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
           

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">

                    <div class="row">
                        <div class="col-lg-9 main-chart">
                            <div class="row mtbox">
                                <h2 class="section-heading" style="color: black" >  Register Your Service </h2>   
                                <h3 class="section-heading">  Enter Your Request </h3>
                                <br>
                                <form action="registerServicesMethod.jsp" method="POST">
                                       <div class="form-group">
                             <label for="usr">Service Name:</label>
                             <input type="text" class="form-control" name="txtSname" >
                          </div>
                          <div class="form-group">
                             <label for="usr">Owner Name:</label>
                             <input type="text" class="form-control" name="txtOname" >
                          </div>
                         <div class="form-group">
                             <label for="usr">Contact Person Name:</label>
                             <input type="text" class="form-control" name="txtCname" >
                          </div>
                          <div class="form-group">
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" class="form-control"  placeholder="Enter email" name ="txtEmail">
                          </div>
                          <div class="form-group">
                             <label for="usr">Contact No:</label>
                             <input type="text" class="form-control" name="txtContact"  placeholder="Your Conatact Number">
                          </div>
                          <div class="form-group">
                             <label for="usr">Address:</label>
                             <input type="text" class="form-control" name="txtAdd"  placeholder="Enter  Your Adress">
                          </div>
                          
                          <div class="form-group">
                             <label for="usr">Latitude:</label>
                             <input type="text" class="form-control" name="txtLt"  placeholder="Enter Latitude">
                          </div>
                           <div class="form-group">
                             <label for="usr">Longitute:</label>
                             <input type="text" class="form-control" name="txtLong" id="usr" placeholder="Enter Longitude">
                          </div>  
                           <div class="form-group">
                             <label for="usr">Type:</label>
                             <input type="text" class="form-control" name="txtType" id="usr" placeholder="Select Your Service Type">
                          </div>
                          <div class="form-group">
                             <label for="usr">Website URL:</label>
                             <input type="text" class="form-control" name="txtURL" id="usr" placeholder="Enter the website url if You have any">
                          </div>
                              
                          <div class="form-group">
                             <label for="usr">User Name:</label>
                             <input type="text" class="form-control" name="txtUN" id="usr" placeholder="Your User Name">
                          </div>
                          <div class="form-group">
                             <label for="pwd">Password:</label>
                             <input type="password" class="form-control" id="pwd" name ="txtPW">
                          </div>
                          <button type="submit" class="btn btn-warning">Submit</button>
                                    
                                    
                                </form>
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

       <%@include file="footerScripts.jsp" %>




    </body>
</html>
