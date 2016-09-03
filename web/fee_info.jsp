<%-- 
    Document   : fee_status
    Created on : Apr 8, 2016, 12:57:20 AM
    Author     : Shubham
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fee Status</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color: #ffffff">
            <center><h1>Fee Info</h1></center>
        </div>
        
        <div class="col-md-4">
            <form class="form-group" method="post" action="feeinfo.jsp">
                <label style="color: #337ab7;">Student Roll Number</label>
                <input type="number" name="roll_no" placeholder="Roll Number" class="form-control" required><br/>
                <button class="btn btn-primary col-md-offset-4">Check Details</button>
            </form>
        </div>
        
        
        
        <div class="col-md-4">
            <form class="form-group" method="post" action="feeinfo.jsp">
                <label style="color: #337ab7">Year</label>
                <select name="student_of" class="form-control">
                    <option value="1st year">1st Year</option>
                    <option value="2nd year">2nd Year</option>
                    <option value="3rd year">3rd Year</option>
                    <option value="4th year">4th Year</option>
                </select>
                
                <label style="color: #337ab7">Branch</label>         
                <select name="branch" id="branch" class="form-control">
                    <option value="CSE">Computer Science and Engineering(CSE)</option>
                    <option value="IT">Information Technology(IT)</option>
                    <option value="EC">Electrical Engineering(EC)</option>
                    <option value="EN">Electronics Engineering(EN)</option>
                    <option value="ME">Mechanical Engineering(ME)</option>
                    <option value="CE">Civil Engineering(CE)</option>
                </select>
                
                <label style="color: #337ab7">College</label>
                 <select name="college" class="form-control">
                    <option value="cest">CEST</option>
                    <option value="sspem">SSPEM</option>
                    <option value="scbm">SCBM</option>
                </select><br>
                <button class="btn btn-primary col-md-offset-4">Check Details</button>
            </form>
        </div>
        
        <div class="col-md-4">
            <form class="form-group" method="post" action="feeinfo.jsp">
                <label style="color: #337ab7">Year</label>
                <select name="student_of" class="form-control">
                    <option value="1st year">1st Year</option>
                    <option value="2nd year">2nd Year</option>
                    <option value="3rd year">3rd Year</option>
                    <option value="4th year">4th Year</option>
                </select>
                
                <label style="color: #337ab7">Course Type</label>
                <select name="course_type" class="form-control" onclick="javascript:coursetype();">
                    <option value="B.tech">B.Tech</option>
                    <option value="BCA">BCA</option>
                    <option value="BBA">BBA</option>
                    <option value="MBA">MBA</option>
                    <option value="Polytechnic">Polytechnic</option>
                </select><br>
                <button class="btn btn-primary col-md-offset-4">Check Details</button>
            </form>
        </div>
        
        
        
    </body>
</html>
