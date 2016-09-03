<%-- 
    Document   : user
    Created on : May 14, 2016, 5:29:39 PM
    Author     : Shubham
--%>


<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="myPack.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Updating Status</title>
    </head>
    <body>
        <%
            String status = request.getParameter("status");
            String username = request.getParameter("username");
            
            try
            {
                Connection con = Connectivity.createConnection();
                if(status.equalsIgnoreCase("true"))
                {    
                    PreparedStatement ps = con.prepareStatement("update account_staff_info set active_status = '0' where username=?");
                    ps.setString(1, username);
                    int exec = ps.executeUpdate();
                    
                    if(exec > 0)
                    {
                        response.sendRedirect("update_user.jsp");
                    }
                    else
                    {
                        out.println("Not Updated");
                    }
                }
                else
                {
                    PreparedStatement ps = con.prepareStatement("update account_staff_info set active_status = '1' where username=?");
                    ps.setString(1, username);
                    int exec = ps.executeUpdate();
                    
                    if(exec > 0)
                    {
                        response.sendRedirect("update_user.jsp");
                    }
                    else
                    {
                        out.println("Not Updated");
                    }
                }
            
            
            
            
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        %>
    </body>
</html>
