public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle Bis = new Bus();

        kendaraan.calRent(50,1000);
        mobil.calRent(50, 1000);
        Bis.calRent(50,1000);

    }
}
