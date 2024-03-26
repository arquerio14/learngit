public class Egitmen extends Kisi {
    private int egitmenNo;

    public Egitmen(String isim, String soyisim, String telNo, int egitmenNo,Kurs ... kurs) {
        super(isim, soyisim, telNo);
        this.egitmenNo = egitmenNo;
    }

    public int getEgitmenNo() {
        return egitmenNo;
    }

    public void setEgitmenNo(int egitmenNo) {
        this.egitmenNo = egitmenNo;
    }

    @Override
    public String toString() {
        return "İsim: "+getIsim()+" Soyisim: "+getSoyisim()+" EğitmenNo: "+egitmenNo;
    }
}
