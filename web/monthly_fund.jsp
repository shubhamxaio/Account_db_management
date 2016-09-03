<%-- 
    Document   : monthly_fund
    Created on : Apr 30, 2016, 1:20:53 PM
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
        <title>Monthly Fund</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color: #ffffff">
            <center><h1>Your Monthly Fund</h1></center>
        </div>
        
        <div>
            <form method="post" action="" >
                <fieldset class="col-md-offset-2 col-md-3">
                    <legend>Credit</legend>
                    <div class="">
                        <label style="color: #337ab7">Submit Type</label><br>
                        <input type="radio" name="submit_type"> Cash
                        <input type="radio" name="submit_type"> DD
                        <input type="radio" name="submit_type"> Cheque
                        <br><br><label style="color: #337ab7">Amount</label>
                        <input type="number" class="form-control" name="" style="font-weight: bold" placeholder="in Digits" required><br>
                        <button type="submit" class="btn btn-primary center-block"><span class="glyphicon glyphicon-upload"></span> Submit</button>
                    </div>
                    
                </fieldset>
                
                <fieldset class="col-md-offset-1 col-md-3">
                    <legend>Debit</legend>
                    <div class="">
                        <label style="color: #337ab7">Debit Type</label><br>
                        <input type="radio" name="submit_type"> Cash
                        <input type="radio" name="submit_type"> DD
                        <input type="radio" name="submit_type"> Cheque
                        <br><br>
                        <label style="color: #337ab7">Amount</label>
                        <input type="number" class="form-control" name="" style="font-weight: bold" placeholder="in Digits" required><br>
                        <button type="submit" class="btn btn-primary center-block"><span class="glyphicon glyphicon-upload"></span> Submit</button>
                    </div>
                    
                </fieldset>
                
            </form>
        </div>
        
        
    </body>
</html>
<%
    }catch(NullPointerException npe)
    {
        response.sendRedirect("index.html");
        npe.printStackTrace();
    }
%>