/*
 * File     	 : PersegiPanjang.java		13/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Persegi panjang yang berisi method hitungluas,dan printInfo.
 *
*/

package org.bangungdatar;
import org.poligon.Poligon;
public class PersegiPanjang extends Poligon {
    private double panjang;
    private double lebar;
    public PersegiPanjang(double panjang,double lebar,int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang*lebar;
    }
    public void printInfo(){
        System.out.println("Bangun Persi Panjang berisi " + this.getJumlahSisi());
    }
}
