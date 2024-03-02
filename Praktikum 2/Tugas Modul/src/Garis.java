/**
 * File     	 : Titik.java		28/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body dari MTitik.java
 *
 */


public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik titik){
        this.titikAwal = titik;
    }

    public void setTitikAkhir(Titik titik){
        this.titikAkhir = titik;
    }

    public double getPanjang(){
        return Math.sqrt((Math.pow(titikAwal.getAbsis(), 2)-Math.pow(titikAwal.getOrdinat(), 2))+(Math.pow(titikAwal.getAbsis(), 2)- Math.pow(titikAkhir.getOrdinat(),2)));
    }

    public double getGradien(){
        return ((titikAkhir.getOrdinat()- titikAwal.getOrdinat())/ titikAkhir.getAbsis()- titikAwal.getAbsis());
    }
}
