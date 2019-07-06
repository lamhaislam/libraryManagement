/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import java.sql.*;

/**
 *
 * @author User
 */
public class DBConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123");
        } catch (Exception e) {
        }
        return con;
    }
}
