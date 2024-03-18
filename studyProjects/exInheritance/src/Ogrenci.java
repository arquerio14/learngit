public class Ogrenci extends Kisi {
    private int okulNo;

    public Ogrenci(String isim, long tcKimlik, int yaş, int okulNo) {
        super(isim,tcKimlik,yaş);
        this.okulNo = okulNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "Ad:"+getIsim()+" TC:"+getTcKimlik()+" Yaş:"+getYaş()+" Okul No:"+okulNo;
    }
}
