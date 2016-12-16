<%-- 
    Document   : AgentResultTimer
    Created on : Nov 23, 2016, 1:31:38 PM
    Author     : Thilini.Samaranayake
--%>

<%@page import="AgentHandling.ServiceManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <%@ include file="headerScripts.jsp" %>
  </head>

  <body>
<%

String select[] = request.getParameterValues("id");
String header="";
int headersize = select.length;
String totalSelection="";
int x=0;
if (select != null && select.length != 0) {

for (int i = 0; i < select.length; i++) {
totalSelection = totalSelection+select[i];
}

System.out.println(totalSelection);
}
if(totalSelection.contains("Hotel")){
    x=x+1;
}
if(totalSelection.contains("Photography")){
    x=x+1;
}
if(totalSelection.contains("decorations")){
    x=x+1;
}
if(totalSelection.contains("Music")){
    x=x+1;
}
if(totalSelection.contains("Catering")){
    x=x+1;
}
for (int i = 0; i < x-1 ; i++) {
header = header+"join_sales";
}

%>
    
    <!-- Agent Activation -->
 <% 
     
   //  outputFormating format= new outputFormating();
    String budgetIn
 = request.getParameter("txtbudget"); 
    String guestIn = request.getParameter("txtguest");
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+guestIn);
    int guest = Integer.parseInt(guestIn);
    
    ServiceManager manager = new ServiceManager(budgetIn,guest,totalSelection,header );
    
    manager.start(); 
   // CustomerAgent customer = new CustomerAgent();
   // ArrayList OutList = ArrayOut.LIST;
   // String print = new String();
 %>
  <section id="container" >
     
      <%@ include file="header.jsp" %>
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">

              <div class="row">
                  <div class="col-lg-9 main-chart">
                        <div class="row mtbox">
                            <h2 class="section-heading" style="color: black" >   </h2>   
                  
                      <br>
                      
                      <script type="text/javascript">
                          function Redirect() {
                            window.location="displayPackages.jsp";
                         }
                         setTimeout('Redirect()', 10000);
                          swal({
                            title: "Request Processed!",
                            text: "Please wait a while till our agents create packages for You",
                            imageUrl: "style/images/loader.gif"
                          });

                      </script>
                  	
                
                       
                      
                      
                  	</div><!-- /row mt -->	
                  
                      
                  
                  
                  
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
                  
                  
              </div><! --/row -->
          </section>
      </section>
      
      
  </section>

      <%@include file="footerScripts.jsp" %>	
	

	
	
  

  </body>
</html>
