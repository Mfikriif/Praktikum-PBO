/**
 * File     	 : BujurSangkar.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body/konstruktor dari Main.java
 *
 */
package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }
    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi;
    }
    public double hitungLuasAlas(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi*panjangSisi*panjangSisi;
    }


}
