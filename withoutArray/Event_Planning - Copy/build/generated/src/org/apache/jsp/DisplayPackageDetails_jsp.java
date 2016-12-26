package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DatabaseOperations.servicePackageHandling;

public final class DisplayPackageDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/headerScripts.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
    _jspx_dependants.add("/footerScripts.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("        <title>e -Eventz</title>\r\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <title>e -Eventz</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!--external css-->\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/zabuto_calendar.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/js/gritter/css/jquery.gritter.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/lineicons/style.css\">    \n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("     <!-- Sweet Alert -->\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sweetAlert/dist/sweetalert.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sweetAlert/dist/sweetalert.css\">\n");
      out.write("      <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    document.getElementById(\"request\").onclick = function () {\r\n");
      out.write("        location.href = \"CustomerRequest.jsp\";\r\n");
      out.write("    };\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--header start-->\n");
      out.write("      <header class=\"header black-bg\">\n");
      out.write("              <div class=\"sidebar-toggle-box\">\n");
      out.write("                  <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\n");
      out.write("              </div>\n");
      out.write("            <!--logo start-->\n");
      out.write("            <a href=\"index.html\" class=\"logo\"><b>EVENTZ</b></a>\n");
      out.write("            <!--logo end-->\n");
      out.write("            <div class=\"nav notify-row\" id=\"top_menu\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-menu\">\n");
      out.write("            \t<ul class=\"nav pull-right top-menu\">\n");
      out.write("                    <li><a class=\"logout\" href=\"index.jsp\">Logout</a></li>\n");
      out.write("            \t</ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("      <!--header end-->\n");
      out.write("      <!--sidebar start-->\n");
      out.write("      <aside>\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("              <!-- sidebar menu start-->\n");
      out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("              ");

                   //   String uname = session.getAttribute("userName").toString();
                      
      out.write("\n");
      out.write("              \t  \n");
      out.write("              \t <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-sam.jpg\" class=\"img-circle\" width=\"60\"></a></p>\n");
      out.write("              \t  <h5 class=\"centered\">");
//=uname 
      out.write("</h5>\n");
      out.write("              \t  \t\n");
      out.write("                  <li class=\"mt\">\n");
      out.write("                      <a class=\"active\" href=\"index.jsp\">\n");
      out.write("                          <i class=\"fa fa-dashboard\"></i>\n");
      out.write("                          <span>Dashboard</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Edit Profile</span>\n");
      out.write("                      </a>\n");
      out.write("                     \n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-search\"></i>\n");
      out.write("                          <span>Search Services</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-list\"></i>\n");
      out.write("                          <span>Request Status</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("              <!-- sidebar menu end-->\n");
      out.write("          </div>\n");
      out.write("      </aside>\n");
      out.write("      <!--sidebar end-->\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("      <!-- **********************************************************************************************************************************************************\r\n");
      out.write("      MAIN CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->\r\n");
      out.write("      <!--main content start-->\r\n");
      out.write("      <section id=\"main-content\">\r\n");
      out.write("          <section class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-lg-9 main-chart\">\r\n");
      out.write("                        <div class=\"row mtbox\">\r\n");
      out.write("                            <h2 class=\"section-heading\" style=\"color: black\" >  Package Generator </h2>   \r\n");
      out.write("                  <h3 class=\"section-heading\">  Enter Your Request </h3>\r\n");
      out.write("                      <br>\r\n");
      out.write("                  \t");
   String Owner="";
             int Contact=0;
             String Email="";
             String Address="" ;
             String City="" ;
             String Province= "" ;
             String lat = "";
             String longt = "";
             String Service = request.getParameter("Service").replaceAll("\\s","");
             String Package = request.getParameter("Package").replaceAll("\\s","");
             session.setAttribute("Service", Service);
             session.setAttribute("Package", Package); 
             servicePackageHandling obj = new servicePackageHandling();
             ResultSet resultServiceDetails = obj.selectPackage(Service, Package);
             ResultSet resultPackagedetails= obj.selectPackageDetails(Service, Package);
             ResultSet images = obj.GetImages("HotelGaladari");
             while(resultServiceDetails.next()){
              Owner = resultServiceDetails.getString("OwnerName");
              Contact = resultServiceDetails.getInt("CNumber");
              Email=resultServiceDetails.getString("email");
              Address=resultServiceDetails.getString("Address");
              lat=resultServiceDetails.getString("Latitude");
              longt=resultServiceDetails.getString("Longitute");
               }  
              
             
      out.write("\r\n");
      out.write("             <input type=\"hidden\" id=\"lati\" value=\"");
      out.print(lat );
      out.write("\" />\r\n");
      out.write("             <input type=\"hidden\" id=\"longtitude\" value=\"");
      out.print(longt );
      out.write("\" />\r\n");
      out.write("             <table style=\"width: 100%\">\r\n");
      out.write("                 <tr>\r\n");
      out.write("                     <td>\r\n");
      out.write("            <div class=\"col-lg-12 text-left\"> \r\n");
      out.write("             \r\n");
      out.write("                 Service: ");
      out.print(Service );
      out.write("  </br>\r\n");
      out.write("                 Package: ");
      out.print(Package );
      out.write("  </br>\r\n");
      out.write("                 Owner : ");
      out.print(Owner );
      out.write(" </br>\r\n");
      out.write("                Address: <p>  ");
      out.print(Address );
      out.write(" </p>\r\n");
      out.write("                 Contact Number: <p>(+94)");
      out.print(Contact );
      out.write(" </p>\r\n");
      out.write("                  \r\n");
      out.write("                  <p> Package Includes Following Services:  </p>\r\n");
      out.write("                   <ul >\r\n");
      out.write("                 ");
 
                  while(resultPackagedetails.next()){
                    String Options = resultPackagedetails.getString("OptionDes"); 
      out.write("\r\n");
      out.write("                    <li>  ");
      out.print(Options );
      out.write(" </li>\r\n");
      out.write("                 ");

                    }
                 
      out.write("\r\n");
      out.write("                   </ul> \r\n");
      out.write("                   <br/> <br/>       \r\n");
      out.write("             </div>\r\n");
      out.write("                   </td>\r\n");
      out.write("                   <td>\r\n");
      out.write("                       <script type=\"text/javascript\">\r\n");
      out.write("           function initMap() {\r\n");
      out.write("             var lati = parseFloat(document.getElementById('lati').value);\r\n");
      out.write("             var longti=parseFloat( document.getElementById('longtitude').value);\r\n");
      out.write("        var uluru = {lat:lati,lng: longti};\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("          zoom: 7,\r\n");
      out.write("          center: uluru\r\n");
      out.write("             });\r\n");
      out.write("        var marker = new google.maps.Marker({\r\n");
      out.write("          position: uluru,\r\n");
      out.write("          map: map\r\n");
      out.write("        });\r\n");
      out.write("}\r\n");
      out.write("    </script>\r\n");
      out.write("                        \r\n");
      out.write("            <div class=\"col-lg-12 text-right\" style=\"height: 400px; width:600px \" id=\"map\">       \r\n");
      out.write("                       \r\n");
      out.write("            </div>    \r\n");
      out.write("                   </td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("             </table>\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-warning\" id=\"gallery\" >View Image Galary</button>  \r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-warning\" id=\"request\">Submit a request</button>\r\n");
      out.write("                  <a href=\"CustomerRequest.jsp\" >Submit a request</a>\r\n");
      out.write("                  \r\n");
      out.write("                  \t</div><!-- /row mt -->\t\r\n");
      out.write("      <!-- **********************************************************************************************************************************************************\r\n");
      out.write("      RIGHT SIDEBAR CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->                  \r\n");
      out.write("                </div><! --/row -->\r\n");
      out.write("          </section>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <!--main content end-->\r\n");
      out.write("      <!--footer start-->\r\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer class=\"site-footer\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    EventZ@2016\n");
      out.write("                    <a href=\"index.html#\" class=\"go-top\">\n");
      out.write("                        <i class=\"fa fa-angle-up\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("</footer>\n");
      out.write("\r\n");
      out.write("      <!--footer end-->\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("   \r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <!-- js placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery-1.8.3.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.sparkline.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--common script for all pages-->\n");
      out.write("        <script src=\"assets/js/common-scripts.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/gritter/js/jquery.gritter.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/gritter-conf.js\"></script>\n");
      out.write("\n");
      out.write("        <!--script for this page-->\n");
      out.write("        <script src=\"assets/js/sparkline-chart.js\"></script>    \n");
      out.write("        <script src=\"assets/js/zabuto_calendar.js\"></script>\t\n");
      out.write("\n");
      out.write("\r\n");
      out.write("          <!-- Gmap API -->              \r\n");
      out.write("    <script async defer\r\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyA8Kt4W7XfkrRObsgWdDbRjhN_BGhr0aJE&callback=initMap\">\r\n");
      out.write("    </script> \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
