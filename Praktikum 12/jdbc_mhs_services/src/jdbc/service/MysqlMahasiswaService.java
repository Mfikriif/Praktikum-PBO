/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author LENOVO
 */
public class MysqlMahasiswaService {

    Connection koneksi = null;
    //Constructor
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }

    //membuat objek mahasiswa
    public Mahasiswa makeMhsObeject(){
        return new Mahasiswa();
    }

    //menambahkan data mahasiswa
    public void add(Mahasiswa mhs){
        try {
            String query = "INSERT INTO MAHASISWA (ID,NAME) VALUES (?,?)";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setInt(1, mhs.getId());
            statement.setString(2, mhs.getName());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //mengupdate mahasiswa
    public void update(Mahasiswa mhs){
        try {
            String query = "UPDATE MAHASISWA SET name = ? WHERE id = ?";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setString(1,mhs.getName());
            statement.setInt(2,mhs.getId());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // menghapus mahasiswa sesuai dengan id yang di inginkan
    public void delete(Mahasiswa mhs){
        try {
            String query = "DELETE FROM Mahasiswa WHERE id = ?";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setInt(1, mhs.getId());
            statement.executeUpdate();
            statement.close();

        } catch (Exception e) { 
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    //mengambil mahasiswa sesuai dengan id yang di tentukan
    public Mahasiswa getById(int id){
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM MAHASISWA WHERE id = ?";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                mhs = new Mahasiswa(rs.getInt("id"),rs.getString("name"));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    //mengambil semua isi dari tabel mahasiswa
    public List<Mahasiswa>getAll(){
        List<Mahasiswa>listMhs = new ArrayList<>();
        try {
            String query = "SELECT * FROM Mahasiswa";
            Statement statement = koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa(rs.getInt("id"), rs.getString("name"));
                listMhs.add(mhs);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return listMhs;
    }

}
