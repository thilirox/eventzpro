<%-- 
    Document   : FindPackages
    Created on : Sep 5, 2016, 12:13:35 AM
    Author     : Thilini.Samaranayake
--%>

<%@page import="DatabaseOperations.agentOutputHandling"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.Date" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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

</head>

<body id="page-top">
    <% agentOutputHandling obj = new agentOutputHandling();
    obj.clearResults();  %>
    
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Eventz</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">About</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Services</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#portfolio">Portfolio</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">SignUp</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    <section class="bg-primary" id="about">
        <div class="container">
              <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <div class="form-group row">
<div>
                 
                </div>
                </div>
            </div>
        </div>
    </section>
    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">At Your Service</h2>
                     <hr class="primary">
                     <br/>
                    <form  action="AgentResultTimer.jsp" method="POST">
                
                      <input class="form-control" type="text" value="Enter your budget" name="txtbudget">
                      <br>
                       <input class="form-control" type="text" value="No of guests" name="txtguest">
                      <br>
                      
                      <br>
                      <h2 class="section-heading">  Choose the services you need for your package </h2>
                      <br>
                            <div class="checkbox">
                                  <label><input type="checkbox" name="id" value="Hotel">Hotels</label>
                            </div>
                            <div class="checkbox">
                                  <label><input type="checkbox" name="id" value="Photography">Photography</label>
                                </div>
                            
                            <div class="checkbox">
                                  <label><input type="checkbox" name="id" value="decorations">Decorations</label>
                                </div>
                            <div class="checkbox">
                                  <label><input type="checkbox" name="id" value="Music">Music & Sounds</label>
                                </div>
                            <div class="checkbox">
                                  <label><input type="checkbox" name="id" value="Catering">Cutlary and Catering</label>
                                </div>
                      <br>
                      
                      <button type="submit"  class="btn btn-primary btn-xl page-scroll" >Search</button>
                      <br>
                      
                     
                      </form>
                   
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                
            </div>
        </div>
    </section>

    

    

    <aside class="bg-dark">
        <div class="container text-center">
            
        </div>
    </aside>

   

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
