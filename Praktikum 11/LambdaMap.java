/**
 *  Nama : Muhammad Fikri Firdaus
 *  File : LambdaMap.java
 *  Tanggal : 29/05/2024
 *  Tugas praktikum
 */
import java.util.HashMap;
import java.util.Map;
public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140115", "Muhammad Fikri Firdaus");
        mahasiswaMap.put("24060122130073", "Baron Albana");
        mahasiswaMap.put("24060122120010", "Luthfan Lazuardi");
        mahasiswaMap.put("24060122140118", "Arya Ajisaputra sitbondo");

        mahasiswaMap.forEach((key,value)->{
            System.out.println("Key: " + key + " Value: " + value);
        });
    }
    
}