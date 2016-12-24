<%-- 
    Document   : header
    Created on : Dec 6, 2016, 11:03:55 AM
    Author     : Thilini.Samaranayake
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
                   //   String uname = session.getAttribute("userName").toString();
                      %>
              	  
              	 <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered"><%//=uname %></h5>
              	  	
                  <li class="mt">
                      <a class="active" href="index.jsp">
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
