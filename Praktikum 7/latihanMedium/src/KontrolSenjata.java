/**
 * File     	 : KontrolSenajata.java		10/05/24
 * Nama penulis  : Muhammad Fikri Firdaus
 * NIM           : 24060122140115
 * Deskripsi     : class KontrolSenjata yang berisikan method dan fungsi untuk menembak dan mengilisi senjata.
 *
 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        if(senjata.getPeluru() > 0){
            return true;
        }else{
            return false;
        }
    }

    public void isiPeluru(int jmlPeluru){
        senjata.setPeluru(senjata.getPeluru() + jmlPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jmlPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(isAdaPeluru()){
            for(int i = 0; i <= jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println("TAR");
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }else{
            System.out.println("Peluru habis");
        }
    }

    public void menusuk(){
        if(senjata.isMenusuk()){
            System.out.println("crot");
        }else{
            System.out.println("Gagal menusuk, belum memasang bayonet");
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Senjata berhasil dipasangkan bayonet");
    }
}
