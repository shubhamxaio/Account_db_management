package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_005fstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    try{
        String emp_username = (String)session.getAttribute("emp_username");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
        if(emp_username.equalsIgnoreCase(null))
        {
            response.sendRedirect("index.html");
        }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Account Office</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            #lst{\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\" style=\"background-color: #337ab7\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span> \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"account_staff.jsp\" id=\"lst\"><span class=\"glyphicon glyphicon-home\"></span> Home</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"submit_fee.jsp\" id=\"lst\" target=\"myIFrame\">Submit Fees</a></li> \n");
      out.write("                        <li><a href=\"new_student_account.jsp\" id=\"lst\" target=\"myIFrame\">Register New Student Account</a></li>\n");
      out.write("                        <li><a href=\"#\" id=\"lst\" target=\"myIFrame\">Update An Existing Student Account</a></li>\n");
      out.write("                        <li><a href=\"#\" id=\"lst\" target=\"myIFrame\">Register Faculty Detail</a></li>\n");
      out.write("                        <li><a href=\"#\" id=\"lst\" target=\"myIFrame\">Check Status of Fee</a></li>\n");
      out.write("                        <li>\n");
      out.write("                        <a href=\"#\" id=\"lst\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Profile <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li style=\"background-color: #337ab7\">\n");
      out.write("                                <a href=\"changepass.jsp\" id=\"lst\" target=\"myIFrame\"><span class=\"glyphicon glyphicon-barcode\"></span> Change Password</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li style=\"background-color: #337ab7\">\n");
      out.write("                                <a href=\"logout.jsp\" id=\"lst\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <iframe width=\"100%\" height=\"580px\" src=\"submit_fee.jsp\" name=\"myIFrame\"></iframe>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    }catch(NullPointerException npe)
    {
        response.sendRedirect("index.html");
    }

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
