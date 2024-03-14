public class Ogrenci {
    private int ogrenciId;
    private int ogrenciNot;

    public Ogrenci(int ogrenciId,int ogrenciNot){
        this.ogrenciId = ogrenciId;
        this.ogrenciNot = ogrenciNot;
    }

    public int getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(int ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public int getOgrenciNot() {
        return ogrenciNot;
    }

    public void setOgrenciNot(int ogrenciNot) {
        this.ogrenciNot = ogrenciNot;
    }

    public void ogrenciBilgileriYazdir(){
        System.out.println("Id: "+ogrenciId+" ,Not: "+ogrenciNot);
    }
}