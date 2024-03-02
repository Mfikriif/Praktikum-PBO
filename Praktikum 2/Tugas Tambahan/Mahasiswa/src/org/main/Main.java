/**
 * File     	 : Mahasiswa.java		29/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi realisasi dari objek mahasiswa dan walimahasiswa
 *
 */
package org.main;
import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.Walimahasiswa;

public class Main {
    public static void main(String[] args) {
        //objek dosen wali
        Walimahasiswa wali1 = new Walimahasiswa(
                "Andi G.A",
                "42389578",
                "0878776353",
                "Tembalang selatan"
        );

        Walimahasiswa wali2 = new Walimahasiswa(
                "M Fakhri",
                "4834923",
                "087835325566",
                "Klipang raya nomor 14"
        );
        
        //objek mahasiswa
        Mahasiswa mahasiswa1 =  new Mahasiswa(
                "Mahammad Fikri Firdaus",
                "4728937492",
                "24060122140115",
                "Teknik Informatika",
                wali1
        );

        Mahasiswa mahasiswa2 = new Mahasiswa(
                "Abdul mujahid",
                "489289544",
                "2406012212011",
                "Teknik Mesin",
                wali2
        );

        Mahasiswa mahasiswa3 = new Mahasiswa(
                 "Muhammad Fajri Nur Iman",
                 "2340980324", 
                 "24060122130015", 
                 "Teknik Sipil",
                 wali2
        );

        Mahasiswa mahasiswa4 = new Mahasiswa(
                 "Syarif Muhammad Rojak",
                 "548952982", 
                 "24060122130215", 
                 "Biologi",
                 wali2
        );


        wali2.setNama("Muhammad Fakhri Zaidan");

         mahasiswa1.cetak();
         mahasiswa2.cetak();
         mahasiswa3.cetak();
         mahasiswa4.cetak();



    }
}