/**
 * File     	 : Lingkarang.java		20/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi constructor kelas lingkaran
 *
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(double jejari){
        return PI*jejari*jejari;
    }
}
