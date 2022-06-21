/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configs;

import java.sql.*;

/**
 *
 * @author USER
 */
public class connection {
    private static final String url = "jdbc:mysql://localhost/minipbl";
    private static final String user = "root";
    private static final String password = "";
    
    Connection conn;
    Statement stat;
    ResultSet rs;
    
    public void Conn() throws SQLException{
        conn = DriverManager.getConnection(url, user, password);
        stat = conn.createStatement();
    }
}
