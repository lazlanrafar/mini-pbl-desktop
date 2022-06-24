/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routes;

import views.auth.authLogin;
import views.auth.authRegister;

/**
 *
 * @author USER
 */
public class Index {
    
    // Index Auth
    
    public void tabAuthLogin(){
        authLogin view = new authLogin();
        view.setVisible(true);
    }
    
    public void tabAuthRegistrasi(){
        authRegister view = new authRegister();
        view.setVisible(true);
    }
    
    // Index User
    
    public void tabUserPengukuranTanah(){
        views.user.PengukuranTanah view = new views.user.PengukuranTanah();
        view.setVisible(true);
    }
    
    public void tabUserPengukuranTanahCreate(){
        views.user.PengukuranTanahCreate view = new views.user.PengukuranTanahCreate();
        view.setVisible(true);
    }
    
    public void tabUserSertifikatTanah(){
        views.user.SertifikatTanah view = new views.user.SertifikatTanah();
        view.setVisible(true);
    }
    
    // Index Admin
    
    public void tabAdminPengukuranTanah(){
        views.admin.AdminPengukuranTanah view = new views.admin.AdminPengukuranTanah();
        view.setVisible(true);
    }
    
    public void tabAdminSertifikatTanah(){
        views.admin.AdminSertifikatTanah view = new views.admin.AdminSertifikatTanah();
        view.setVisible(true);
    }
    
    public void tabAdminPetugas(){
        views.admin.AdminPetugas view = new views.admin.AdminPetugas();
        view.setVisible(true);
    }
    
     public void tabAdminPetugasCreate(){
        views.admin.AdminPetugasCreate view = new views.admin.AdminPetugasCreate();
        view.setVisible(true);
    }
    
    // Index AdminPetugas
    
    public void tabPetugasPengukuranTanah(){
        views.petugas.PengukuranTanah view = new views.petugas.PengukuranTanah();
        view.setVisible(true);
    }
    
    
    //======================================================================================================
    // Utils
    //======================================================================================================
    
    public void handleModalUploadFile(){
        utils.UploadFile view = new utils.UploadFile();
        view.setVisible(true);
    }
}
