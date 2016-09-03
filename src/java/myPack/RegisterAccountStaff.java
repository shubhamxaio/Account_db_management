package myPack;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterAccountStaff extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
            try
            {
            String username = (String)request.getParameter("username");
            String password = (String)request.getParameter("password");
            String first_name = (String)request.getParameter("first_name");
            String last_name = (String)request.getParameter("last_name");
            String college = (String)request.getParameter("college");
            float salary = Float.parseFloat(request.getParameter("salary"));
            String email = (String)request.getParameter("email");
            String mobile = (String)request.getParameter("mobile");
            
            Connection con = Connectivity.createConnection();
            PreparedStatement ps = con.prepareStatement("insert into account_staff_info (username,password,first_name,last_name,college,salary,email,mobile) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, first_name);
            ps.setString(4, last_name);
            ps.setString(5, college);
            ps.setFloat(6, salary);
            ps.setString(7, email);
            ps.setString(8, mobile);
            int p = ps.executeUpdate();
            ps.close();
            con.close();
            if(p>0)
            {
            PrintWriter out = response.getWriter();
            out.println("<script> alert ('Registration Successful!');"
                                +"window.location='register_account_staff.jsp'; "+"</script>");
            }
            
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
    }

}
