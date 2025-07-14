package college.management.system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;


public class Conn {
    Connection c;
    Statement st;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem", "root", "root");
            //pass@123#$456
            st=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

   
    
}
