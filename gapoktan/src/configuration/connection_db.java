/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;//coding crud
/**
 *
 * @author Rezka Norhafizah - 2210020150
 */
public class connection_db {
    private String databaseName = "2210020150";
    private String username = "root";
    private String password = "";
    
    public static Connection koneksi;
    
    public connection_db(){
    
        try {
            String url = "jdbc:mysql://localhost/"+this.databaseName;
            koneksi = DriverManager.getConnection(url,this.username,this.password);
            System.out.println("database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public void simpanPpl(String id_ppl, String nama, String jenis_kelamin, String no_hp, String alamat){
        try {
            String sql = "INSERT INTO ppl (id_ppl, nama, jenis_kelamin, no_hp, alamat) value(?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_ppl);
            perintah.setString(2, nama);
            perintah.setString(3, jenis_kelamin);
            perintah.setString(4, no_hp);
            perintah.setString(5, alamat);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPpl(String id_ppl, String nama, String jenis_kelamin, String no_hp, String alamat){
        try {
            String sql = "UPDATE ppl SET nama=? , jenis_kelamin=?, no_hp=?, alamat=? WHERE id_ppl=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, jenis_kelamin);
            perintah.setString(3, no_hp);
            perintah.setString(4, alamat);
            perintah.setString(5, id_ppl);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPpl(String id_ppl){
        try {
            String sql = "DELETE FROM ppl WHERE id_ppl=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id_ppl);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPpl(String id_ppl) {
        try {
            String sql ="SELECT * FROM ppl WHERE id_ppl=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id_ppl);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("id_ppl"));
                System.out.println(data.getString("nama"));
                System.out.println(data.getString("jenis_kelamin"));
                System.out.println(data.getString("no_hp"));
                System.out.println(data.getString("alamat"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanAnggota(String id, String nama_kelompok, String nama, String jk, String alamat, String no_hp){
        try {
            String sql = "INSERT INTO anggota (id, nama_kelompok, nama, jk, alamat, no_hp) value(?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, nama_kelompok);
            perintah.setString(3, nama);
            perintah.setString(4, jk);
            perintah.setString(5, alamat);
            perintah.setString(6, no_hp);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahAnggota(String id, String nama_kelompok, String nama, String jk, String alamat, String no_hp){
        try {
            String sql = "UPDATE anggota SET nama_kelompok=? , nama=?, jk=?, alamat=?, no_hp=? WHERE id=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, nama_kelompok);
            perintah.setString(2, nama);
            perintah.setString(3, jk);
            perintah.setString(4, alamat);
            perintah.setString(5, no_hp);
            perintah.setString(6, id);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusAnggota(String id){
        try {
            String sql = "DELETE FROM anggota WHERE id=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariAnggota(String id) {
        try {
            String sql ="SELECT * FROM anggota WHERE id=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("id"));
                System.out.println(data.getString("nama_kelompok"));
                System.out.println(data.getString("nama"));
                System.out.println(data.getString("jk"));
                System.out.println(data.getString("alamat"));
                System.out.println(data.getString("no_hp"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanKelompok(String id, String nama_desa, String nama_ketua, String nama_kelompok, String jumlah_anggota){
        try {
            String sql = "INSERT INTO kelompok (id, nama_desa, nama_ketua, nama_kelompok, jumlah_anggota) value(?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, nama_desa);
            perintah.setString(3, nama_ketua);
            perintah.setString(4, nama_kelompok);
            perintah.setString(5, jumlah_anggota);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKelompok(String id, String nama_desa, String nama_ketua, String nama_kelompok, String jumlah_anggota){
        try {
            String sql = "UPDATE kelompok SET nama_desa=? , nama_ketua=?, nama_kelompok=?, jumlah_anggota=? WHERE id=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, nama_desa);
            perintah.setString(3, nama_ketua);
            perintah.setString(4, nama_kelompok);
            perintah.setString(5, jumlah_anggota);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKelompok(String id){
        try {
            String sql = "DELETE FROM kelompok WHERE id=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariKelompok(String id) {
        try {
            String sql ="SELECT * FROM kelompok WHERE id=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("id"));
                System.out.println(data.getString("nama_desa"));
                System.out.println(data.getString("nama_ketua"));
                System.out.println(data.getString("nama_kelompok"));
                System.out.println(data.getString("jumlah_anggota"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanPanen(String id, String tgl_tanam, String tgl_panen, String nama, String nama_bantuan, String jumlah, String satuan, String jumlah_panen, String jumlah_gagal, String ulasan){
        try {
            String sql = "INSERT INTO panen (id, tgl_tanam, tgl_panen, nama, nama_bantuan, jumlah, satuan, jumlah_panen, jumlah_gagal, ulasan) value(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, tgl_tanam);
            perintah.setString(3, tgl_panen);
            perintah.setString(4, nama);
            perintah.setString(5, nama_bantuan);
            perintah.setString(6, jumlah);
            perintah.setString(7, satuan);
            perintah.setString(8, jumlah_panen);
            perintah.setString(9, jumlah_gagal);
            perintah.setString(10, ulasan);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPanen(String id, String tgl_tanam, String tgl_panen, String nama, String nama_bantuan, String jumlah, String satuan, String jumlah_panen, String jumlah_gagal, String ulasan){
        try {
            String sql = "UPDATE panen SET tgl_tanam=? , tgl_panen=?, nama=?, nama_bantuan=?, jumlah=?, satuan=?, jumlah_panen=?, jumlah_gagal=?, ulasan=? WHERE id=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, tgl_tanam);
            perintah.setString(2, tgl_panen);
            perintah.setString(3, nama);
            perintah.setString(4, nama_bantuan);
            perintah.setString(5, jumlah);
            perintah.setString(6, satuan);
            perintah.setString(7, jumlah_panen);
            perintah.setString(8, jumlah_gagal);
            perintah.setString(9, ulasan);
            perintah.setString(10, id);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPanen(String id){
        try {
            String sql = "DELETE FROM panen WHERE id=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPanen(String id) {
        try {
            String sql ="SELECT * FROM panen WHERE id=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,id);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("id"));
                System.out.println(data.getString("tgl_tanam"));
                System.out.println(data.getString("tgl_panen"));
                System.out.println(data.getString("nama"));
                System.out.println(data.getString("nama_bantuan"));
                System.out.println(data.getString("jumlah"));
                System.out.println(data.getString("satuan"));
                System.out.println(data.getString("jumlah_panen"));
                System.out.println(data.getString("jumlah_gagal"));
                System.out.println(data.getString("ulasan"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
