

<%@page import="java.sql.*"%>
<%@page import="myPack.*" %>

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
        <title>Edit Profile</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    
    <body>
        <div class="jumbotron" style="background-color: #337ab7; color: #ffffff">
            <center><h1>Edit Profile</h1></center>
        </div>
        <div>
            <form method="post" action="EditProfile">
                <input type="hidden" name="username" value="<%=emp_username %>">
            <%
                Connection con = Connectivity.createConnection();
                Statement stmt = con.createStatement();
                String sql = "select * from account_staff_info where username='"+emp_username+"';";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next())
                    {
                        int emp_id = rs.getInt("emp_id");
                        String first_name = rs.getString("first_name");
                        String last_name = rs.getString("last_name");
                        String email = rs.getString("email");
                        String mobile = rs.getString("mobile");
            %>
            
            <div class="col-md-4 col-lg-offset-1">
                <label style="color: #337ab7">First Name</label>
                <input type="text" class="form-control" name="first_name" style="font-weight: bold" placeholder="First Name" value="<%out.print(first_name);%>" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Last Name</label>
                <input type="text" name="last_name" placeholder="Last Name" style="font-weight: bold" value="<%out.print(last_name);%>" class="form-control" required>
            </div><br/>
            <div class="col-md-4 col-lg-offset-1">
		<label style="color: #337ab7">Email Id</label>
                <input type="email" name="email" placeholder="xyz@anydomain.com" style="font-weight: bold" value="<%out.print(email);%>" class="form-control" required>
            </div>
            <div class="col-md-4 col-lg-offset-1">	
		<label style="color: #337ab7">Mobile Number</label>
                <input type="text" name="mobile" placeholder="10 Digit Mobile Number" style="font-weight: bold" value="<%out.print(mobile);%>" class="form-control" required>
            </div><br/>
            <%
                }
            %>
            <div class="col-md-4 col-lg-offset-5">
                <br><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Update</button>
            </div>
        </form>
        
        </div>
        
        
    </body>
</html>
<%
    }catch(Exception ex)
    {
        ex.printStackTrace();
    }
%>