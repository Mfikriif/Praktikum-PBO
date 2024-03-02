/**
 * File     	 : Titik.java		28/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body dari MTitik.java
 *
 */
public class MGaris {
    public static void main(String[] args) {
        Titik t1 =  new Titik(3,5);
        Titik t2 = new Titik(7,8);
        Garis garis1 = new Garis(t1,t2);

        System.out.println("Titik awal garis1: " + garis1.getTitikAwal());

    }
}
