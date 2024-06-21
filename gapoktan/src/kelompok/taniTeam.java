/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok;

/**
 *
 * @author Rezka Norhafizah - 2210020150 - 4B REG PAGI SI BJM
 */
public class taniTeam {
    int idKelompok, jmlAnggota;
    String namaDesa, namaKetua, namaKelompok;
    
    public taniTeam(){}; 
    
    public void inputIdTeam(int idTeam){ 
        this.idKelompok = idTeam;
    }
    
    public int getIdTeam(){
        return this.idKelompok;
    }
    
    public void inputTeamName(String teamName){
        this.namaKelompok = teamName;
    }
    
    public String getTeamName(){
        if (this.idKelompok == 1){
            this.namaKelompok = "Supernova";
        } else if (this.idKelompok == 2) {
            this.namaKelompok = "Greenland";
        }
        return this.namaKelompok;
    }
    
    public void inputVillageName(String villageName){
        this.namaDesa = villageName;
    }
    
    public String getVillageName(){
        if (this.idKelompok == 1){
            this.namaDesa = "Balimau";
        } else if (this.idKelompok == 2) {
            this.namaDesa = "Kalumpang";
        }
        return this.namaDesa;
    }
    
    public void inputLeaderName(String leaderName){
        this.namaKetua = leaderName;
    }
    
    public String getLeaderName(){
        if (this.idKelompok == 1){
            this.namaKetua = "Jessica";
        } else if (this.idKelompok == 2) {
            this.namaKetua = "Karina";
        }
        return this.namaKetua;
    }
    
    public void inputTotalMembers(int totalMembers){ 
        this.jmlAnggota = totalMembers;
    }
    
    public int getTotalMembers(){
        return this.jmlAnggota;
    }
}
