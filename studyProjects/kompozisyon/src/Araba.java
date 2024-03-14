public class Araba  {

    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;

    public Araba(){
        arabaMotoru = new Motor();
        renk = "Kırmızı";
        marka = "BMW";
        uretimYili = 2002;
        System.out.println(renk+" Renkli "+marka+" Marka "+uretimYili+" Model araba oluşturuldu.");
    }

    public void hareketeGec(){
        System.out.println("Harekete geçildi.");
    }

    public void dur(){
        System.out.println("Duruldu.");
    }
}
