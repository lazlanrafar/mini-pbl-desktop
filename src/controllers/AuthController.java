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
    
    public int Registrasi(String nama, String no_ktp, String tempat_lahir, String tanggal_lahir, String email, String password, String telepon, String alamat){
        try {
            conn.Conn();
            String query = "INSERT INTO `user`(`id`, `role`, `nama`, `tempat_lahir`, `tanggal_lahir`, `no_ktp`, `email`, `password`, `telepon`, `alamat`) VALUES (NULL, 'user', '"+nama+"', '"+tempat_lahir+"', '"+tanggal_lahir+"', '"+no_ktp+"', '"+email+"', '"+password+"', '"+telepon+"', '"+alamat+"')";
            return conn.stat.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Registrasi " + e.getMessage());
            return 0;
        }
    }
}
