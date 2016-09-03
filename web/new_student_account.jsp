<%-- 
    Document   : new_student_account
    Created on : Mar 25, 2016, 3:54:11 PM
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
        <title>Student Registration</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <script>
            function coursetype()
            {
                if(document.my_form.course_type.value=="B.tech")
                {
                    document.getElementById('branch').removeAttribute('disabled');
                }
    
                if(document.my_form.course_type.value=="BCA" ||document.my_form.course_type.value=="BBA" ||document.my_form.course_type.value=="MBA" || document.my_form.course_type.value=="Polytechnic")
                {
                    document.getElementById('branch').disabled=true;
                }
  
            }
        </script>
        
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color:#ffffff;">
            <center><h1>Register a New Student Account</h1></center>
        </div>
        
        <form method="post" action="StudentRegistration" class="col-md-offset-1" name="my_form">
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">Session</label>
                <input type="text" name="session" placeholder="yyyy-yyyy" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Student Name</label>
                <input type="text" name="student_name" placeholder="Student Name" class="form-control" required>
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
                <select name="course_type" class="form-control" onclick="javascript:coursetype();">
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
                    <option value="CSE">Computer Science and Engineering(CSE)</option>
                    <option value="IT">Information Technology(IT)</option>
                    <option value="EC">Electrical Engineering(EC)</option>
                    <option value="EN">Electronics Engineering(EN)</option>
                    <option value="ME">Mechanical Engineering(ME)</option>
                    <option value="CE">Civil Engineering(CE)</option>
                </select>
            </div>
            
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Student of</label>
                <select name="student_of" class="form-control">
                    <option value="1st year">1st Year</option>
                    <option value="2nd year">2nd Year</option>
                    <option value="3rd year">3rd Year</option>
                    <option value="4th year">4th Year</option>
                </select>
            </div><br/>
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">UPTU Roll Number</label>
                <input type="number" name="roll_no" placeholder="Roll Number" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Mobile Number</label>
                <input type="number" name="mobile" placeholder="Moble Number" class="form-control" required>
            </div><br>
            
            <div class="col-lg-offset-1 col-md-10">
                <h1 style="color: #337ab7;font-family: cursive;">Fee Details</h1>
            </div><br>
            
            <div class="col-lg-offset-1 col-md-4">
            
                <br><input type="number" name="tuition_fee" class="form-control" placeholder="Tuition fee" id="tuition" required>
                <input type="number" name="hostel_fee" class="form-control" placeholder="Hostel fee" id="hostel">
                <input type="number" name="transport_fee" class="form-control" placeholder="Transport fee" id="transport">
                <input type="number" name="uniform_fee" class="form-control" placeholder="Uniform fee" id="uniform">
                <input type="number" name="other_fee" class="form-control" placeholder="Other fee" id="other">
            </div>
            
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">First Installment</label>
                <input type="number" name="first_installment" placeholder="First Installment" class="form-control" required>
                <label style="color: #337ab7">Second Installment</label>
                <input type="number" name="second_installment" placeholder="Second Installment" class="form-control" required><br>
                <label style="color: #337ab7">Date</label>
                <input type="date" name="date"class="form-control" required>
            </div><br>
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">Total Amount in Digit</label>
                <input type="number" name="total_in_digit" placeholder="Total Amount in Digit" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Total Amount in Words</label>
                <input type="text" name="total_in_words" placeholder="Total Amount in Words" class="form-control" required>
            </div><br>
            <div>
                <br><button type="sumbit" class="btn btn-primary col-md-offset-5">Submit Details</button>
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

