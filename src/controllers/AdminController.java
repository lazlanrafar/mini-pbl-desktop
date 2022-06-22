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
    
    // =====================================================================================
    // Pengukuran Tanah
    // =====================================================================================
    
    public ResultSet getAllPengukuranTanah(){
        try {
            conn.Conn();
            String query = "SELECT * FROM pengajuan_ukur_tanah";
            conn.rs = conn.stat.executeQuery(query);
            
            return conn.rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Get Data Pengukuran Tanah " + e.getMessage());
            return conn.rs;
        }
    }
    
    // =====================================================================================
    // Sertifikat Tanah
    // =====================================================================================
    
    public ResultSet getAllSertifikatTanah(){
        try {
            conn.Conn();
            String query = "SELECT sertifikat_tanah.id,sertifikat_tanah.biaya,sertifikat_tanah.status, sertifikat_tanah.bukti_pembayaran,sertifikat_tanah.sertifikat_tanah,pengajuan_ukur_tanah.provinsi,pengajuan_ukur_tanah.kota, pengajuan_ukur_tanah.kecamatan, pengajuan_ukur_tanah.alamat_lengkap, ukuran_tanah.dokumen_pl, ukuran_tanah.panjang_tanah, ukuran_tanah.lebar_tanah FROM sertifikat_tanah JOIN pengajuan_ukur_tanah ON sertifikat_tanah.id_pengajuan = pengajuan_ukur_tanah.id JOIN ukuran_tanah ON ukuran_tanah.id_pengajuan = pengajuan_ukur_tanah.id";
            conn.rs = conn.stat.executeQuery(query);
            
            return conn.rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Get Data Sertifikat Tanah " + e.getMessage());
            return conn.rs;
        }
    }
    
    // =====================================================================================
    // Petugas Controller
    // =====================================================================================
    
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
