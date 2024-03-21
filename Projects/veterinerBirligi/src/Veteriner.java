import java.util.ArrayList;

public class Veteriner extends Kisi {

    private String mezunOlduguOkul;
    private int calısmaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;

    public Veteriner(String isim, String tcKimlik,String mezunOlduguOkul,int calısmaSuresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calısmaSuresi = calısmaSuresi;
        veterinerMusterileri = new ArrayList<>();
        musteriSayisi = 0;
    }

    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }
    public void musteriGoster(){
        for (Musteri m : veterinerMusterileri){
            m.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString()+"Ben bir veterinerim.");
    }

    @Override
    public String toString() {
        return super.toString()+"Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calısmaSuresi=" + calısmaSuresi +
                '}';
    }
}
