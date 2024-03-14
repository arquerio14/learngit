public class GeometrikSekil {

    private int en;
    private int boy;

    public GeometrikSekil(){
        System.out.println("Geometrik şekil oluşturuluyor.");

    }

    public GeometrikSekil(int en){
        this.en = en;
        System.out.println("Geometrik şekil oluşturuluyor.");

    }

    public GeometrikSekil(int en,int boy){
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik şekil oluşturuluyor.");

    }

    public void alanHesapla(){
        System.out.println("Alan: "+en*boy);
    }

    public void cevreHesapla(){
        System.out.println("Çevre: "+(en+boy)*2);
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "En:"+en+" Boy:"+boy;
    }
}
