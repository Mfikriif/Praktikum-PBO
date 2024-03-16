/*
 * File     	 : Mobil.java		16/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Kendaraan yang berisi konstruktor, setter, getter, dan sebagai parent dari kelas Motor, Mobil, dan Truk
 *
*/

package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama){
        this.nama = nama;
    }

    public Kendaraan(){

    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public void gas(int kecepatan, int durasi){
        System.out.println("\nGaspol kendaraan");
        System.out.println("kendaraan bergerak dengan kecapatan: " + kecepatan + "km/h");
        System.out.println("Dengan durasi: " + durasi + "detik");
    }

    public void berhenti(){
        System.out.println("Menghentikan kendaraan");
        this.kecepatan = 0;
        System.out.println("Kendaraan telah berhenti");   
    }

    public void cetakInfo(){
        System.out.println("\nNama Kendaraan: " + getNama());
        System.out.println("Kecepatan kendaraan: " + getKecepatan());
    }

    public void klakson(){
        System.out.println("\nKendaraan " + nama + " Berbunyi");
    }

}
