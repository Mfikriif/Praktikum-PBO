/*
 * File     	 : Buku.java		08/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Buku yang berisi method untuk mengecek ketersediaan buku dan judul buku.
 *
*/

public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul){
        this.judul = judul;
        tersedia = true;
    }

    public String getJudul(){
        return judul;
    }

    public boolean isTersedia(){
        return tersedia;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }

}
