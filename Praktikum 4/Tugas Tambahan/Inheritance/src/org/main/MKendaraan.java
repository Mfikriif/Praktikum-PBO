/*
 * File     	 : Mobil.java		16/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas MKendaraan yang berisi instansiasi dari kelas Kendaraan, Motor, Mobil, dan Truk
 *
*/

package org.main;
import org.kendaraan.Kendaraan;
import org.truk.Truk;
import org.mobil.Mobil;
import org.motor.Motor;

public class MKendaraan {
    public static void main(String[] args) {

        Kendaraan kendaraanGelek = new Kendaraan("Gelek");

        Mobil mobil = new Mobil("Toyota86",2);
        Motor motor = new Motor("CBR 1000RR",1000);
        Truk truk = new Truk("Mercedes-Benz Actros",20);

        kendaraanGelek.klakson();

        mobil.klakson();
        motor.klakson();
        truk.klakson();

        System.out.println("\nMotor gelek dapat diperkirakan memiliki horsepower antara " + motor.hitungHorsePower(17) + " sampai " +motor.hitungHorsePower(15));
        

        mobil.bukaPintu(2);
        mobil.gas(120, 4000);
        mobil.berhenti();

        mobil.cetakInfo();
        // truk.cetakInfo();
        motor.cetakInfo();

        truk.setBeratMuatan(12);
        truk.cetakInfo();
    }
}
