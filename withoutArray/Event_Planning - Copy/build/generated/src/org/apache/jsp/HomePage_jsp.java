package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>e-Eventz</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("    <!-- Plugin CSS -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/magnific-popup/magnific-popup.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Theme CSS -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/css/creative.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span> Menu <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"#page-top\">Eventz</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#about\">About</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#services\">Services</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#portfolio\">Portfolio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#contact\">SignUp</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"header-content\">\r\n");
      out.write("            <div class=\"header-content-inner\">\r\n");
      out.write("                <h1 id=\"homeHeading\">Looking for services to host your event?\r\n");
      out.write("                \r\n");
      out.write("              </h1>\r\n");
      out.write("                <hr>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"#about\" class=\"btn btn-primary btn-xl page-scroll\">Find Out More</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"bg-primary\" id=\"about\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading\">We've got what you need!</h2>\r\n");
      out.write("                    <hr class=\"light\">\r\n");
      out.write("                    <p class=\"text-faded\">Try our service locating agents and find the best to suit your needs</p>\r\n");
      out.write("                    <a href=\"#services\" class=\"page-scroll btn btn-default btn-xl sr-button\">Get Started!</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"services\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading\">At Your Service</h2>\r\n");
      out.write("                    <hr class=\"primary\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 text-center\">\r\n");
      out.write("                    <div class=\"service-box\"><i class=\"fa fa-4x fa-search text-primary sr-icons\" aria-hidden=\"true\"></i>\r\n");
      out.write("<!--                        <i class=\"fa fa-4x fa-diamond text-primary sr-icons\"></i>\r\n");
      out.write("-->                       <h3>Agent Search</h3>\r\n");
      out.write("                        <p class=\"text-muted\">Simply tell our agents what you need. They will search for you..</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 text-center\">\r\n");
      out.write("                    <div class=\"service-box\">\r\n");
      out.write("                        <i class=\"fa fa-4x fa fa-check text-primary sr-icons\"></i>\r\n");
      out.write("                        <h3>Get Confirmed</h3>\r\n");
      out.write("                        <p class=\"text-muted\">Confirm your bookings then and there</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 text-center\">\r\n");
      out.write("                    <div class=\"service-box\">\r\n");
      out.write("                        <i class=\"fa fa-4x fa-newspaper-o text-primary sr-icons\"></i>\r\n");
      out.write("                        <h3>Up to Date</h3>\r\n");
      out.write("                        <p class=\"text-muted\">Check for the updates regulary</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 text-center\">\r\n");
      out.write("                    <div class=\"service-box\">\r\n");
      out.write("                        <i class=\"fa fa-4x fa-heart text-primary sr-icons\"></i>\r\n");
      out.write("                        <h3>Share the Experience</h3>\r\n");
      out.write("                        <p class=\"text-muted\">Simply tell us what you feel!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"no-padding\" id=\"portfolio\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row no-gutter popup-gallery\">\r\n");
      out.write("             <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                   \r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/img/portfolio/thumbnails/1.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("                        <div class=\"portfolio-box-caption\">\r\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\r\n");
      out.write("                                <div class=\"project-category text-faded\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"project-name\">Cooperate Events</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                    \r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/img/portfolio/thumbnails/2.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("                        <div class=\"portfolio-box-caption\">\r\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\r\n");
      out.write("                                <div class=\"project-category text-faded\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"project-name\">Birthday Parties</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                   \r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/img/portfolio/thumbnails/3.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("                        <div class=\"portfolio-box-caption\">\r\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\r\n");
      out.write("                                <div class=\"project-category text-faded\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"project-name\">Cooperate Events</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                   \r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/img/portfolio/thumbnails/4.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("                        <div class=\"portfolio-box-caption\">\r\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\r\n");
      out.write("                                <div class=\"project-category text-faded\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"project-name\">Trip Organiser</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                    \r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/img/portfolio/thumbnails/5.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("                        <div class=\"portfolio-box-caption\">\r\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\r\n");
      out.write("                                <div class=\"project-category text-faded\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"project-name\">\r\n");
      out.write("                                    Project Name\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                    \r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/img/portfolio/thumbnails/6.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("                        <div class=\"portfolio-box-caption\">\r\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\r\n");
      out.write("                                <div class=\"project-category text-faded\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"project-name\">Other Services</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <aside class=\"bg-dark\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <div class=\"call-to-action\">\r\n");
      out.write("                <h2>Login  or Sign Up!</h2>\r\n");
      out.write("                <a href=\"UserRegistration.jsp\" class=\"btn btn-default btn-xl sr-button\">Register Now</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"contact\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading\">Already registered? Then sign in to see your updates!</h2>\r\n");
      out.write("                    <hr class=\"primary\">\r\n");
      out.write("                    <form class=\"form-inline\" action=\"dashboard.jsp\" method=\"POST\">\r\n");
      out.write("                           <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"sr-only\" for=\"exampleInputEmail3\">Email address</label>\r\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Enter email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                                 <div class=\"form-group\">\r\n");
      out.write("                                 <label class=\"sr-only\" for=\"exampleInputPassword3\">Password</label>\r\n");
      out.write("                                 <input type=\"password\" class=\"form-control\" name=\"PW\" placeholder=\"Password\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                             <div class=\"form-check\">\r\n");
      out.write("                                  <label class=\"form-check-label\">\r\n");
      out.write("                                   <input class=\"form-check-input\" type=\"checkbox\"> Remember me\r\n");
      out.write("                                    </label>\r\n");
      out.write("                              </div>\r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\r\n");
      out.write("</form>\r\n");
      out.write("                              </div>\r\n");
      out.write("                            \r\n");
      out.write("                                  \r\n");
      out.write("                              </div>\r\n");
      out.write("                                \r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Plugin JavaScript -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/scrollreveal/scrollreveal.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/vendor/magnific-popup/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Theme JavaScript -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style/js/creative.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
