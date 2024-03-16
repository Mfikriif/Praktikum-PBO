/*
 * File     	 : Motor.java		16/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Motor yang berisi konstruktor, setter dan getter dari objek motor, hasil inheritance dari kelas kendaraan.
 *
*/

package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int CC;

    public Motor(String nama,int CC){
        super(nama);
        this.CC = CC;
    }

    public int getCC(){
        return CC;
    }

    public void setCC(int CC){
        this.CC = CC;
    }

    public double hitungHorsePower(int angka) {
        return (double) this.CC/angka;
    }
    
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis Kendaraan: Motor");
        System.out.println("CC Motor: " + getCC());
    }

    @Override
    public void klakson(){
        super.klakson();
        System.out.println("Tinn tiinn!");
    }

}
