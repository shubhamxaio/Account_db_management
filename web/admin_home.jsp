<%-- 
    Document   : admin-home
    Created on : Mar 15, 2016, 2:38:23 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        String adminusername = (String)session.getAttribute("adminusername");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
        if(adminusername.equalsIgnoreCase(null))
        {
            response.sendRedirect("index.html");
        }
        
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet" />
        <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
    <style>
        #lst{
            color: #ffffff;
        }
    </style>
    
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
                    <a class="navbar-brand faclinks" href="admin_home.jsp" id="lst"><span class="glyphicon glyphicon-home"></span> Home</a>
            </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav navbar-right">
                    
                    <li><a href="register_account_staff.jsp" id="lst" target="myIFrame">Register Account Office Staff</a></li>
                    <li><a href="fee_info.jsp" id="lst" target="myIFrame">Fee Info</a></li>
                    <li><a href="monthly_fund.jsp" id="lst" target="myIFrame"> Your Monthly Fund</a></li>
                    <li><a href="update_user.jsp" id="lst" target="myIFrame">Activate/Deactivate Users</a></li>
                    <li class="nav navbar-nav navbar-right">
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
                
        
        <iframe width="100%" height="580px" src="monthly_fund.jsp" name="myIFrame"></iframe>
        
    </body>
</html>
<%
    }catch(NullPointerException npe){
        response.sendRedirect("index.html");
    }   
%>