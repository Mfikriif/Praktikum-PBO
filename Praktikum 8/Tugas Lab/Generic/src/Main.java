/**
 * File     	 : Kupu.java		10/05/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Class Main yang berisikan instansiasi dari class Kupu, Ulat, Kepompong dan, KupuDewasa.
 *
*/
public class Main {
   public static void main(String[] args) {
        // Kamus
        Ulat K;
        Data<Kupu> anu;
        // Algoritma
        K = new Ulat();
        anu = new Data<Kupu>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
