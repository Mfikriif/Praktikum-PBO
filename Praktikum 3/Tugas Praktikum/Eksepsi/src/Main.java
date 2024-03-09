/*
 * File     	 : Main.java		08/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Main yang berisi Instansiasi dari buku dan Anggota dan try catch dari exception maksimum peminjaman buku,dan ketidak tersediaan buku
 *
*/


public class Main {
    public static void main(String[] args) {
        //Instansiasi anggota
        Anggota anggota1 = new Anggota("M Fikri Firdaus");
        Anggota anggota2 = new Anggota("Nada Haifa");
        Anggota anggota3 = new Anggota("Nafa Tsaniya");
    
        //Instansiasi Buku
        Buku buku1 = new Buku("Si cantik di jembatan merah");
        Buku buku2 = new Buku("5cm");
        Buku buku3 = new Buku("Do It Yourself");
        Buku buku4 = new Buku("Mahir ngoding dengan bahasa pemrograman java");
        Buku buku5 = new Buku("Software Development");
        Buku buku6 = new Buku("Belajar Otodidak UI/UX");
        Buku buku7 = new Buku("How to be a fullstack engineer");

        try {
            anggota1.pinjamBuku(buku7);
            anggota1.pinjamBuku(buku3);
            anggota1.pinjamBuku(buku5);
            anggota1.pinjamBuku(buku4);

            anggota2.pinjamBuku(buku1);
            anggota2.pinjamBuku(buku4);

            anggota3.pinjamBuku(buku6);
            anggota3.pinjamBuku(buku2);

        } catch (BukuTidakTersediaException e) {
            System.out.println("Error:"+e.getMessage());
        } catch (MaksimumBukuTerpinjamException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}