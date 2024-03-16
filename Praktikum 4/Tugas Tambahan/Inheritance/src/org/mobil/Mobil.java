/*
 * File     	 : Mobil.java		16/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Mobil yang berisi konstruktor, setter dan getter dari objek mobil, hasil inheritance dari kelas kendaraan.
 *
*/

package org.mobil;
import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil (String nama,int jumlahPintu){
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo() {
    super.cetakInfo();
    System.out.println("Jenis Kendaraan: Mobil");
    System.out.println("Jumlah Pintu Mobil: " + jumlahPintu);
    }


    public void bukaPintu(int nomorPintu){
        System.out.println("Membuka pintu mobil " + getNama() + " pintu " + nomorPintu);
    }

    @Override
    public void klakson(){
        super.klakson();
        System.out.println("PIMM PIMMM!!");
    }
}
