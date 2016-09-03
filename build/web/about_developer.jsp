<%--
    Document   : about_developer.jsp
    Created on : Apr 25, 2016, 3:10:46 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <link href="css/w3.css" type="text/css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Developers</title>
    </head>
    <body>
        <div class="w3-container w3-padding-64 w3-center">
            <h2>OUR TEAM</h2>
            <p>Meet the team - who developed this software:</p>
            <div class="w3-row test"><br>

                <div class="w3-quarter">
                    <img src="img/shubham.jpg" alt="Boss" style="width:50%" class="w3-circle">
                    <h3>Shubham Srivastava</h3>
                    <p>Front and backend Developer</p>
                </div>

                <div class="w3-quarter">
                    <img src="img/prashant.jpg" alt="Boss" style="width:50%" class="w3-circle">
                    <h3>Prashant Pandey</h3>
                    <p>Web Designer</p>
                </div>

                <div class="w3-quarter">
                    <img src="img/vishal.jpg" alt="Boss" style="width:50%" class="w3-circle">
                    <h3>Vishal Kumar</h3>
                    <p>Backend Coder and Developer</p>
                </div>

                <div class="w3-quarter">
                    <img src="img/kshitij.jpg" alt="Boss" style="width:50%" class="w3-circle">
                    <h3>Kshitij Gupta</h3>
                    <p>DataBase management</p>
                </div>
            </div>
        </div>
        
        <div class="w3-container w3-padding-64">
            <h2 class="w3-padding-bottom w3-blue">Contact Us</h2>
            <div class="w3-row">
                <div class="w3-col m5">
                    <h3>Address</h3>
                    
                    <p><i class="fa fa-map-marker w3-text-teal w3-xlarge"></i>&nbsp;&nbsp;Lucknow, India</p>
                    <p><i class="fa fa-phone w3-text-teal w3-xlarge"></i>&nbsp;&nbsp;+91-**********</p>
                    <p><i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>&nbsp;&nbsp;test@test.com</p>
                </div>
                <div class="w3-col m7">
                    <form class="w3-form">
                        <div class="w3-group">      
                            <input class="w3-input" style="width:100%;" type="text" required>
                            <label class="w3-label" style="color: #337ab7">Username</label>
                        </div>
                        <div class="w3-group">      
                            <input class="w3-input" style="width:100%;" type="email" required>
                            <label class="w3-label" style="color: #337ab7">Email</label>
                        </div>
                        <div class="w3-group">      
                            <input class="w3-input" style="width:100%;" type="text" required>
                            <label class="w3-label"style="color: #337ab7">Subject</label>
                        </div>
                        <div class="w3-group">      
                            <textarea class="w3-input" style="width:100%;" required></textarea>
                            <label class="w3-label"style="color: #337ab7">Message</label>
                        </div>
                        <button type="submit" class="w3-btn w3-right w3-theme w3-blue">Send</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
