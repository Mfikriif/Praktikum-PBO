/**
 * File     	 : BangunDatar.java		20/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi kelas abstrak untuk BangunDatar
 *
 */

public abstract class BangunDatar {

    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}