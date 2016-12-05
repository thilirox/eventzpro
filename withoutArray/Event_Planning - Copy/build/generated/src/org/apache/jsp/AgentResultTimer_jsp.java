package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import AgentHandling.ServiceManager;

public final class AgentResultTimer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <title>e -Eventz</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/zabuto_calendar.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/js/gritter/css/jquery.gritter.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/lineicons/style.css\">    \r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/js/chart-master/Chart.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("     <!-- Sweet Alert -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sweetAlert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sweetAlert/dist/sweetalert.css\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");


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


      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Agent Activation -->\r\n");
      out.write(" ");
 
     
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
 
      out.write("\r\n");
      out.write("  <section id=\"container\" >\r\n");
      out.write("     \r\n");
      out.write("      <!--header start-->\r\n");
      out.write("      <header class=\"header black-bg\">\r\n");
      out.write("              <div class=\"sidebar-toggle-box\">\r\n");
      out.write("                  <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            <!--logo start-->\r\n");
      out.write("            <a href=\"index.html\" class=\"logo\"><b>EVENTZ</b></a>\r\n");
      out.write("            <!--logo end-->\r\n");
      out.write("            <div class=\"nav notify-row\" id=\"top_menu\">\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"top-menu\">\r\n");
      out.write("            \t<ul class=\"nav pull-right top-menu\">\r\n");
      out.write("                    <li><a class=\"logout\" href=\"HomePage.jsp\">Logout</a></li>\r\n");
      out.write("            \t</ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("      <!--header end-->\r\n");
      out.write("      <!--sidebar start-->\r\n");
      out.write("      <aside>\r\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
      out.write("              <!-- sidebar menu start-->\r\n");
      out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\r\n");
      out.write("              ");

                      String uname = session.getAttribute("userName").toString();
                      
      out.write("\r\n");
      out.write("              \t  \r\n");
      out.write("              \t <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-sam.jpg\" class=\"img-circle\" width=\"60\"></a></p>\r\n");
      out.write("              \t  <h5 class=\"centered\">");
      out.print(uname );
      out.write("</h5>\r\n");
      out.write("              \t  \t\r\n");
      out.write("                  <li class=\"mt\">\r\n");
      out.write("                      <a class=\"active\" href=\"index.html\">\r\n");
      out.write("                          <i class=\"fa fa-dashboard\"></i>\r\n");
      out.write("                          <span>Dashboard</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("\r\n");
      out.write("                  <li class=\"sub-menu\">\r\n");
      out.write("                      <a href=\"javascript:;\" >\r\n");
      out.write("                          <i class=\"fa fa-user\"></i>\r\n");
      out.write("                          <span>Edit Profile</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                     \r\n");
      out.write("                  </li>\r\n");
      out.write("\r\n");
      out.write("                  <li class=\"sub-menu\">\r\n");
      out.write("                      <a href=\"javascript:;\" >\r\n");
      out.write("                          <i class=\"fa fa-search\"></i>\r\n");
      out.write("                          <span>Search Services</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                      <a href=\"javascript:;\" >\r\n");
      out.write("                          <i class=\"fa fa-list\"></i>\r\n");
      out.write("                          <span>Request Status</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("              </ul>\r\n");
      out.write("              <!-- sidebar menu end-->\r\n");
      out.write("          </div>\r\n");
      out.write("      </aside>\r\n");
      out.write("      <!--sidebar end-->\r\n");
      out.write("      \r\n");
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
      out.write("                            <h2 class=\"section-heading\" style=\"color: black\" >   </h2>   \r\n");
      out.write("                  \r\n");
      out.write("                      <br>\r\n");
      out.write("                      \r\n");
      out.write("                      <script type=\"text/javascript\">\r\n");
      out.write("                          function Redirect() {\r\n");
      out.write("                            window.location=\"displayPackages.jsp\";\r\n");
      out.write("                         }\r\n");
      out.write("                         setTimeout('Redirect()', 10000);\r\n");
      out.write("                          swal({\r\n");
      out.write("                            title: \"Request Processed!\",\r\n");
      out.write("                            text: \"Please wait a while till our agents create packages for You\",\r\n");
      out.write("                            imageUrl: \"style/images/loader.gif\"\r\n");
      out.write("                          });\r\n");
      out.write("\r\n");
      out.write("                      </script>\r\n");
      out.write("                  \t\r\n");
      out.write("                \r\n");
      out.write("                       <div id=\"div1\" style=\"visibility:hidden;\">\r\n");
      out.write("                       <a href=\"displayPackagesII.jsp\" >Click here</a>\r\n");
      out.write("                       \r\n");
      out.write("                       <div> \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                  \t</div><!-- /row mt -->\t\r\n");
      out.write("                  \r\n");
      out.write("                      \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("      <!-- **********************************************************************************************************************************************************\r\n");
      out.write("      RIGHT SIDEBAR CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("              </div><! --/row -->\r\n");
      out.write("          </section>\r\n");
      out.write("      </section>\r\n");
      out.write("      \r\n");
      out.write("      <!--footer end-->\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.sparkline.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--common script for all pages-->\r\n");
      out.write("    <script src=\"assets/js/common-scripts.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/gritter/js/jquery.gritter.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/gritter-conf.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--script for this page-->\r\n");
      out.write("    <script src=\"assets/js/sparkline-chart.js\"></script>    \r\n");
      out.write("\t<script src=\"assets/js/zabuto_calendar.js\"></script>\t\r\n");
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
