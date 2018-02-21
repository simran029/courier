/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saini1
 */
public class OracleConnection {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
    Class.forName("oracle.jdbc.driver.OracleDriver");  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","simran","12345");  
return(con);
    }
}
