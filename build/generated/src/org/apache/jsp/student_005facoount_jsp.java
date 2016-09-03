package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005facoount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Account</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\" style=\"background-color: #000080; color: #ffffff\">\n");
      out.write("            <h1 style=\"margin-left: 35%\">Student Account</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"single\">  \n");
      out.write("\t   <div class=\"form-container\">\n");
      out.write("        <h2>Register Form</h2>\n");
      out.write("        <form class=\"form-horizontal\" role=\"form\"> \n");
      out.write("            <div class=\"form-group\"> \n");
      out.write("         \n");
      out.write("                <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Enter Name\"> \n");
      out.write("                </div> \n");
      out.write("                   <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <select class=\"form-control\" id=\"course\">\n");
      out.write("                         <option value=\"\">Select College</option>\n");
      out.write("                        <option value=\"\">CEST</option>\n");
      out.write("                        <option value=\"\">SSPEM</option>\n");
      out.write("                        <option value=\"\">SCBM</option>    \n");
      out.write("                         <option value=\"\">Polytechnic</option>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                    </select> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\"> \n");
      out.write("         \n");
      out.write("                <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <select class=\"form-control\" id=\"course\">\n");
      out.write("                        <option value=\"\">Select Course</option>\n");
      out.write("                        <option value=\"\">B.tech</option>\n");
      out.write("                        <option value=\"\">MBA</option>\n");
      out.write("                        <option value=\"\">BCA</option>\n");
      out.write("                        <option value=\"\">BBA</option>\n");
      out.write("                         <option value=\"\">Polytechnic</option>\n");
      out.write("                       \n");
      out.write("                    </select> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                   <select class=\"form-control\">\n");
      out.write("                        <option value=\"\">Select Branch</option>\n");
      out.write("                        <option value=\"\">Computer Science and Engineering</option>\n");
      out.write("                        <option value=\"\">Mechanical Engineering</option>\n");
      out.write("                        <option value=\"\">Civil Engineering</option>\n");
      out.write("                        <option value=\"\">Electrical Engineering</option>\n");
      out.write("                        <option value=\"\">Electronics & Communication Engineering</option> \n");
      out.write("                       <option value=\"\">Information Technology</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                  <select class=\"form-control\">\n");
      out.write("                        <option value=\"\">Select year</option>\n");
      out.write("                        <option value=\"\">First</option>\n");
      out.write("                        <option value=\"\">Second</option>\n");
      out.write("                        <option value=\"\">Third</option>\n");
      out.write("                        <option value=\"\">Fourth</option>\n");
      out.write("                         \n");
      out.write("                       \n");
      out.write("                    </select> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"rollno\" placeholder=\"Roll No\"> \n");
      out.write("                    \n");
      out.write("                </div> \n");
      out.write("      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("                    <label class=\"h3 col-lg-offset-2\">Fees Details:</label><br>\n");
      out.write("                <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"firstinstallment\" placeholder=\"First Installment\"> \n");
      out.write("                </div> \n");
      out.write("                   <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"secondinstallment\" placeholder=\"Second Installment\"> \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("         \n");
      out.write("                <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"hostelfees\" placeholder=\"Hostel Fees\"> \n");
      out.write("                </div> \n");
      out.write("                   <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"transportfees\" placeholder=\"Transport Fees\"> \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        <div class=\"form-group\" id=\"others\">\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                  <select class=\"form-control\">\n");
      out.write("                        <option value=\"\">Others</option>\n");
      out.write("                        <option value=\"\">Fine</option>\n");
      out.write("                        <option value=\"\">Carry Paper</option>\n");
      out.write("                        <option value=\"\">Extras</option>\n");
      out.write("                  \n");
      out.write("                         \n");
      out.write("                       \n");
      out.write("                    </select> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\"> \n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"amount\" placeholder=\"Amount(Rs.)\"> \n");
      out.write("                </div> \n");
      out.write("        </div>\n");
      out.write("             <div class=\"form-group\"> \n");
      out.write("         \n");
      out.write("                <div class=\"col-md-offset-3\"> \n");
      out.write("                    <button class=\"btn btn-warning\">Calculate Total fee</button> \n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"col-lg-offset-5\">\n");
      out.write("                     <input type=\"submit\" value=\"Proceed\" class=\"btn btn-primary\">\n");
      out.write("             </div>\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("           </div>\n");
      out.write("    </div>\n");
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
