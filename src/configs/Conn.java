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
public class Conn {
    String url = "jdbc:mysql://localhost:3306/minipbl";
    String user = "root";
    String password = "";
    
    public Connection conn;
    public Statement stat;
    public ResultSet rs;
    
    public void Conn() throws SQLException{
        conn = DriverManager.getConnection(url, user, password);
        stat = conn.createStatement();
    }
}
