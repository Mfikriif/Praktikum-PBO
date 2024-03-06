class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double HitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -1;
        assert (jariJari > 0): "jari-jari tidak boleh NOL!!";
        Lingkaran lingkaran1 = new Lingkaran(jariJari);
        double Hitungkeliling = lingkaran1.HitungKeliling();
        System.out.println("Hitung keliling lingkaran = " + Hitungkeliling);
    }
}

//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
//secara konsep tidak ada yang kurang tepat karna untuk assertion kondisinya harus terpenuhi jika tidka maka assertion akan muncul