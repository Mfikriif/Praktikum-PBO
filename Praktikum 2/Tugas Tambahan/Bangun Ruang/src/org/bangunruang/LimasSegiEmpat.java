/**
 * File     	 : BujurSangkar.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body dan konstruktor dari MLimasSegiEmpat.java
 *
 */
package org.bangunruang;
import org.bangundatar.SegiEmpat;

public class LimasSegiEmpat{
    private double tinggi;
    private SegiEmpat alas;

    public LimasSegiEmpat(double tinggi, SegiEmpat alas){
        this.tinggi = tinggi;
        this.alas  = alas;
    }

    public double hitungVolume(){
        return (1.0/3)*alas.hitungLuas()*tinggi;
    }

    public double hitungLuasPermukaan(){
        return alas.hitungLuas()+(4 * alas.hitungLuas());
    }
}