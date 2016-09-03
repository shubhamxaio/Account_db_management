<%-- 
    Document   : logout.jsp
    Created on : Mar 16, 2016, 12:12:33 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.setAttribute("adminusername", null);
    session.setAttribute("logintype", null);
    
    session.setAttribute("director_username", null);
    session.setAttribute("logintype", null);
    
    session.setAttribute("emp_username", null);
    session.setAttribute("logintype", null);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
    <center><label class="text-danger" style="font-size: 25px">You're Successfully Logged out.</label></center>

        
        <center><a href="index.html" class="btn btn-primary"><span class="glyphicon glyphicon-log-in"></span> Go back to Login</a></center>
        
        
    </body>
</html>
