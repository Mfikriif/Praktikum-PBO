public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.addItem("Buku");
        keranjang.addItem("Pensil");
        keranjang.addItem("Penhapus");
        keranjang.addItem("Penggaris");
        keranjang.addItem("Meja Lipat");
        // keranjang.addItem("Cermin");

        keranjang.printItem();
    }
}