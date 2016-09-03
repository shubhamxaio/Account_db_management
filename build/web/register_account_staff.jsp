<%-- 
    Document   : register_account_staff
    Created on : Mar 16, 2016, 9:51:22 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        String adminusername = (String)session.getAttribute("adminusername");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
        
        String director_username = (String)session.getAttribute("director_username");  //""+session.getAttr....
        
        if(adminusername.equalsIgnoreCase(null) && director_username.equalsIgnoreCase(null) )
        {
            response.sendRedirect("index.html");
        }
        
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration for Account Office Staff</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color:#ffffff;">
            <center><h1>Registration For Account Office Staff</h1></center>
        </div>
   
	<form method="post" action="RegisterAccountStaff" class="col-md-offset-1">
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">User Name</label>
                <input type="text" name="username" placeholder="Username" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Password</label>
                <input type="password" name="password" placeholder="Password" class="form-control" required>
            </div><br/>

            <div class="col-md-4 col-lg-offset-1">
		<label style="color: #337ab7">First Name</label>
                <input type="text" name="first_name" placeholder="First Name" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Last Name</label>
                <input type="text" name="last_name" placeholder="Last Name" class="form-control" required>
            </div><br/>
            <div class="col-md-4 col-lg-offset-1">
		<label style="color: #337ab7">College</label>
                <select class="form-control" name="college">
		<option>CEST</option>
		<option>SSPEM</option>
		<option>SCBM</option>
                <option>SGI</option>
		</select>
            </div>
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">Salary</label>
                <input type="text" name="salary" placeholder="Salary" class="form-control" required>
            </div><br/>

            <div class="col-md-4 col-lg-offset-1">
		<label style="color: #337ab7">Email Id</label>
                <input type="email" name="email" placeholder="xyz@anydomain.com" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Mobile Number</label>
                <input type="text" name="mobile" placeholder="10 Digit Mobile Number" class="form-control" required>
            </div><br/>
            <div class="col-md-4 col-lg-offset-5">
                <br/>
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-lock"></span> Register</button>
            </div>

	</form>
    </body>
</html>
<% }catch (NullPointerException npe){
    response.sendRedirect("index.html");
}
        
%>