package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import myPack.*;

public final class edit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 System.out.println("hi");
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Profile</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\" style=\"background-color: #337ab7; color: #ffffff\">\n");
      out.write("            <center><h1>Edit Profile</h1></center>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <form method=\"post\" action=\"EditProfile\">\n");
      out.write("                <input type=\"hidden\" name=\"username\" value=\"");
 out.print(emp_username); 
      out.write("\">\n");
      out.write("            ");

                Connection con = Connectivity.createConnection();
                Statement stmt = con.createStatement();
                String sql = "select * from account_staff_info where username='"+emp_username+"';";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next())
                    {
                        int emp_id = rs.getInt("emp_id");
                        
                        String first_name = rs.getString("first_name");
                        String last_name = rs.getString("last_name");
                        
                        String email = rs.getString("email");
                        String mobile = rs.getString("mobile");
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">First Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"first_name\" style=\"font-weight: bold\" placeholder=\"First Name\" value=\"");
out.print(first_name);
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Last Name</label>\n");
      out.write("                <input type=\"text\" name=\"last_name\" placeholder=\"Last Name\" style=\"font-weight: bold\" value=\"");
out.print(last_name);
      out.write("\" class=\"form-control\" required>\n");
      out.write("            </div><br/>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("\t\t<label style=\"color: #337ab7\">Email Id</label>\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"xyz@anydomain.com\" style=\"font-weight: bold\" value=\"");
out.print(email);
      out.write("\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Mobile Number</label>\n");
      out.write("                <input type=\"text\" name=\"mobile\" placeholder=\"10 Digit Mobile Number\" style=\"font-weight: bold\" value=\"");
out.print(mobile);
      out.write("\" class=\"form-control\" required>\n");
      out.write("            </div><br/>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-5\">\n");
      out.write("                <br><button type=\"submit\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-edit\"></span> Update</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");

    }catch(Exception ex)
    {
        ex.printStackTrace();
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
