/**
 * Nama : Muhammad Fikri Firdaus
 * File : DiskonLambada.java
 * Tanggal : 29/05/2024
 */
interface IDiskon{
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa menggunakan lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        //menggunakan lambda 
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //lambda dengan block statement
        IDiskon diskonBiasa = (harga) ->{
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "  + diskonBiasa.hitungDiskon(45000));
    }
    
}