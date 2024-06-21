/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anggota;
import kelompok.*;

/**
 *
 * @author Rezka Norhafizah - 2210020150 - 4B REG PAGI SI BJM
 */
public class taniMember extends taniTeam{
    int idAnggota;
    String nama, jenisKelamin, alamat, telp;
    
    public taniMember(){};
    
    public void inputIdMember(int idMember){ 
        this.idAnggota = idMember;
    }
    
    public int getIdMember(){
        return this.idAnggota;
    }
    
    public void inputName(String name){ 
        this.nama = name;
    }
    
    public String getName(){
        return this.nama;
    }
    
    public void inputGender(String gender){ 
        this.jenisKelamin = gender;
    }
    
    public String getGender(){
        return this.jenisKelamin;
    }
    
    public void inputAddress(String address){ 
        this.alamat = address;
    }
    
    public String getAddress(){
        return this.alamat;
    }
    
    public void inputTelp(String telp){ 
        this.telp = telp;
    }
    
    public String getTelp(){
        return this.telp;
    }
}
