package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submit_005ffee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Submit Fee</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/w3.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <script>\n");
      out.write("            function add()\n");
      out.write("            {\n");
      out.write("                var tuition = document.getElementById('tuition');\n");
      out.write("                var hostel = document.getElementById('hostel');\n");
      out.write("                var transport = document.getElementById('transport');\n");
      out.write("                var other = document.getElementById('other');\n");
      out.write("                \n");
      out.write("                var total = tuition+hostel+transport+other;\n");
      out.write("               //document.getElementById('total_amount').valueOf(total);\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("    \n");
      out.write("            function radio()\n");
      out.write("            {\n");
      out.write("                if(document.fee_submit_form.ddno.checked==true)\n");
      out.write("                {\n");
      out.write("                    document.getElementById('dd').removeAttribute('disabled');\n");
      out.write("                }\n");
      out.write("                if(document.fee_submit_form.cash.checked==true)\n");
      out.write("                {\n");
      out.write("                    document.getElementById('dd').disabled=true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function coursetype()\n");
      out.write("            {\n");
      out.write("                if(document.fee_submit_form.course.value==\"B.tech\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById('branch').removeAttribute('disabled');\n");
      out.write("                }\n");
      out.write("    \n");
      out.write("                if(document.fee_submit_form.course.value==\"BCA\" ||document.fee_submit_form.course.value==\"BBA\" ||document.fee_submit_form.course.value==\"MBA\" || document.fee_submit_form.course.value==\"Polytechnic\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById('branch').disabled=true;\n");
      out.write("                }\n");
      out.write("  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\" style=\"background-color: #337ab7; color:#ffffff;\">\n");
      out.write("            <center><h1>Fee Submission</h1></center>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"\" class=\"col-md-offset-1\" name=\"fee_submit_form\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">Academic Year</label>\n");
      out.write("                <input type=\"text\" name=\"acadmeic_year\" placeholder=\"yyyy-yyyy\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Received From</label>\n");
      out.write("                <input type=\"text\" name=\"received_from\" placeholder=\"Received From?\" class=\"form-control\" required>\n");
      out.write("            </div><br/>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">Student Name</label>\n");
      out.write("\t\t<input type=\"text\" name=\"student_name\" placeholder=\"Student Name\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Student of</label>\n");
      out.write("                <select name=\"year\" class=\"form-control\">\n");
      out.write("                    <option value=\"1\">1st Year</option>\n");
      out.write("                    <option value=\"2\">2nd Year</option>\n");
      out.write("                    <option value=\"3\">3rd Year</option>\n");
      out.write("                    <option value=\"4\">4th Year</option>\n");
      out.write("                </select>\n");
      out.write("            </div><br/>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">College</label>\n");
      out.write("                <select name=\"college\" class=\"form-control\">\n");
      out.write("                    <option value=\"cest\">CEST</option>\n");
      out.write("                    <option value=\"sspem\">SSPEM</option>\n");
      out.write("                    <option value=\"scbm\">SCBM</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<label style=\"color: #337ab7\">Course Type</label>\n");
      out.write("                <select name=\"course\" class=\"form-control\" onclick=\"javascript:coursetype();\">\n");
      out.write("                    <option value=\"B.tech\">B.Tech</option>\n");
      out.write("                    <option value=\"BCA\">BCA</option>\n");
      out.write("                    <option value=\"BBA\">BBA</option>\n");
      out.write("                    <option value=\"MBA\">MBA</option>\n");
      out.write("                    <option value=\"Polytechnic\">Polytechnic</option>\n");
      out.write("                </select>\n");
      out.write("            </div><br/>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("                <label style=\"color: #337ab7\">Branch</label>\n");
      out.write("                <select name=\"branch\" id=\"branch\" class=\"form-control\" disabled>\n");
      out.write("                    <option value=null>-Select Branch-</option>\n");
      out.write("                    <option value=\"cse\">Computer Science and Engineering(CSE)</option>\n");
      out.write("                    <option value=\"it\">Information Technology(IT)</option>\n");
      out.write("                    <option value=\"ec\">Electrical Engineering(EC)</option>\n");
      out.write("                    <option value=\"en\">Electronics Engineering(EN)</option>\n");
      out.write("                    <option value=\"me\">Mechanical Engineering(ME)</option>\n");
      out.write("                    <option value=\"ce\">Civil Engineering(CE)</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\" onclick=\"javascript:radio();\">\n");
      out.write("                <label style=\"color: #337ab7\"><input type=\"radio\" name=\"submit_type\" id=\"cash\" checked=\"true\">Cash</label>\n");
      out.write("                <label style=\"color: #337ab7\"><input type=\"radio\" name=\"submit_type\" id=\"ddno\">DD No.</label>\n");
      out.write("                <input type=\"text\" name=\"dd_no\" id=\"dd\" placeholder=\"DD Number\" class=\"form-control\" disabled>\n");
      out.write("            </div><br/>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\n");
      out.write("            <br/><label style=\"color: #337ab7\">Fee Detail</label>\n");
      out.write("                <input type=\"number\" name=\"tuition_fee\" class=\"form-control\" placeholder=\"Tuition fee\" id=\"tuition\">\n");
      out.write("                <input type=\"number\" name=\"hostel_fee\" class=\"form-control\" placeholder=\"Hostel fee\" id=\"hostel\">\n");
      out.write("                <input type=\"number\" name=\"transport_fee\" class=\"form-control\" placeholder=\"Transport fee\" id=\"transport\">\n");
      out.write("                <input type=\"number\" name=\"uniform_fee\" class=\"form-control\" placeholder=\"Uniform fee\" id=\"uniform\">\n");
      out.write("                <input type=\"number\" name=\"other_fee\" class=\"form-control\" placeholder=\"Other fee\" id=\"other\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-lg-offset-1\">\t\n");
      out.write("\t\t<br/><label style=\"color: #337ab7\">Total Amount in Digit</label>\n");
      out.write("                <input type=\"number\" name=\"total_amount_digit\" placeholder=\"Total Amount\" class=\"form-control\" id=\"total_amount\" onclick=\"javascript:add();\" required>\n");
      out.write("                \n");
      out.write("                <label style=\"color: #337ab7\">Total Amount in Words</label>\n");
      out.write("                <input type=\"text\" name=\"total_amount_words\" placeholder=\"Total Amount\" class=\"form-control\" required>\n");
      out.write("                <label style=\"color: #337ab7\">Date</label>\n");
      out.write("                <input type=\"date\" name=\"date\" class=\"form-control\" required>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-4\">\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"number\" name=\"roll_no\" class=\"form-control\" placeholder=\"Student Roll Number*\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4 col-lg-offset-5\">\n");
      out.write("                <br/>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-lock\"></span> Submit Fee</button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
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
