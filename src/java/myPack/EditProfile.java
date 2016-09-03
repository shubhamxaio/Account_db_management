package myPack;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shubham
 */
public class EditProfile extends HttpServlet {
            String first_name = "";
            String last_name = "";
            String email = "";
            String mobile = "";
            String username = "";
            PreparedStatement ps=null;
    
          
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
            PrintWriter out = response.getWriter();
            first_name = request.getParameter("first_name");
            last_name  = request.getParameter("last_name");
            email      = request.getParameter("email");
            mobile     = request.getParameter("mobile");
            username   = request.getParameter("username");
            System.out.println(first_name+"  "+last_name+"  "+email+"  "+mobile+""+username+"abc");
            
            Connection con = Connectivity.createConnection();
            
            
            ps = con.prepareStatement("update account_staff_info set first_name=?, last_name=?, email=?, mobile=? where username=?");
            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, email);
            ps.setString(4, mobile);
            ps.setString(5, username);
            int p = ps.executeUpdate();
            
            if(p>0)
            {
            
            out.println("<script> alert ('Profile Updated Successfully!');"
                                +"window.location='edit_profile.jsp'; "+"</script>");
            }else
            {
               out.println("<script> alert ('Something Went Wrong! Unable to update your profile');"
                                +"window.location='edit_profile.jsp'; "+"</script>"); 
            }
        }catch(Exception ex)
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
