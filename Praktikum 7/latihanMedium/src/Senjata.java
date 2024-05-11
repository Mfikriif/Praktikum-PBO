/**
 * File     	 : Senajata.java		10/05/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : class Senjata yang berisikan attribute untuk membangun objek senjata.
 *
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public boolean isMenusuk(){
        return menusuk;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}