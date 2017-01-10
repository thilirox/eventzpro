package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerServ_jsp extends org.apache.jasper.runtime.HttpJspBase
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

                    // String uname = session.getAttribute("userName").toString();
                    // <h5 class="centered"><%=//uname 
      out.write(" </h5>\n");
      out.write("                      %>\n");
      out.write("              \t  \n");
      out.write("              \t <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-sam.jpg\" class=\"img-circle\" width=\"60\"></a></p>\n");
      out.write("              \t \n");
      out.write("              \t  \t\n");
      out.write("                  <li class=\"mt\">\n");
      out.write("                      <a  href=\"index.jsp\">\n");
      out.write("                          <i class=\"fa fa-dashboard\"></i>\n");
      out.write("                          <span>Dashboard</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"registerUser.jsp\" >\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Edit Profile</span>\n");
      out.write("                      </a>\n");
      out.write("                     \n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"manualPKSearch.jsp\" >\n");
      out.write("                          <i class=\"icon-folder-close-alt\"></i>\n");
      out.write("                          <span>Pending Services</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-calendar-check-o\"></i>\n");
      out.write("                          <span>Confirmed Services</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"requestStatus.jsp\" >\n");
      out.write("                          <i class=\"fa fa-thumbs-o-up\"></i>\n");
      out.write("                          <span>Completed Services</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("              <!-- sidebar menu end-->\n");
      out.write("          </div>\n");
      out.write("      </aside>");
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
