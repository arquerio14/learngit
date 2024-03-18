public class Personal extends Kisi {
    private String pozisyon;

    public Personal(String isim, long tcKimlik, int yaş, String pozisyon) {
        super(isim,tcKimlik,yaş);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Ad:"+getIsim()+" TC:"+getTcKimlik()+" Yaş:"+getYaş()+" Pozisyon:"+pozisyon;
    }
}
