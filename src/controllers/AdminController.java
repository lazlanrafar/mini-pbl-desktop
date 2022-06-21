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
            
            return conn.rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Get Data Petugas " + e.getMessage());
            return conn.rs;
        }
    }
    
    public void createPetugas(String nama, String no_ktp, String tempat_lahir, String tanggal_lahir, String email, String password, String telepon, String alamat){
        try {
            conn.Conn();
            String query = "INSERT INTO `user`(`id`, `role`, `nama`, `tempat_lahir`, `tanggal_lahir`, `no_ktp`, `email`, `password`, `telepon`, `alamat`) VALUES (NULL, 'petugas', '"+nama+"', '"+tempat_lahir+"', '"+tanggal_lahir+"', '"+no_ktp+"', '"+email+"', '"+password+"', '"+telepon+"', '"+alamat+"')";
            conn.stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Petugas Berhasil Ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Petugas. " + e.getMessage());
        }
    }
}
