<%-- 
    Document   : ServiceImageGallery
    Created on : Nov 23, 2016, 3:15:01 PM
    Author     : Thilini.Samaranayake
--%>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <%@ include file="headerScripts.jsp" %>
    <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
    <script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}
</script>

  </head>

  <body>

    
    <!-- Agent Activation -->
 
  <section id="container" >
     
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
                            <h2 class="section-heading" style="color: black" > Gallery  </h2>   
                  
                      <br>
                      
                     <div class="w3-content w3-display-container">
  <img class="mySlides" src="style/images/big1.jpg" style="width:100%">
  <img class="mySlides" src="style/images/big2.jpg" style="width:100%">
  <img class="mySlides" src="style/images/big3.jpg" style="width:100%">
  <img class="mySlides" src="style/images/big4.jpg" style="width:100%">

  <a class="w3-btn-floating w3-display-left" onclick="plusDivs(-1)">&#10094;</a>
  <a class="w3-btn-floating w3-display-right" onclick="plusDivs(1)">&#10095;</a>
</div>
                  	
                
                       
                      
                      
                  	</div><!-- /row mt -->
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
       <%@include file="footerScripts.jsp" %> </div><! --/row -->
          </section>
      </section>
  </section>
      <%@include file="footerScripts.jsp" %>	
	 </body>
</html>
