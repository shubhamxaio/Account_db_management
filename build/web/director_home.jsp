<%-- 
    Document   : director_home
    Created on : Mar 16, 2016, 11:46:21 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        String director_username = (String)session.getAttribute("director_username");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
        if(director_username.equalsIgnoreCase(null))
        {
            response.sendRedirect("index.html");
        }
        
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Director Home</title>
        <link href="css/bootstrap.css" text="text/css" rel="stylesheet">
        <style>
            #lst{
                color: #ffffff;
            }
        </style>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <!-- Navigation -->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid" style="background-color: #337ab7">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    
                </button>
                    <a class="navbar-brand faclinks" href="director_home.jsp" id="lst"><span class="glyphicon glyphicon-home"></span> Home</a>
            </div>
                <div class="collapse navbar-collapse navbar-right" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="register_account_staff.jsp" id="lst" target="myIFrame">Register Account Office Staff</a></li>
                    <li><a href="fee_info.jsp" id="lst" target="myIFrame">View Students Fee Detail</a></li>
                    <li>
                        <a href="#" id="lst" class="dropdown-toggle" data-toggle="dropdown">Profile <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li style="background-color: #337ab7">
                                <a href="changepass.jsp" id="lst" target="myIFrame"><span class="glyphicon glyphicon-barcode"></span> Change Password</a>
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
        
        <iframe width="100%" height="580px" src="" name="myIFrame"></iframe>
        
        
        
        
    </body>
</html>
<% }catch(NullPointerException npe)
{
    response.sendRedirect("index.html");
}
    %>
