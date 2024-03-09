/*
 * File     	 : Anggota.java		08/03/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Kelas Anggota yang berisi method nama, buku,dan peminjaman buku.
 *
*/

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman = new Buku[3];
    private int jumlahBukuPinjaman = 0;

    public Anggota(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public Buku[] getBukuPinjaman(){
        return bukuPinjaman;
    }
    public int getJumlahBukuPinjaman(){
        return jumlahBukuPinjaman;
    }
    public void pinjamBuku(Buku buku) throws 
    MaksimumBukuTerpinjamException,BukuTidakTersediaException{
        if(jumlahBukuPinjaman >= 3){
            throw new MaksimumBukuTerpinjamException("Buku yang kamu pinjam sudah lebih dari batas maksimum");
        }

        if(!buku.isTersedia()){
            throw new BukuTidakTersediaException("Buku "+ buku.getJudul() +" tidak tersedia");
        }

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Peminjam: " + getNama()+"\n");

    }
}
