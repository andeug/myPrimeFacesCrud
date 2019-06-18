/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTutorial.Database;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mspace
 */
public class DatabaseConn {
     private static final String ADDRESS = "localhost";
    private static final String DB_NAME = "dbTEST";
    private static final String USER_NAME = "mysql";
    private static final String PASSWORD = "mysql123";
       public Connection getMysqlConnection() {
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://" + ADDRESS + ":3306/" + DB_NAME + "?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(url, USER_NAME, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            out.println(ex.getMessage());
            //out.println("Unable to connect to batabase.");

        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DatabaseConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    //test connection
    public static void main (String [] args){
        DatabaseConn obj = new DatabaseConn();
        System.out.println(obj.getMysqlConnection() != null ? "connected" : "error connecting");
    }
}
