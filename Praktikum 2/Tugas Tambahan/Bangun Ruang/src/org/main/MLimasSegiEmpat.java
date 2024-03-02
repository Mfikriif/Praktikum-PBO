/**
 * File     	 : BujurSangkar.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas main realisasi objek LimasSegiEmpat
 *
 */
package org.main;

import org.bangundatar.SegiEmpat;
import org.bangunruang.LimasSegiEmpat;

public class MLimasSegiEmpat {
    public static void main(String[] args) {
        
        SegiEmpat segiEmpatAlas = new SegiEmpat(10);
        LimasSegiEmpat limas = new LimasSegiEmpat(7, segiEmpatAlas);

        double volume = limas.hitungVolume();
        double luasPermukaan = limas.hitungLuasPermukaan();


        System.out.println("Volume Limas\t\t\t:" + volume);
        System.out.println("Luas permukaan Limas\t:" + luasPermukaan);
    }
}
