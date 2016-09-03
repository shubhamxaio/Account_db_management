<%-- 
    Document   : passVerification
    Created on : May 16, 2016, 12:47:44 AM
    Author     : Shubham
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.Connectivity"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Verification and Confirmation</title>
    </head>
    <body>
        <%
            Connection con = Connectivity.createConnection();
            Statement stmt = con.createStatement();
            String sql="";
            PreparedStatement ps=null;
            ResultSet rs = null;
            
            String old_password = request.getParameter("old_password");
            String new_password = request.getParameter("new_password");
            String c_password = request.getParameter("c_password");
            String adminusername = request.getParameter("adminusername");
            String emp_username = request.getParameter("emp_username");
            
            if(old_password.matches(new_password))
            {
                out.println("<script> alert ('Your Old Password and new Password is same please try again!');"
                                +"window.location='changepass.jsp'; "+"</script>");
            }
                        
            if(new_password.matches(c_password))
            {
                if(adminusername.equalsIgnoreCase("null"))
                {
                    sql="select password from account_staff_info where username = '"+emp_username+"';";
                    rs = stmt.executeQuery(sql);
                    String password = "";
                    while(rs.next())
                        {
                            password = rs.getString("password");
                        }
                    
                    if(password.matches(old_password))
                    {
                        sql = "update account_staff_info set password=? where username=?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1,new_password);
                        ps.setString(2, emp_username);
                        int p = ps.executeUpdate();
                        if(p>0)
                        {
                            out.println("<script> alert ('Password Successfully Updated!');"
                                +"window.location='submit_fee.jsp'; "+"</script>");
                        }
                        else
                        {
                            out.println("<script> alert ('Something went WRONG! unable to change your password!');"
                                +"window.location='submit_fee.jsp'; "+"</script>");
                        }
                        
                    }
                    else
                    {
                       out.println("<script> alert ('Your Old Password Do not Match with our Database! Please try again.');"
                                +"window.location='changepass.jsp'; "+"</script>"); 
                    }   
                }
                
                
                if(emp_username.equalsIgnoreCase("null"))
                {
                    sql="select password from admin_login where username = '"+adminusername+"';";
                    rs = stmt.executeQuery(sql);
                    String password = "";
                    while(rs.next())
                        {
                            password = rs.getString("password");
                        }
                    
                    if(password.matches(old_password))
                    {
                        sql = "update admin_login set password=? where username=?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1,new_password);
                        ps.setString(2, adminusername);
                        int p = ps.executeUpdate();
                        if(p>0)
                        {
                            out.println("<script> alert ('Password Successfully Updated!');"
                                +"window.location='monthly_fund.jsp'; "+"</script>");
                        }
                        else
                        {
                            out.println("<script> alert ('Something went WRONG! unable to change your password!');"
                                +"window.location='submit_fee.jsp'; "+"</script>");
                        }
                        
                    }
                    else
                    {
                       out.println("<script> alert ('Your Old Password Do not Match with our Database! Please try again.');"
                                +"window.location='changepass.jsp'; "+"</script>"); 
                    }
                }
            
            }
            
            
            
            else
            {
                
                out.println("<script> alert ('New PassWord and Confirm Password do not match. Please try Again!');"
                                +"window.location='changepass.jsp'; "+"</script>");
            }
        %>
        
        
    </body>
</html>
