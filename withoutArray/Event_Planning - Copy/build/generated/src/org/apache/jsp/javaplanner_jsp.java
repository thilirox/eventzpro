package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dhtmlx.planner.*;
import com.dhtmlx.planner.data.*;

public final class javaplanner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


           String getPlanner(HttpServletRequest request) throws Exception {
           DHXPlanner s = new DHXPlanner("./codebase/", DHXSkin.TERRACE);
           s.setWidth(900);
            
           s.setInitialDate(2013, 0, 21);
           s.load("events.jsp", DHXDataFormat.JSON);
           return s.render();
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
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
      out.write("    \n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/chart-master/Chart.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>  \n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    <section id=\"container\" >\n");
      out.write("     \n");
      out.write("      <!--header start-->\n");
      out.write("      <header class=\"header black-bg\">\n");
      out.write("              <div class=\"sidebar-toggle-box\">\n");
      out.write("                  <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\n");
      out.write("              </div>\n");
      out.write("            <!--logo start-->\n");
      out.write("            <a href=\"index.html\" class=\"logo\"><b>EVENTZ</b></a>\n");
      out.write("            <!--logo end-->\n");
      out.write("            <div class=\"nav notify-row\" id=\"top_menu\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-menu\">\n");
      out.write("            \t<ul class=\"nav pull-right top-menu\">\n");
      out.write("                    <li><a class=\"logout\" href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("            \t</ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("      <!--header end-->\n");
      out.write("       <aside>\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("              <!-- sidebar menu start-->\n");
      out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("              \n");
      out.write("             \t ");

                     // String uname = session.getAttribute("userName").toString();
                      
      out.write("\n");
      out.write("              \t  \n");
      out.write("              \t <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-sam.jpg\" class=\"img-circle\" width=\"60\"></a></p>\n");
      out.write("              \t  <h5 class=\"centered\">");
//=uname 
      out.write("</h5>\n");
      out.write("              \t  \t\n");
      out.write("                  <li class=\"mt\">\n");
      out.write("                      <a class=\"active\" href=\"index.html\">\n");
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
      out.write("     \n");
      out.write("      <!-- **********************************************************************************************************************************************************\n");
      out.write("      MAIN CONTENT\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("      <!--main content start-->\n");
      out.write("      <section id=\"main-content\">\n");
      out.write("          <section class=\"wrapper\">\n");
      out.write("\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-lg-9 main-chart\">\n");
      out.write("                        \n");
      out.write("    <div style=\"height: 700px; width: 400 px\" class=\"planner\" id=\"planner\">");
      out.print( getPlanner(request) );
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!-- /row mt -->\t\n");
      out.write("                  \n");
      out.write("                      \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("      <!-- **********************************************************************************************************************************************************\n");
      out.write("      RIGHT SIDEBAR CONTENT\n");
      out.write("      *********************************************************************************************************************************************************** -->                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </div><! --/row -->\n");
      out.write("          </section>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("      <!--main content end-->\n");
      out.write("      <!--footer start-->\n");
      out.write("      <footer class=\"site-footer\">\n");
      out.write("          <div class=\"text-center\">\n");
      out.write("             EventZ@2016\n");
      out.write("              <a href=\"index.html#\" class=\"go-top\">\n");
      out.write("                  <i class=\"fa fa-angle-up\"></i>\n");
      out.write("              </a>\n");
      out.write("          </div>\n");
      out.write("      </footer>\n");
      out.write("      <!--footer end-->\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery-1.8.3.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.sparkline.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--common script for all pages-->\n");
      out.write("    <script src=\"assets/js/common-scripts.js\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/gritter/js/jquery.gritter.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/gritter-conf.js\"></script>\n");
      out.write("\n");
      out.write("    <!--script for this page-->\n");
      out.write("    <script src=\"assets/js/sparkline-chart.js\"></script>    \n");
      out.write("\t<script src=\"assets/js/zabuto_calendar.js\"></script>\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
