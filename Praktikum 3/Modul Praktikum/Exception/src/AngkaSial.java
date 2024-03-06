public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati Hati memasukan angka");
        }
    }
}
//PERTANYAAN:
//*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

//JAWABAN:
// tidak terjadi karena sudah masuk kedalam exception dan kode dibawahnya tidak akan di kerjakan
// dieksekusi karna untuk memberikan error massage kepada user atau pengguna bahwa terjadi kesalahan
