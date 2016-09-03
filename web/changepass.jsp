<%-- 
    Document   : changepass
    Created on : Apr 3, 2016, 4:20:22 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try
    {
        String adminusername = (String)session.getAttribute("adminusername");
        String emp_username = (String)session.getAttribute("emp_username");
    
    //System.out.println("admin : "+adminusername+" account: "+emp_username);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <link href="css/w3.css" type="text/css" rel="stylesheet">
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <style>
            #lbl{
                color: #337ab7;
            }
        </style>
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color:#ffffff;">
            <h1 class="w3-center">Change Your Account Password</h1>
        </div>
        <div class="col-md-offset-4 col-md-4 well">
            <!-- Form -->
            <form method="post" action="passVerification.jsp" class="w3-container">
                <input type="hidden" name="adminusername" value="<%=adminusername%>">
                <input type="hidden" name="emp_username" value="<%=emp_username%>">
                <div class="w3-group">
                    <input class="w3-input" type="password" name="old_password" style="width:100%" required>
                    <label class="w3-label" id="lbl">Old Password</label>
		</div>
                
                <div class="w3-group">
                    <input class="w3-input" type="password" name="new_password" style="width:100%" required>
                    <label class="w3-label" id="lbl">New Password</label>
		</div>
                
                <div class="w3-group">
                    <input class="w3-input" type="password" name="c_password" style="width:100%" required>
                    <label class="w3-label" id="lbl">Confirm Password</label>
		</div>
                <div class="w3-center">
                    <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-asterisk"></span> Change Password</button>
                </div>
                
            </form>
        </div>
        
    </body>
</html>
<%
    }catch (Exception ex)
    {
        ex.printStackTrace();
    }
%>