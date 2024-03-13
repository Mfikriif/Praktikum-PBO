/*
 * File     	 : Segitiga.java		13/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Segitiga yang berisi method hitungluas,dan printInfo.
 *
*/

package org.bangungdatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas;
    private double tinggi;
    public Segitiga(double alas,double tinggi,int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasSegitiga(){
        return alas*tinggi/2;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga dengan jumlah sisi " + this.getJumlahSisi());
    }
}
