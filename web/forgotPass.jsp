<%-- 
    Document   : forgotPass
    Created on : May 16, 2016, 11:54:59 AM
    Author     : Shubham
--%>

<%@page import="java.sql.*"%>
<%@page import="myPack.Connectivity"%>
<%@page import="java.util.Properties"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
    try
    {
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Sent</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
        <link href="css/bootstrap-social.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <%
            String logintype = request.getParameter("logintype");
            String username = request.getParameter("username");
            //System.out.println("Logintype: "+logintype+" Username: "+username);
            
            Connection con = Connectivity.createConnection();
            Statement stmt = con.createStatement();
            String sql="";
            PreparedStatement ps=null;
            ResultSet rs = null;
            
            String password="";
            String email="";
            
            
            String to,subject,host;
            
            if(logintype.equalsIgnoreCase("Administrator"))
            {
                sql="select * from admin_login where username='"+username+"';";
                rs = stmt.executeQuery(sql);
                if(rs.next())
                {
                    
                    password = rs.getString("password");
                    email = rs.getString("email");
                    
                    to = email;
                    subject = "Recovery of your password!";
                    //Defining Host
                    host="smtp.gmail.com";
                    //Creating properties object
                    Properties props = new Properties();
                    final String f = "myselfvishalvkm@gmail.com"; //from
                    final String p = "98397190"; //password
                    //Defining Properties
                    props.put("mail.smtp.host",host);
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.transport.protocol","smtp");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.user", f);
                    props.put("mail.password", p);
                    props.put("mail.port","587"); //465 or 587 or 25
                    
                    //Authorized the session object
                    Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
                    
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication()
                        {
                            return new PasswordAuthentication(f, p);
                        }
                    });
                    
                    //Create a default MimeMessage Object
                    MimeMessage message = new MimeMessage(mailSession);
                    message.setFrom(new InternetAddress(f));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                    message.setSubject(subject);
                    message.setText("Hello "+username+" \n your Password is: "+password);
                    
                    Transport.send(message,message.getAllRecipients());
                    out.println("<h1 style='color: green;font-weight: bold;'>Your Password is sent to Your Email!</h1>");
                    
                }
                else
                {
                    out.println("<script> alert ('Username not found in our database! Please try again..');"
                                +"window.location='forgot_pass.jsp'; "+"</script>");
                }
            
            }
            if(logintype.equalsIgnoreCase("Account Office"))
            {
                sql="select * from account_staff_info where username='"+username+"';";
                rs = stmt.executeQuery(sql);
                if(rs.next())
                {
                    
                    password = rs.getString("password");
                    email = rs.getString("email");
                    
                    to = email;
                    subject = "Recovery of your password!";
                    //Defining Host
                    host="smtp.gmail.com";
                    //Creating properties object
                    Properties props = new Properties();
                    final String f = "myselfvishalvkm@gmail.com"; //from
                    final String p = "98397190"; //password
                    //Defining Properties
                    props.put("mail.smtp.host",host);
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.transport.protocol","smtp");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.user", f);
                    props.put("mail.password", p);
                    props.put("mail.port","587"); //465 or 587 or 25
                    
                    //Authorized the session object
                    Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
                    
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication()
                        {
                            return new PasswordAuthentication(f, p);
                        }
                    });
                    
                    //Create a default MimeMessage Object
                    MimeMessage message = new MimeMessage(mailSession);
                    message.setFrom(new InternetAddress(f));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                    message.setSubject(subject);
                    message.setText("Hello "+username+" \n your Password is: "+password);
                    
                    Transport.send(message,message.getAllRecipients());
                    out.println("<h1 style='color: green;font-weight: bold;'>Your Password is sent to Your Email!</h1>");
                    
                }
                else
                {
                    out.println("<script> alert ('Username not found in our database! Please try again..');"
                                +"window.location='forgot_pass.jsp'; "+"</script>");
                }
            }
            
        %>
        <div class="col-md-offset-2 col-md-2">
            <a href="index.html" class="btn btn-block btn-primary">Go Back To Login!</a>
        </div>
    </body>
</html>
<%
    }catch(Exception ex)
    {
        ex.printStackTrace();
    }
%>