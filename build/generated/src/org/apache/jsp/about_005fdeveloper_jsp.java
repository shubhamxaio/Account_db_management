package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005fdeveloper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/w3.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Developers</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"w3-container w3-padding-64 w3-center\">\n");
      out.write("            <h2>OUR TEAM</h2>\n");
      out.write("            <p>Meet the team - who developed this software:</p>\n");
      out.write("            <div class=\"w3-row test\"><br>\n");
      out.write("\n");
      out.write("                <div class=\"w3-quarter\">\n");
      out.write("                    <img src=\"img/shubham.jpg\" alt=\"Boss\" style=\"width:50%\" class=\"w3-circle\">\n");
      out.write("                    <h3>Shubham Srivastava</h3>\n");
      out.write("                    <p>Front and backend Developer</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"w3-quarter\">\n");
      out.write("                    <img src=\"img/prashant.jpg\" alt=\"Boss\" style=\"width:50%\" class=\"w3-circle\">\n");
      out.write("                    <h3>Prashant Pandey</h3>\n");
      out.write("                    <p>Web Designer</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"w3-quarter\">\n");
      out.write("                    <img src=\"img/vishal.jpg\" alt=\"Boss\" style=\"width:50%\" class=\"w3-circle\">\n");
      out.write("                    <h3>Vishal Kumar</h3>\n");
      out.write("                    <p>Backend Coder and Developer</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"w3-quarter\">\n");
      out.write("                    <img src=\"img/kshitij.jpg\" alt=\"Boss\" style=\"width:50%\" class=\"w3-circle\">\n");
      out.write("                    <h3>Kshitij Gupta</h3>\n");
      out.write("                    <p>DataBase management</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"w3-container w3-padding-64\">\n");
      out.write("            <h2 class=\"w3-padding-bottom w3-blue\">Contact Us</h2>\n");
      out.write("            <div class=\"w3-row\">\n");
      out.write("                <div class=\"w3-col m5\">\n");
      out.write("                    <h3>Address</h3>\n");
      out.write("                    \n");
      out.write("                    <p><i class=\"fa fa-map-marker w3-text-teal w3-xlarge\"></i>&nbsp;&nbsp;Lucknow, India</p>\n");
      out.write("                    <p><i class=\"fa fa-phone w3-text-teal w3-xlarge\"></i>&nbsp;&nbsp;+91-**********</p>\n");
      out.write("                    <p><i class=\"fa fa-envelope-o w3-text-teal w3-xlarge\"></i>&nbsp;&nbsp;test@test.com</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-col m7\">\n");
      out.write("                    <form class=\"w3-form\">\n");
      out.write("                        <div class=\"w3-group\">      \n");
      out.write("                            <input class=\"w3-input\" style=\"width:100%;\" type=\"text\" required>\n");
      out.write("                            <label class=\"w3-label\" style=\"color: #337ab7\">Username</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-group\">      \n");
      out.write("                            <input class=\"w3-input\" style=\"width:100%;\" type=\"email\" required>\n");
      out.write("                            <label class=\"w3-label\" style=\"color: #337ab7\">Email</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-group\">      \n");
      out.write("                            <input class=\"w3-input\" style=\"width:100%;\" type=\"text\" required>\n");
      out.write("                            <label class=\"w3-label\"style=\"color: #337ab7\">Subject</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-group\">      \n");
      out.write("                            <textarea class=\"w3-input\" style=\"width:100%;\" required></textarea>\n");
      out.write("                            <label class=\"w3-label\"style=\"color: #337ab7\">Message</label>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"w3-btn w3-right w3-theme w3-blue\">Send</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
