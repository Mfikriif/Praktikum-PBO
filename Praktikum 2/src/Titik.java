/**
 * File     	 : Titik.java		28/02/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas yang berisi body dari MTitik.java
 *
 */
public class Titik
{
    private double absis;
    private double ordinat;
    private static double counterTitik;
    private Titik Titik;

    Titik()
    {

        absis = 0;
        ordinat = 0;
        counterTitik = counterTitik + 1;

    }

    Titik(double absis, double ordinat)
    {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik = counterTitik + 1;
    }


    public void setAbsis(double abs){
        absis = abs;
    }
    public void setOrdinat(double ord){
        ordinat = ord;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }


    public static double getCounterTitik(){
        return counterTitik;
    }
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis,2)+ Math.pow(this.ordinat,2));
    }

    public void refleksiX(Titik titik){
         double ordinat = titik.getOrdinat();
         ordinat = ordinat * -1;
         titik.setOrdinat(ordinat);
    }

    public void refleksiY(Titik titik){
        double absis = titik.getAbsis();
        absis = absis * -1;
        titik.setAbsis(absis);
    }

    public void getRefleksiX(Titik titik){
        refleksiX(titik);
    }

    public void getRefleksiY(Titik titik){
        refleksiY(titik);
    }


}


