import java.util.ArrayList;

public class Kurs {

    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;
    private ArrayList<Ogrenci> kursOgrencileri;
    private boolean yayinda;

    public Kurs(String kursAdi,Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.kursOgrencileri = new ArrayList<>();
        kursEgitmenleri.add(0,basEgitmen);
        this.yayinda = false;
    }

    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }

    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void kursaEgitmenEkle(Egitmen eklenecekEgitmen){
        if (!kursEgitmenleri.contains(eklenecekEgitmen)){
            kursEgitmenleri.add(eklenecekEgitmen);
            System.out.println(eklenecekEgitmen.getIsim()+" Kursa eğitmen olarak eklendi.");
        }else System.out.println(eklenecekEgitmen.getIsim()+" Zaten kursta tanımlı bir eğitmen.");
    }

    public void kursdanEgitmenSil(Egitmen silinecekEgitmen){
        if (silinecekEgitmen.getIsim().equals(kursEgitmenleri.get(0).getIsim())){
            System.out.println(silinecekEgitmen.getIsim()+" Baş eğitmen, silemezsin.");
        }else {
            kursEgitmenleri.remove(silinecekEgitmen);
            System.out.println(silinecekEgitmen.getIsim()+" Kurs eğitmenliğinden çıkarıldı.");
        }
    }

    public void kursaDersEkle(Ders eklenecekDers){
        kurstakiDersler.add(eklenecekDers);
    }

    public int kurstakiDersSayisi(){
        return kurstakiDersler.size();
    }

    public int kursdakiDerslerinToplamSuresi(){
        double toplamSure = 0;
        for (Ders ders : kurstakiDersler){
            toplamSure = toplamSure + ders.getDakika();
        }
        return (int) toplamSure;
    }

    public boolean kursYayindaKontrol(){
        if (kurstakiDersler.size() >= 5 && kursdakiDerslerinToplamSuresi() > 60){
            yayinda = true;
            return true;
        }else return false;
    }

}
