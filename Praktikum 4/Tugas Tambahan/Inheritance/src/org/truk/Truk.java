/*
 * File     	 : Truk.java		16/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Truk yang berisi konstruktor, setter dan getter dari objek mobil, hasil inheritance dari kelas kendaraan.
 *
*/

package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan{
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama,int kapasitasMuatan){
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public Truk(){

    }

    public int getKapasitasMuatan(){
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan){
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getBeratMuatan(){
        return beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan){
        this.beratMuatan = beratMuatan;
    }

    public void muatBarang(int berat){

    }
    
    @Override
    public void klakson(){
        super.klakson();
        System.out.println("TONNN TOONNN");
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis Kendaraan: Truk");
        System.out.println("Kapasitas Muatan: " + getKapasitasMuatan());
        System.out.println("Berat Muatan: " + getBeratMuatan());
    }
}
