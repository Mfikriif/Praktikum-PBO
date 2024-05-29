/**
 *  Nama : Muhammad Fikri Firdaus
 *  File : LambdaList.java
 *  Tanggal : 29/05/2024
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        Map<Integer, String>ListNamaMahasiswa = new HashMap<>();
        
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        ListNamaMahasiswa.put(1,"Muhammad Fikri Firdaus");
        ListNamaMahasiswa.put(2,"Rahman Hanif Aji Saputra");
        ListNamaMahasiswa.put(3,"Arya Ajisada situmbobob");

        mahasiswaList.forEach((nama)-> System.out.println(nama));

        ListNamaMahasiswa.forEach((key,value)->{
            System.out.println("key: " + key + "value:" + value);
        });
    }
}