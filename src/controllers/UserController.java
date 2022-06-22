/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import configs.Conn;
import java.sql.*;
import javax.swing.JOptionPane;
import models.User;
/**
 *
 * @author USER
 */
public class UserController {
    Conn conn = new Conn();
    
    // =====================================================================================
    // Pengukuran Tanah
    // =====================================================================================
    
    public ResultSet getAllPengukuranTanah(){
        try {
            conn.Conn();
            String query = "SELECT * FROM `pengajuan_ukur_tanah` WHERE id_user = '"+User.id+"'";
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
            String query = "SELECT sertifikat_tanah.id,sertifikat_tanah.biaya,sertifikat_tanah.status, sertifikat_tanah.bukti_pembayaran,sertifikat_tanah.sertifikat_tanah,pengajuan_ukur_tanah.provinsi,pengajuan_ukur_tanah.kota, pengajuan_ukur_tanah.kecamatan, pengajuan_ukur_tanah.alamat_lengkap, ukuran_tanah.dokumen_pl, ukuran_tanah.panjang_tanah, ukuran_tanah.lebar_tanah FROM sertifikat_tanah JOIN pengajuan_ukur_tanah ON sertifikat_tanah.id_pengajuan = pengajuan_ukur_tanah.id JOIN ukuran_tanah ON ukuran_tanah.id_pengajuan = pengajuan_ukur_tanah.id WHERE id_user = '"+User.id+"'";
            conn.rs = conn.stat.executeQuery(query);
            
            return conn.rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Get Data Pengukuran Tanah " + e.getMessage());
            return conn.rs;
        }
    }
}
