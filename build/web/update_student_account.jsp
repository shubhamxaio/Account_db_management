<%-- 
    Document   : update_student_account
    Created on : May 15, 2016, 10:12:47 AM
    Author     : Shubham
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="myPack.Connectivity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
try{
        String emp_username = (String)session.getAttribute("emp_username");
        //""+session.getAttr....
        System.out.println("Inside Account Staff : "+emp_username);
        
        String logintype = (String)session.getAttribute("logintype");
        
        Connection con=Connectivity.createConnection();
        Statement stmt = con.createStatement();
                String sql = "select active_status,first_name from account_staff_info where username='"+emp_username+"';";
                ResultSet rs = stmt.executeQuery(sql);
                String first_name = "";
                while(rs.next())
                    {
                        first_name = rs.getString("first_name");
                        boolean active_status = rs.getBoolean("active_status");
                        if(active_status == false)
                        {
                            out.println("<h1 style='color: red'>Access Denied!</h1> \n");
                            out.println("<h2 style='color: red'>You are BLOCKED by admin. Contact to admin for re-activation of your account.</h2> \n");
                            out.println("<a href='index.html'>Go back to Login</a>");
                            session.setAttribute("emp_username", null);
                            session.setAttribute("logintype", null);
                            //response.sendRedirect("");
                        }
                    }
        
        if(emp_username.equalsIgnoreCase(null))
        {
            response.sendRedirect("index.html");
        }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Update an Existing Account</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color: #ffffff">
            <center><h1>Update An Existing Student Account</h1></center>
        </div>
     
    </body>
</html>
<%
}catch(Exception ex)
{
    ex.printStackTrace();
}
%>