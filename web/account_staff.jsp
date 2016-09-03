<%--
    Document   : account_office_staff
    Created on : Mar 18, 2016, 3:47:59 PM
    Author     : Shubham
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="myPack.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        String emp_username = (String)session.getAttribute("emp_username");
        //""+session.getAttr....
        //System.out.println("Inside Account Staff : "+emp_username);
        
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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Office</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <style>
            #lst{
                color: #ffffff;
            }
        </style>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid" style="background-color: #337ab7">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span> 
                    </button>
                    <a class="navbar-brand" href="account_staff.jsp" id="lst"><span class="glyphicon glyphicon-home"></span> Home</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="submit_fee.jsp" id="lst" target="myIFrame">Submit Fees</a></li> 
                        <li><a href="new_student_account.jsp" id="lst" target="myIFrame">Register New Student Account</a></li>
                        <li><a href="update_student_account.jsp" id="lst" target="myIFrame">Update An Existing Student Account</a></li>
                        
                        <li><a href="fee_info.jsp" id="lst" target="myIFrame">Fee Info</a></li>
                        <li><a href="#" id="lst" target="myIFrame">Check Status of fee</a></li>
                        <li>
                        <a href="#" id="lst" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> <% out.println(first_name);%> <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li style="background-color: #337ab7">
                                <a href="changepass.jsp" id="lst" target="myIFrame"><span class="glyphicon glyphicon-barcode"></span> Change Password</a>
                            </li>
                            <li style="background-color: #337ab7">
                                <a href="edit_profile.jsp" id="lst" target="myIFrame"><span class="glyphicon glyphicon-edit"></span> Edit Profile</a>
                            </li>
                            <li style="background-color: #337ab7">
                                <a href="logout.jsp" id="lst"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
                            </li>
                        </ul>
                    </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <iframe width="100%" height="580px" src="submit_fee.jsp" name="myIFrame"></iframe>
    </body>
</html>
<%
    }catch(NullPointerException npe)
    {
        response.sendRedirect("index.html");
    }
%>