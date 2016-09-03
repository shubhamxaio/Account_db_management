<%-- 
    Document   : try
    Created on : May 14, 2016, 5:21:09 PM
    Author     : Shubham
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="myPack.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fee Info</title>
        
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="table-responsive">
            <table class="table table-condensed">
                <thead style="background-color: #009688; color: #ffffff;">
                    <th>Student ID</th>
                    <th>Roll Number</th>
                    <th>Student Name</th>
                    <th>Session</th>
                    <th>College</th>
                    <th>Course</th>
                    <th>Branch(if B.tech)</th>
                    <th>Year</th>
                    <th>Mobile Number</th>
                    <th>Tuition Fee</th>
                    <th>Hostel Fee</th>
                    <th>Transport Fee</th>
                    <th>Uniform Fee</th>
                    <th>Other Fee</th>
                    <th>First Installment</th>
                    <th>Second Installment</th>
                    <th>Total Amount in Digit</th>
                    <th>Total Amount in Words</th>
                    <th>Date</th>
                    <th>Entry Person</th>
                    
                </thead>
        <%
            
            Connection con = Connectivity.createConnection();
            Statement stmt = con.createStatement();
            String roll_no = request.getParameter("roll_no");
            String year = request.getParameter("student_of");
            String branch1 = request.getParameter("branch");
            String college1 = request.getParameter("college");
            String course_type1 = request.getParameter("course_type");
            String sql="";
            ResultSet rs= null;
            if(roll_no != null)
            {
                sql = "select * from student_info where roll_no='"+roll_no+"';"; 
            }
            if(branch1 != null && year != null && college1 != null)
            {
                sql = "select * from student_info where branch='"+branch1+"' AND student_of='"+year+"' AND college='"+college1+"';";
            }
            if(year != null && course_type1 !=null)
            {
                sql = "select * from student_info where student_of='"+year+"' AND course_type='"+course_type1+"';";
            }
            
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                //Retrieve by column name
                int student_id  = rs.getInt("student_id");
                String sessions = rs.getString("session");
                String student_name = rs.getString("student_name");
                String college = rs.getString("college");
                String course_type = rs.getString("course_type");
                String branch = rs.getString("branch");
                String student_of = rs.getString("student_of");
                String roll_no1 = rs.getString("roll_no");
                String mobile = rs.getString("mobile");
                String tuition_fee = rs.getString("tuition_fee");
                String hostel_fee = rs.getString("hostel_fee");
                String transport_fee = rs.getString("transport_fee");
                String uniform_fee = rs.getString("uniform_fee");
                String other_fee = rs.getString("other_fee");
                String first_installment = rs.getString("first_installment");
                String second_installment = rs.getString("second_installment");
                String total_in_digit = rs.getString("total_in_digit");
                String total_in_words = rs.getString("total_in_words");
                String date = rs.getString("date");
                String entry_person = rs.getString("entry_person");
        %>
        
                <tbody>
                    <tr>
                        <td><%=student_id %></td>
                        <td><%=roll_no1 %></td>
                        <td style="font-weight: bold;"><%=student_name %></td>
                        <td><%=sessions %></td>
                        <td><%=college %></td>
                        <td><%=course_type %></td>
                        <td><%=branch %></td>
                        <td><%=student_of %></td>
                        <td><%=mobile %></td>
                        <td><%=tuition_fee %></td>
                        <td><%=hostel_fee %></td>
                        <td><%=transport_fee %></td>
                        <td><%=uniform_fee %></td>
                        <td><%=other_fee %></td>
                        <td><%=first_installment %></td>
                        <td><%=second_installment %></td>
                        <td><%=total_in_digit %></td>
                        <td><%=total_in_words %></td>
                        <td><%=date %></td>
                        <td><%=entry_person %></td>
                    </tr>
                </tbody>
        
        <%
            }
            rs.close();
            stmt.close();
            con.close();
        %>
        
            </table>
        </div>
        <div class="col-md-offset-5">
            <button type="button" style="background-color: #009688; color: #ffffff;" onclick="window.print()" class="btn"><span class="glyphicon glyphicon-print"></span> Print</button>
            <a href="fee_info.jsp"><button class="col-sm-offset-1 btn btn-primary"><span class="glyphicon glyphicon-backward"></span> Back</button></a>
        </div>
    </body>
</html>
