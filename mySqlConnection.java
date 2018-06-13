
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pramukhcomputer
 */
public class mySqlConnection {
    
   
    Connection conn=null;
    public static Connection connectDb()
    {
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-PF9L210:1522:XE","system","foram");
        JOptionPane.showMessageDialog(null,"Connection established.");
        return conn;
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
}

