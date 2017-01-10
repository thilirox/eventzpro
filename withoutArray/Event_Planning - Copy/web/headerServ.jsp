<%-- 
    Document   : headers
    Created on : Jan 9, 2017, 10:18:51 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                    <li><a class="logout" href="index.jsp">Logout</a></li>
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
                    // String uname = session.getAttribute("userName").toString();
                    // <h5 class="centered"><%=//uname %> </h5>
                      %>
              	  
              	 <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	 
              	  	
                  <li class="mt">
                      <a  href="index.jsp">
                          <i class="fa fa-dashboard"></i>
                          <span>Dashboard</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="registerUser.jsp" >
                          <i class="fa fa-user"></i>
                          <span>Edit Profile</span>
                      </a>
                     
                  </li>

                  <li class="sub-menu">
                      <a href="manualPKSearch.jsp" >
                          <i class="icon-folder-close-alt"></i>
                          <span>Pending Services</span>
                      </a>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-calendar-check-o"></i>
                          <span>Confirmed Services</span>
                      </a>
                  </li>
                  
                <li class="sub-menu">
                      <a href="requestStatus.jsp" >
                          <i class="fa fa-thumbs-o-up"></i>
                          <span>Completed Services</span>
                      </a>
                  </li>
                  

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>