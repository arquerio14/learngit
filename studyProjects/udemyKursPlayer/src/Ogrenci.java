public class Ogrenci extends Kisi {
    private int ogrenciNo;

    public Ogrenci(String isim, String soyisim, String telNo, int ogrenciNo) {
        super(isim, soyisim, telNo);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}
