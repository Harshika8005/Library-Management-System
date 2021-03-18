package library.management.system;

import java.sql.*; // This package contains classes and interfaces for JDBC API

public class conn{
    Connection c; //Interface
    Statement s; //Interface
    public conn(){ 
        try{
            Class.forName("com.mysql.jdbc.Driver"); //Register the driver class
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","root"); //Create connection
            s = c.createStatement(); //Create statement
   
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
 