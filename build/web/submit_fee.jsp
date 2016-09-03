<%-- 
    Document   : submit_fee
    Created on : Mar 18, 2016, 4:19:06 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        String emp_username = (String)session.getAttribute("emp_username");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
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
        <title>Submit Fee</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <link href="css/w3.css" type="text/css" rel="stylesheet">
        <script>
            function add()
            {
                
                var tuition = document.getElementById('tuition');
                //alert (tuition);
                var hostel = document.getElementById('hostel');
                var transport = document.getElementById('transport');
                var other = document.getElementById('other');
                
                var total = tuition+hostel+transport+other;
               //document.getElementById('total_amount').valueOf(total);
               
            }
    
            function radio()
            {
                if(document.fee_submit_form.ddno.checked==true)
                {
                    document.getElementById('dd').removeAttribute('disabled');
                }
                if(document.fee_submit_form.cash.checked==true)
                {
                    document.getElementById('dd').disabled=true;
                }
            }
            
            function coursetype()
            {
                if(document.fee_submit_form.course.value=="B.tech")
                {
                    document.getElementById('branch').removeAttribute('disabled');
                }
    
                if(document.fee_submit_form.course.value=="BCA" ||document.fee_submit_form.course.value=="BBA" ||document.fee_submit_form.course.value=="MBA" || document.fee_submit_form.course.value=="Polytechnic")
                {
                    document.getElementById('branch').disabled=true;
                }
  
            }
            
        </script>
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color:#ffffff;">
            <center><h1>Fee Submission</h1></center>
            
        </div>
        
        <form method="post" action="FeeUpdate" class="col-md-offset-1" name="fee_submit_form">
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">Academic Year</label>
                <input type="text" name="acadmeic_year" placeholder="yyyy-yyyy" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Received From</label>
                <input type="text" name="received_from" placeholder="Received From?" class="form-control" required>
            </div><br/>
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">Student Name</label>
		<input type="text" name="student_name" placeholder="Student Name" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Student of</label>
                <select name="year" class="form-control">
                    <option value="1">1st Year</option>
                    <option value="2">2nd Year</option>
                    <option value="3">3rd Year</option>
                    <option value="4">4th Year</option>
                </select>
            </div><br/>
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">College</label>
                <select name="college" class="form-control">
                    <option value="cest">CEST</option>
                    <option value="sspem">SSPEM</option>
                    <option value="scbm">SCBM</option>
                </select>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Course Type</label>
                <select name="course" class="form-control" onclick="javascript:coursetype();">
                    <option value="B.tech">B.Tech</option>
                    <option value="BCA">BCA</option>
                    <option value="BBA">BBA</option>
                    <option value="MBA">MBA</option>
                    <option value="Polytechnic">Polytechnic</option>
                </select>
            </div><br/>
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">Branch</label>
                <select name="branch" id="branch" class="form-control" disabled>
                    <option value=null>-Select Branch-</option>
                    <option value="cse">Computer Science and Engineering(CSE)</option>
                    <option value="it">Information Technology(IT)</option>
                    <option value="ec">Electrical Engineering(EC)</option>
                    <option value="en">Electronics Engineering(EN)</option>
                    <option value="me">Mechanical Engineering(ME)</option>
                    <option value="ce">Civil Engineering(CE)</option>
                </select>
            </div>
            <div class="col-md-4 col-lg-offset-1" onclick="javascript:radio();">
                <label style="color: #337ab7"><input type="radio" name="submit_type" id="cash" checked="true">Cash</label>
                <label style="color: #337ab7"><input type="radio" name="submit_type" id="ddno">DD No.</label>
                <input type="text" name="dd_no" id="dd" placeholder="DD Number" class="form-control" disabled>
            </div><br/>
            
            <div class="col-md-4 col-lg-offset-1">
            <br/><label style="color: #337ab7">Fee Detail</label>
                <input type="number" name="tuition_fee" class="form-control" placeholder="Tuition fee" id="tuition">
                <input type="number" name="hostel_fee" class="form-control" placeholder="Hostel fee" id="hostel">
                <input type="number" name="transport_fee" class="form-control" placeholder="Transport fee" id="transport">
                <input type="number" name="uniform_fee" class="form-control" placeholder="Uniform fee" id="uniform">
                <input type="number" name="other_fee" class="form-control" placeholder="Other fee" id="other">
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<br/><label style="color: #337ab7">Total Amount in Digit</label>
                <input type="number" name="total_amount_digit" placeholder="Total Amount" class="form-control" id="total_amount" onclick="javascript:add();" required>
                
                <label style="color: #337ab7">Total Amount in Words</label>
                <input type="text" name="total_amount_words" placeholder="Total Amount" class="form-control" required>
                <label style="color: #337ab7">Date</label>
                <input type="date" name="date" class="form-control" required>
                
            </div>
            
            <div class="col-md-4 col-lg-offset-4">
                <br/>
                <input type="number" name="roll_no" class="form-control" placeholder="Student Roll Number*" required>
            </div>
            
            <div class="col-md-4 col-lg-offset-5">
                <br/>
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-lock"></span> Submit Fee</button>
            </div>
            
        </form>
        
        
    </body>
</html>
<%
    }catch(NullPointerException npe)
    {
        response.sendRedirect("index.html");
    }
%>
