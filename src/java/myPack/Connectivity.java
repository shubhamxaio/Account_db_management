package myPack;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Temprlates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */
public class Connectivity 
{
    public static Connection con =null;
    public static Connection createConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sgi","xaio","root");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return con;
    }
    
    
}
