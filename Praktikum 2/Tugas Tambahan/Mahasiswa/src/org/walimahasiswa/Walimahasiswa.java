/**
 * File     	 : Mahasiswa.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body/konstruktor dari objek walimahasiswa yang di realisasikan di Main.java
 *
 */
package org.walimahasiswa;

public class Walimahasiswa {
    private String nama;
    private String alamat;
    private String nomorHp;
    private String nik;

    public Walimahasiswa(String nama, String nik ,String nomorHp, String alamat){
        this.nama = nama;
        this.nik = nik;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getNik(){
        return nik;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
