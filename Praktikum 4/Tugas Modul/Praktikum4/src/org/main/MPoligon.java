/*
 * File     	 : PersegiPanjang.java		13/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas MPoligon yang berisi realisasi dan instansiasi.
 *
*/

package org.main;
import org.bangungdatar.*;
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(5,10,3);
        segitiga.printInfo();
        System.out.println("Luas segitiga : " + segitiga.hitungLuasSegitiga());

    }
}
