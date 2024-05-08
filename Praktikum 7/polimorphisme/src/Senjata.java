public class Senjata {
    private String bunyi;
    private int peluru;
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public void menembak(){
        System.out.println(getBunyi());
        System.out.println("Sisa peluru: " + (getPeluru()-1));
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
