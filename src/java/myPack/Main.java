package myPack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Vijay
 */
public class Main extends HttpServlet {
       
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
            String logintype=(String)request.getParameter("logintype");
            String username=(String)request.getParameter("username");
            String password=(String)request.getParameter("password");
            
            if(logintype.equals("Administrator"))
            {   
                Connection con=Connectivity.createConnection();
                PreparedStatement ps=con.prepareStatement("select * from admin_login where username=? and password=?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                    if(rs.next())
                    {
                        HttpSession session =request.getSession();
                        session.setAttribute("adminusername", rs.getString(2));
                        session.setAttribute(logintype,logintype);
                        response.sendRedirect("admin_home.jsp");
                    }
                    else
                    {
                        out.println("<script> alert ('Invalid Username or Password');"
                                +"window.location='index.html'; "+"</script>");
                        //out.println("<h1 style='color: #337ab7'>Wrong Username or Password</h1>");
                       // out.println("<a href='index.html'>Go back to Login</a>");
                        //response.sendRedirect("index.html");
                    }
            }
            if(logintype.equals("Director"))
            {
                Connection con=Connectivity.createConnection();
                PreparedStatement ps=con.prepareStatement("select * from director_info where username=? and password=?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                    if(rs.next())
                    {
                        HttpSession session =request.getSession();
                        session.setAttribute("director_username", rs.getString(2));
                        session.setAttribute(logintype,logintype);
                        response.sendRedirect("director_home.jsp");
                    }
                    else
                    {
                        out.println("<script> alert ('Invalid Username or Password');"
                                +"window.location='index.html'; "+"</script>");
                        
                        //out.println("<h1 style='color: #337ab7'>Wrong Username or Password</h1>");
                        //out.println("<a href='index.html'>Go back to Login</a>");
                        //response.sendRedirect("index.html");
                    }
            }
            if(logintype.equals("Account Office"))
            {
                Connection con=Connectivity.createConnection();
                PreparedStatement ps=con.prepareStatement("select * from account_staff_info where username=? and password=?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                    if(rs.next())
                    {
                        if(rs.getBoolean("active_status"))
                        {
                        HttpSession session =request.getSession();
                        session.setAttribute("emp_username", rs.getString(2));
                        session.setAttribute(logintype,logintype);
                        response.sendRedirect("account_staff.jsp");
                        }
                        else
                        {
                           
                           out.println("<h1 style='color: red;margin-left: 280px;'>Access Denied!</h1> \n");
                           out.println("<h2 style='color: red'>You are BLOCKED by admin. Contact to admin for re-activation of your account.</h2> \n");
                        out.println("<a href='index.html' style='margin-left: 300px;'>Go back to Login</a>");
                        }
                    }
                    else
                    {
                        out.println("<script> alert ('Invalid Username or Password');"
                                +"window.location='index.html'; "+"</script>");
                        
                        //out.println("<h1 style='color: #337ab7'>Wrong Username or Password</h1>");
                        //out.println("<a href='index.html'>Go back to Login</a>");
                        //response.sendRedirect("index.html");
                    }
            
            }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
