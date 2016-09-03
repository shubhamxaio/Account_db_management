package myPack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Shubham
 */
public class FeeUpdate extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FeeUpdate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FeeUpdate at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
            String acadmeic_year = (String)request.getParameter("acadmeic_year");
            
            String received_from = (String)request.getParameter("received_from");
            String student_name = (String)request.getParameter("student_name");
            String year = (String)request.getParameter("year");
            String college = (String)request.getParameter("college");
            String course = (String)request.getParameter("course");
            String branch = (String)request.getParameter("branch");
            String submit_type = (String)request.getParameter("submit_type");
            String dd_no = (String)request.getParameter("dd_no");
            String tuition_fee=(String)request.getParameter("tuition_fee");
            String hostel_fee = (String)request.getParameter("hostel_fee");
            String transport_fee = (String)request.getParameter("transport_fee");
            String uniform_fee = (String)request.getParameter("uniform_fee");
            String other_fee = (String)request.getParameter("other_fee");
            String total_in_digit = (String)request.getParameter("total_in_digit");
            String total_in_words = (String)request.getParameter("total_in_words");
            String date = (String)request.getParameter("date");
            String roll_no=(String)request.getParameter("roll_no");
            //System.out.println(session+" "+student_name+" "+college+" "+course_type+" "+branch+" "+student_of+" "+roll_no+" "+mobile+" "+tuition_fee+" "+hostel_fee+" "+transport_fee+" "+hostel_fee+" "+uniform_fee+" "+other_fee+" "+first_installment+" "+second_installment+" "+total_in_digit+" "+total_in_words+" "+date);
            HttpSession sessions =request.getSession();
            String entry_person = (String)sessions.getAttribute("emp_username");
            /*
            Connection con = Connectivity.createConnection();
            PreparedStatement ps = con.prepareStatement("insert into fees_update (Academic_year,Received_from,Student_name,Student_of,college,course_type,Branch,cash,dd_no,tuition_fee,hostel_fee,transport_fee,uniform_fee,other_fee,total_in_digit,total_in_words,date,roll_no) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, acadmeic_year);
            ps.setString(2, received_from);
            ps.setString(3, student_name);
            ps.setString(4, year);
            ps.setString(5, college);
            ps.setString(6, course);
            ps.setString(7, branch);
            ps.setString(8, submit_type);
            ps.setString(9, dd_no);
            ps.setString(10, tuition_fee);
            ps.setString(11, hostel_fee);
            ps.setString(12, transport_fee);
            ps.setString(13,uniform_fee);
            ps.setString(14, other_fee);
            ps.setString(15, total_in_digit);
            ps.setString(16, total_in_words);
            ps.setString(17, date);
            ps.setString(18, roll_no);
           // ps.setString(19, roll_no);
            ps.executeUpdate();
            ps.close();
            PrintWriter out = response.getWriter();
            out.println("<h1>Data Recorded successfully!</h1>");
            out.println("<a href='new_student_account.jsp'>Want to add More records?</a>");
            System.out.println(acadmeic_year+"hello"); */
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
