/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.sql.*;
import configs.Conn;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class AuthController {
    Conn conn = new Conn();
    
    public ResultSet Login(String email, String password){
        try {
            conn.Conn();
            conn.rs = conn.stat.executeQuery("SELECT * FROM user WHERE email = '"+email+"' AND password = '"+password+"'");
            return conn.rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email atau Password Salah " + e.getMessage());
            return conn.rs;
        }
    }
}
