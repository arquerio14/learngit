import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi {

    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersListesi;

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }

    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        this.katildigiKurslar = new ArrayList<>();
        this.izlenecekDersListesi = new LinkedList<>();
    }

    public void izlenecekDersEkle(Ders izlenecekDers){
        boolean dersBulundu = false;
        if (katildigiKurslar.size() > 0){

            for (Kurs gecici : katildigiKurslar){
                if (gecici.getKurstakiDersler().contains(izlenecekDers)){
                    System.out.println("İzlenecekler listesine "+gecici.getKursAdi()+
                            " Kursunda bulunan "+izlenecekDers.getDersBaslik()+" dersi eklendi.");
                    izlenecekDersListesi.add(izlenecekDers);
                    dersBulundu = true;
                    break;
                }
            }
            if (!dersBulundu){
                System.out.println("Girilen ders kurslarda bulunamadı veya yetkisiz erişim.");
            }
        }
    }

    public void kursaKatil(Kurs javaKursu) {
        if (javaKursu.kursYayindaKontrol()){
            javaKursu.getKursOgrencileri().add(this);
            katildigiKurslar.add(javaKursu);
            System.out.println(this.getIsim()+" İsimli kullanıcı "+javaKursu.getKursAdi()+" kursuna katıldı.");
        }else {
            System.out.println(javaKursu.getKursAdi()+" Yayında değil katılamazsınız.");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "Ogrenci{" +
                "katildigiKurslar=" + katildigiKurslar +
                '}';
    }

}
