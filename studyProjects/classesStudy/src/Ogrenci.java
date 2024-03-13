import java.util.Scanner;

public class Ogrenci {
    Scanner input = new Scanner(System.in);
    private int ogrenciNo;
    private byte sinif;
    private String isim;
    private boolean aktif;

    public void setAktif(boolean yeniAktif){
        this.aktif = yeniAktif;
    }

    public boolean getAktif(){
        return this.aktif;
    }

    public void setIsim(String yeniIsim){
        this.isim = yeniIsim;
    }

    public String getIsim(){
        return this.isim;
    }

    public void setSinif(byte yeniSinif){
        this.sinif = yeniSinif;
    }

    public byte getSinif(){
        return this.sinif;
    }

    public void setOgrenciNo(int yeniOgrenciNo){
        this.ogrenciNo = yeniOgrenciNo;
    }

    public int getOgrenciNo(){
        return this.ogrenciNo;
    }

    public Ogrenci(){
        aktif = true;
    }

    public Ogrenci(int ogrenciNo){
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(int ogrenciNo,byte sinif){
        this(ogrenciNo);
        this.sinif = sinif;
    }

    public Ogrenci(int ogrenciNo,byte sinif,String isim){
        this(ogrenciNo, sinif);
        this.isim = isim;
    }

    public Ogrenci(int ogrenciNo,byte sinif,String isim,boolean aktif){
        this(ogrenciNo, sinif, isim);
        this.aktif = aktif;
    }

    public void ogrenciBilgileriYazdir(){
        if (aktif){
            System.out.println("Ad: "+isim+", Sınıf: "+sinif+", No: "+ogrenciNo);
        }else {
            System.out.println("Öğrenci aktif değil. Yinede bilgileri görmek istiyorsanız 1'e basın.");
            int act = input.nextInt();
            if (act == 1){
                System.out.println("Ad: "+isim+", Sınıf: "+sinif+", No: "+ogrenciNo);
            }
        }
    }
}
