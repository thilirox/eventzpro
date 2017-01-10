<%-- 
    Document   : serviceDashboard
    Created on : Nov 20, 2016, 9:30:41 AM
    Author     : Thilini.Samaranayake
--%>

<%@page import="DatabaseOperations.userHandling"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseOperations.serviceReqHandling"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
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

   
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/style-responsive.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/assets/js/chart-master/Chart.js"></script>
     <!-- Sweet Alert -->
  <script src="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.min.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.css">
   
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">
    <%  
        String uid = "";
        String username="";
        String email = request.getParameter("email");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx"+email);
        String PW = request.getParameter("PW");
        userHandling user = new userHandling();
        String usertype = user.getUser(email, PW).toString();
        ResultSet userDetails = user.getUserDetails(email, PW);
        while(userDetails.next()){
         uid =userDetails.getString("uid");
         username= userDetails.getString("UName");
        }
        session.setAttribute("userID", uid);
        session.setAttribute("userName", username);
        
         
        
        //String usertype= "customer";
       // if (abc==usertype){System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbb");} else {System.out.println(abc + "vvvv" +usertype);}
        System.out.println("cccccccccccc"+usertype);
      String service = "HotelGaladari";  
      serviceReqHandling obj = new serviceReqHandling();
      int newOrder = obj.getReqCount(service,"Requested");  
      int confirmedOrder = obj.getReqCount(service,"Confrimed");
      int completedOrder = obj.getReqCount(service,"Completed");%>
    
     <header class="header black-bg"> 
            <!--logo start-->
            <a href="index.html" class="logo"><b>EVENTZ</b></a>
            <!--logo end-->
           
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="index.jsp">Logout</a></li>
            	</ul>
            </div>
        </header>
      <% System.out.println("vvvvvvvvvvvvvvvvvvvvvvv"+usertype);
        if ("Service".equals(usertype) ){ %>
    <section  id="about" >
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Hi <%=username %></h2>
                     <hr class="primary">
                     <br/>
                 <div class="row">	
                     <div class="row mtbox">
                         <a href="" >
                  		<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-list-alt"></span>
					  			<h3>update</h3>
                  			</div>
					  		 <p>Update profile</p>
                  		</div>
                                                      </a>
                         <a href="newServiceOrders.jsp" >
                  		<div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-edit"></span>
					  			<h3><%=newOrder %></h3>
                  			</div>
					  			<p>New notifications.To be confirmed items.</p>
                  		</div>
                               </a>
                         <a href="confirmedServiceOrders.jsp">
                  		<div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-check"></span>
					  			<h3><%=confirmedOrder %></h3>
                  			</div>
					  			<p> Confirmed. Not Completed.</p>
                  		</div>
                         </a>
                         <a href="completedServiceOders.jsp">
                         
                                <div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-thumbs-up"></span>
					  			<h3><%=completedOrder %></h3>
                  			</div>
					  			<p>Completed.</p>
                  		</div>
                         </a>
                         
                  		<div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-calendar"></span>
                                                                <% String timeStamp = new SimpleDateFormat("yy-MM-dd").format(Calendar.getInstance().getTime());%>
					  			<h3><%=timeStamp %></h3>
                  			</div>
					  			<p>My Calender.</p>
                  		</div>
                  	
                  	</div>
                  </div>
                 </div>
                   
                </div>
            </div>
        
        <div class="container">
            <div class="row">
                
            </div>
        </div>
    </section>
   <%}
else if ("customer".equals(usertype)) { %>
     <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Hi <%=username %></h2>
                     <hr class="primary">
                     <br/>
                 <div class="row">	
                     <div class="row mtbox">
                         <a href="registerUser.jsp" >
                  		<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-user"></span>
					  			<br/>
                  			</div>
					  		 <p>Update profile</p>
                  		</div>
                                                      </a>
                         <a href="manualPKSearch.jsp" >
                  		<div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-search"></span>
					  			<br/>
                  			</div>
					  			<p>Search Services </p>
                  		</div>
                               </a>
                         <a href="automaticPG.jsp">
                  		<div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-gift"></span>
					  			<br/>
                  			</div>
					  			<p>Automatic Package generator</p>
                  		</div>
                         </a>
                         <a href="DisplayPckCusView.jsp">
                         
                                <div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-list"></span>
					  			<br/>
                  			</div>
					  			<p>Request Status </p>
                  		</div>
                         </a>
                         <a href="customerMessages.jsp">
                                           		<div class="col-md-2 col-sm-2 box0">
                  			<div class="box1">
					  			<span class="glyphicon glyphicon-envelope"></span>
                                                                <br/>
                  			</div>
					  			<p>Leave a Message.</p>
                  		</div>
                         </a>
                  	</div>
                  </div>
                 </div>
                   
                </div>
            </div>
        
        <div class="container">
            <div class="row">
                
            </div>
        </div>
    </section>

    <% } 
       else{   %>
      <script type="text/javascript">
        
            function Redirect() {
               window.location="HomePage.jsp";
            }
            swal("Oops...", "Wrong User Name and Password!", "Check Again");
          
            setTimeout('Redirect()', 10000);
         //-->
      </script>

 <%}
 %>

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
    <script class="include" type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.sparkline.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/gritter-conf.js"></script>

     
	
	

	
	

</body>

</html>
