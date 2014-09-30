/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.survey.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import com.survey.dbconnection.ConnectionProvider;
import com.survey.handler.UserHandler;

/**
 *
 * @author MAfzal
 */
public class ConnectionProvider {
    
 private static Connection con = null;

/**
 * Use mysql database jdbc drivers for the connection 
 * database name = "survey"
 * username = "root"
 * password = there is no password
 * @return con "connection"
 *         
 */ 
 
    public static Connection getConnection() {
        if (con != null)
            return con;
        else {
            try {
                
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/survey";
                String user = "root";
                String password = "";
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException cnfe) {
                System.out.println(cnfe);
            } catch (SQLException sqe) {
                System.out.println(sqe);
            } 
            return con;
        }

    }
}
