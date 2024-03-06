public class Asersi1 {
    public class  Asersi1 {
    }
    public static void main(String[] args) {
        int x=0;
        if(x>0){
            System.out.println("X bilangan positif");
        }else {
            assert (x<0):"ada kesalahan kode";
            System.out.println("X bilangan negatif");
        }
    }
}
