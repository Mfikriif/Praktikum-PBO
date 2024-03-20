/**
 * File     	 : MLingkarang.java		20/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi instansiasi jari kelas Lingkarang.java
 *
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10.2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkarang: ");
        double jari = scan.nextDouble();
        System.out.println("Luas lingkarang dengan " + " jejari "+ jari+ "satuan adalah " + l.hitungLuas(jari));
    }
}
