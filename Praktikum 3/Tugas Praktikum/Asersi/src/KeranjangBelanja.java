public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja(){
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item){
        assert(count <= 5):"Keranjang belanja sudah penuh";
        keranjang[count] = item;
        count = count + 1;
    }

    public void printItem(){
        for(int i = 0; i < keranjang.length; i++){
            System.out.println(keranjang[i]);
        }
    }
}
