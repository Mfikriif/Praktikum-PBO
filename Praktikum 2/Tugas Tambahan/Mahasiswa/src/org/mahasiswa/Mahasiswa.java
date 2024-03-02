/**
 * File     	 : Mahasiswa.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi konstruktor dari objek mahasiswa yang di realisasikan di Main.java
 *
 */
package org.mahasiswa;
import org.walimahasiswa.Walimahasiswa;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private String nik;
    private String nim;
    private Walimahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, Walimahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getNik(){
        return nik;
    }
    public Walimahasiswa getWali(){
        return wali;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali(Walimahasiswa wali){
        this.wali = wali;
    }
    public void setNama(String nama){
        this.nama  = nama;
    }
    public void cetak(){
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Nik\t\t\t: " + getNik());
        System.out.println("Nim\t\t\t: " + getNim());
        System.out.println("Jurusan\t\t: " + getJurusan());
        System.out.println("Dosen wali mahasiswa");
        System.out.println("Nama Wali\t: " + getWali().getNama());
        System.out.println("Nik\t\t\t: " +getWali().getNik());
        System.out.println("Nomor\t\t: " +getWali().getNomorHp());
        System.out.println("Alamat\t\t: "+getWali().getAlamat()+"\n");

    }

}
