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
public class Router {
    
    // Router Auth
    
    public void tabAuthLogin(){
        authLogin view = new authLogin();
        view.setVisible(true);
    }
    
    public void tabAuthRegistrasi(){
        authRegister view = new authRegister();
        view.setVisible(true);
    }
    
    // Router User
    
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
    
    // Router Admin
    
    public void tabAdminPengukuranTanah(){
        views.admin.PengukuranTanah view = new views.admin.PengukuranTanah();
        view.setVisible(true);
    }
    
    public void tabAdminSertifikatTanah(){
        views.admin.SertifikatTanah view = new views.admin.SertifikatTanah();
        view.setVisible(true);
    }
    
    public void tabAdminPetugas(){
        views.admin.Petugas view = new views.admin.Petugas();
        view.setVisible(true);
    }
    
     public void tabAdminPetugasCreate(){
        views.admin.PetugasCreate view = new views.admin.PetugasCreate();
        view.setVisible(true);
    }
    
    // Router Petugas
    
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
