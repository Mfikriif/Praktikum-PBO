/**
 * File     	 : Kupu.java		10/05/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : Class Data yang berisika Generic class dari class kupu
 *
 */
public class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T isi){
        this.isi = isi;
    }

}
