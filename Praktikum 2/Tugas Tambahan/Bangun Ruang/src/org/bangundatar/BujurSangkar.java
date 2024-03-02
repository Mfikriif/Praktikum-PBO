/**
 * File     	 : BujurSangkar.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body dari Main.java
 *
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }
    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }
    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}
