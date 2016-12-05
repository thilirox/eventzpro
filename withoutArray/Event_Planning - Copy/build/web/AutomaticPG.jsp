<%-- 
    Document   : AutomaticPG
    Created on : Nov 22, 2016, 1:26:38 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="DatabaseOperations.agentOutputHandling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <script type="text/javascript" >
            function hotelrange() {
                swal({
                    title: "Hotel <small>Ranges</small>!",
                    text: "A custommessage.",
                            html: true
                });

            }

        </script>


        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        <% agentOutputHandling obj = new agentOutputHandling();
            obj.clearResults();  %>

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


                        <%
                            String uname = session.getAttribute("userName").toString();
                        %>

                        <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
                        <h5 class="centered"><%=uname%></h5>

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
                                <form  action="AgentResultTimer.jsp" method="POST">

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
                                            <label><input type="checkbox" name="id" value="HotelFiveStar"> Five Star</label>

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
                                    <button type="submit"  class="btn btn-warning" >Search</button>
                                    <br>


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
