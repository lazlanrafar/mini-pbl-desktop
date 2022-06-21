/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import configs.Conn;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author USER
 */
public class AdminController {
    
    Conn conn = new Conn();
    // Petugas Controller
    
    public ResultSet getAllPetugas(){
        try {
            conn.Conn();
            String query = "SELECT * FROM user WHERE role = 'petugas'";
            conn.rs = conn.stat.executeQuery(query);
            
            System.out.println(conn.rs);
            return conn.rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Get Data Petugas " + e.getMessage());
            return conn.rs;
        }
    }
}
