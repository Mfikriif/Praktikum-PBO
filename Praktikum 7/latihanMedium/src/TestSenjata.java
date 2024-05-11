/**
 * File     	 : TestSenjata.java		10/05/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : class TestSenjata merupakan class main untuk instansiasi objek senjata dan menguji metdod serta fungsi yang ada pada class KontrolSenjata.java.
 *
 */
public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);

        System.out.println("===========================");

        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
        
        
        
    }
}
