public class Car extends Vehicle {
    void calRent (int jarak, float harga){
        float tarif = jarak * 100.00f;
        System.out.println("Harga tarif kendarraan; " + tarif);
    }
}
