/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author LENOVO
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println(" ");

        //insert
       System.out.println("===insert");
       Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
       service.add(mhsAdd);
       System.out.println("Berhasil insert : " + mhsAdd);
       displayAll();

        //update 
       System.out.println("===update");
       Mahasiswa mhsUpdate = service.getById(5);
       System.out.println("Akan diupdate data lama: " + mhsUpdate);
       mhsUpdate.setName("Dinaya");
       System.out.println("dengan data baru: " + mhsUpdate);
       service.update(mhsUpdate);
       displayAll();
       
        //delete
        System.out.println("===delete");
        Mahasiswa mhsDelete = service.getById(5);
        System.out.println("Akan menghapus data dengan id 5" + mhsDelete);
        service.delete(mhsDelete);
        displayAll();
        
    }

    public static void displayAll(){
        List<Mahasiswa>listMhs = service.getAll();
        System.out.println("===displayAll");
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
    
}
