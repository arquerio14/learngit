public class Kisi {
    private String isim;
    private long tcKimlik;
    private int yaş;

    public  Kisi(){
        isim = "Henüz atanmadı.";
        tcKimlik = 0;
        yaş=0;
    }

    public Kisi(String isim,long tcKimlik,int yaş){
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYaş(yaş);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    @Override
    public String toString() {
        return "Ad:"+isim+" TC:"+tcKimlik+" Yaş:"+yaş;
    }
}
