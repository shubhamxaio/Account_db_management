package myPack;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StudentRegistration extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
            String session = (String)request.getParameter("session");
            String student_name = (String)request.getParameter("student_name");
            String college = (String)request.getParameter("college");
            String course_type = (String)request.getParameter("course_type");
            String branch = (String)request.getParameter("branch");
            String student_of = (String)request.getParameter("student_of");
            String roll_no = (String)request.getParameter("roll_no");
            String mobile = (String)request.getParameter("mobile");
            String tuition_fee = (String)request.getParameter("tuition_fee");
            String hostel_fee = (String)request.getParameter("hostel_fee");
            String transport_fee = (String)request.getParameter("transport_fee");
            String uniform_fee = (String)request.getParameter("uniform_fee");
            String other_fee = (String)request.getParameter("other_fee");
            String first_installment = (String)request.getParameter("first_installment");
            String second_installment = (String)request.getParameter("second_installment");
            String total_in_digit = (String)request.getParameter("total_in_digit");
            String total_in_words = (String)request.getParameter("total_in_words");
            String date = (String)request.getParameter("date");
            
            //System.out.println(session+" "+student_name+" "+college+" "+course_type+" "+branch+" "+student_of+" "+roll_no+" "+mobile+" "+tuition_fee+" "+hostel_fee+" "+transport_fee+" "+hostel_fee+" "+uniform_fee+" "+other_fee+" "+first_installment+" "+second_installment+" "+total_in_digit+" "+total_in_words+" "+date);
            HttpSession sessions =request.getSession();
            String entry_person = (String)sessions.getAttribute("emp_username");
            
            Connection con = Connectivity.createConnection();
            PreparedStatement ps = con.prepareStatement("insert into student_info (session,student_name,college,course_type,branch,student_of,roll_no,mobile,tuition_fee,hostel_fee,transport_fee,uniform_fee,other_fee,first_installment,second_installment,total_in_digit,total_in_words,date,entry_person) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, session);
            ps.setString(2, student_name);
            ps.setString(3, college);
            ps.setString(4, course_type);
            ps.setString(5, branch);
            ps.setString(6, student_of);
            ps.setString(7, roll_no);
            ps.setString(8, mobile);
            ps.setString(9, tuition_fee);
            ps.setString(10, hostel_fee);
            ps.setString(11, transport_fee);
            ps.setString(12, uniform_fee);
            ps.setString(13, other_fee);
            ps.setString(14, first_installment);
            ps.setString(15, second_installment);
            ps.setString(16, total_in_digit);
            ps.setString(17, total_in_words);
            ps.setString(18, date);
            ps.setString(19, entry_person);
            ps.executeUpdate();
            ps.close();
            PrintWriter out = response.getWriter();
            out.println("<h1>Data Recorded successfully!</h1>");
            out.println("<a href='new_student_account.jsp'>Want to add More records?</a>");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
