<%-- 
    Document   : packageDetails
    Created on : Oct 13, 2016, 3:09:31 PM
    Author     : Thilini.Samaranayake
--%>


<%@page import="CommunicationHandling.mail"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Locale"%>

<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DatabaseOperations.servicePackageHandling"%>
<%@page import="DatabaseOperations.userHandling"%>
<%@page import="DatabaseOperations.serviceReqHandling"%>
<%@page import="CommunicationHandling.mailHandling"%>
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
    <script src="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.min.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/sweetAlert/dist/sweetalert.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    

</head>
<body  style="background-color: black">
       
        <!-- page header -->
      
                 
                  <%
                     String CurrUname="";
                     String CurrUEmail;
                     int CurrUNum=0;
                     String CurrUID="";
                     String ServiceEmail="";
                     int cont = 123456;                    
                     String Service = session.getAttribute("Service").toString();
                     String Package = session.getAttribute("Package").toString();
                     
                    DateFormat format = new SimpleDateFormat("mm-dd-yyyy");
                    java.util.Date reqdate =format.parse(request.getParameter("ReqDate"));
                    java.sql.Date sqlDate = new java.sql.Date(reqdate.getTime());
                     
                    int guests = Integer.parseInt(request.getParameter("guests"));
                    
                    userHandling user = new userHandling();
                    ResultSet cusDetails = user.getUser("thilis");
                    while(cusDetails.next()){
                     CurrUname = cusDetails.getString("FirstName")+""+cusDetails.getString("LastName");
                     CurrUEmail= cusDetails.getString("Email");
                     CurrUNum=cusDetails.getInt("MobileNo");
                     CurrUID=cusDetails.getString("UId");
                     ServiceEmail=cusDetails.getString("EMail");
                                         }
                  //update service req table
                   serviceReqHandling req = new serviceReqHandling();
                   String updated=  req.setCustomerReq(CurrUID,sqlDate,guests,Service,Package , CurrUname,ServiceEmail);
                  
                   if ("Success".equals(updated) ){
                   %>
              
                       <script type="text/javascript">
     function Redirect() {
               window.location="CustomerRequest.jsp";
            }
            setTimeout('Redirect()', 10000);
           // swal("Oops...", "Wrong User Name and Password!", "Check Again");
          swal("Success!", "Your Request Was Submitted and a Mail was triggered to Service Provider", "success");
            
         //-->  
    
      
   </script>
                       
                  
                   <% }
else {%> 
                   
   <%

}
                         
                   servicePackageHandling serObj = new servicePackageHandling();
                    ResultSet serviceSet=  serObj.selectPackage(Service, Package);
                    while(serviceSet.next()){    
                    ServiceEmail= serviceSet.getString("email");
                    }
                    //send email to service provider
                  mail mailToService = new mail();
                  mailToService.notifyServiceProvider("thilisamaranayake@gmail.com");
              
               %>
                  
                   
                     
  
                    
                    
                    
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
