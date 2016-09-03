package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fdirector_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        String adminusername = (String)session.getAttribute("adminusername");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
        if(adminusername.equalsIgnoreCase(null))
        {
            response.sendRedirect("index.html");
        }
        
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Registration for director</title>\n");
      out.write("\t<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\" style=\"background-color: #337ab7; color:#ffffff\">\n");
      out.write("            <h1 class=\"col-md-offset-3\">Registration For Director</h1>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("\t<form method=\"post\" action=\"RegisterDirector\" class=\"col-md-offset-1\">\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">User Name</label>\n");
      out.write("\t\t<input type=\"text\" name=\"username\" placeholder=\"Username\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("            </div><br/>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("\t\t<label style=\"color: #337ab7\">First Name</label>\n");
      out.write("                <input type=\"text\" name=\"first_name\" placeholder=\"First Name\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Last Name</label>\n");
      out.write("                <input type=\"text\" name=\"last_name\" placeholder=\"Last Name\" class=\"form-control\">\n");
      out.write("            </div><br/>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("\t\t<label style=\"color: #337ab7\">College</label>\n");
      out.write("                <select class=\"form-control\" name=\"college\">\n");
      out.write("                    <option value=\"cest\">CEST</option>\n");
      out.write("                    <option value=\"sspem\">SSPEM</option>\n");
      out.write("                    <option value=\"scbm\">SCBM</option>\n");
      out.write("                    <option value=\"sgi\">SGI</option>\n");
      out.write("\t\t</select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">Salary</label>\n");
      out.write("                <input type=\"text\" name=\"salary\" placeholder=\"Salary\" class=\"form-control\">\n");
      out.write("            </div><br/>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("\t\t<label style=\"color: #337ab7\">Email Id</label>\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"xyz@anydomain.com\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Mobile Number</label>\n");
      out.write("                <input type=\"text\" name=\"mobile\" placeholder=\"10 Digit Mobile Number\" class=\"form-control\">\n");
      out.write("            </div><br/>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-5\">\n");
      out.write("                <br/>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-lock\"></span> Register</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    }catch(NullPointerException npe)
    {
        response.sendRedirect("index.html");
    }
        

      out.write('\n');
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
