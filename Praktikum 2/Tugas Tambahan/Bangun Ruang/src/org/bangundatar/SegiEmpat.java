/**
 * File     	 : SegiEmpat.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body/konstruktor dari MlimasSegiEmpat.java
 *
 */
package org.bangundatar;

public class SegiEmpat {
    private double panjangSisi;
    
    public SegiEmpat(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        double hasil = panjangSisi * panjangSisi;
        return hasil;
    }
}
