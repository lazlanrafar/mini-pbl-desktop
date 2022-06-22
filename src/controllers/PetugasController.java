/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import configs.Conn;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class PetugasController {
    Conn conn = new Conn();
    
    public ResultSet getAllPengukuranTanah(){
        try {
            conn.Conn();
            String query = "SELECT ukuran_tanah.id, ukuran_tanah.waktu_pengukuran, ukuran_tanah.lebar_tanah, ukuran_tanah.panjang_tanah, ukuran_tanah.dokumen_pl, pengajuan_ukur_tanah.provinsi, pengajuan_ukur_tanah.kota, pengajuan_ukur_tanah.kecamatan, pengajuan_ukur_tanah.alamat_lengkap, pengajuan_ukur_tanah.status FROM ukuran_tanah JOIN pengajuan_ukur_tanah ON ukuran_tanah.id_pengajuan = pengajuan_ukur_tanah.id";
            conn.rs = conn.stat.executeQuery(query);
            
            return conn.rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Get Data Pengukuran Tanah " + e.getMessage());
            return conn.rs;
        }
    }
}
