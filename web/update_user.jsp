<%-- 
    Document   : update_user
    Created on : Apr 22, 2016, 12:57:10 PM
    Author     : Shubham
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="myPack.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    try{
        String adminusername = (String)session.getAttribute("adminusername");  //""+session.getAttr....
        String logintype = (String)session.getAttribute("logintype");
        if(adminusername.equalsIgnoreCase(null))
        {
            response.sendRedirect("index.html");
        }
        
        
        Connection con= Connectivity.createConnection();
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Activate/Deactivate user</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color: #ffffff">
            <center><h1>Update User Status</h1></center>
        </div>
       
        </div>
        <div id="acc_record" class="table-responsive">

            <table class="table table-bordered table-hover">
                <thead style="background-color: #337ab7; color: #ffffff;">
                    <tr>
                        
                        <th>Employee ID</th>
                        <th>Username</th>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>College</th>
                        <th>Salary</th>
                        <th>Email</th>
                        <th>Mobile Number</th>
                        <th>Current Status</th>
                        <th>Change Status</th>
                    </tr>
                </thead>
        <%
                Statement stmt = con.createStatement();
                String sql = "select * from account_staff_info;";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next())
                    {
                        int emp_id = rs.getInt("emp_id");
                        String username = rs.getString("username");
                        String password = rs.getString("password");
                        String first_name = rs.getString("first_name");
                        String last_name = rs.getString("last_name");
                        String college = rs.getString("college");
                        float salary = rs.getFloat("salary");
                        String email = rs.getString("email");
                        String mobile = rs.getString("mobile");
                        boolean active_status = rs.getBoolean("active_status");
                        String as="";  
        %>
                
                <tbody>
                    <tr>
                        
                        <td><%=emp_id%></td>
                        <td><%=username%></td>
                        <td><%=first_name%></td>
                        <td><%=last_name%></td>
                        <td><%=college%></td>
                        <td><%=salary%></td>
                        <td><%=email%></td>
                        <td><%=mobile%></td>
                        <% if(active_status == true)
                        {
                         as = "Activated";   
                        %>
                        <td style="color: green;font-weight: bold;"><%=as%></td>
                        <td><a href="user_status.jsp?status=<%=active_status%>&username=<%=username%>"><button class="btn btn-danger"><span class="glyphicon glyphicon-alert"></span> Deactivate</button></a></td>
                        <%
                        }else{
                          as = "Deactivated";  
                        %>
                        <td style="color: red;font-weight: bold;"><%=as%></td>
                        <td><a href="user_status.jsp?status=<%=active_status%>&username=<%=username%>"><button class="btn btn-success"><span class="glyphicon glyphicon-saved"></span> Activate</button></a></td>
                        <% } %>
                    </tr>
                </tbody>
            <%
                }
            %>
            </table>
            
            
        </div>
    </body>
</html>
<%
    }catch(Exception e){
        e.printStackTrace();
    }   
%>
