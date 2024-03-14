public class Bilgisayar {
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalar;

    public Bilgisayar(int cSayisi,int ramBoyutu,String[] ureticiFirmaAdi){
        this.cekirdekSayisi = cSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalar = ureticiFirmaAdi;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalar() {
        String[] kopyaUreticiFirmalar = new String[ureticiFirmalar.length];
        for (int i = 0;i < ureticiFirmalar.length;i++){
            kopyaUreticiFirmalar[i] = ureticiFirmalar[i];
        }
        return kopyaUreticiFirmalar;
    }
}