public class Main {
    public static void main(String[] args) {

        ilkNesneleriOlustur();

    }

    private static void ilkNesneleriOlustur() {
        Kedi kedi1 = new Kedi("01-01-05",true,"Van");
        Kedi kedi2 = new Kedi("01-01-02",false,"Tekir");
        Kedi kedi3 = new Kedi("01-01-09",true,"Sarman");

        Kopek kopek1 = new Kopek("02-02-06",true,3,"Golden");
        Kopek kopek2 = new Kopek("02-02-08",false,2,"Doberman");
        Kopek kopek3 = new Kopek("02-02-03",false,5,"Pitbull");

        Musteri m1 = new Musteri("Ahmet","123532124","Bolu");
        m1.musteriyeHayvanEkle(kedi1);
        m1.musteriyeHayvanEkle(kopek1);

        Musteri m2 = new Musteri("Ayşe","123452124","İstanbul");
        m2.musteriyeHayvanEkle(kedi2);
        m2.musteriyeHayvanEkle(kopek2);

        Musteri m3 = new Musteri("Fatma","123541224","Ankara");
        m3.musteriyeHayvanEkle(kedi3);
        m3.musteriyeHayvanEkle(kopek3);

        Veteriner v1 = new Veteriner("Hakan","534124324","AİBÜ",1);
        v1.musteriEkle(m1);
        v1.musteriEkle(m2);

        Veteriner v2 = new Veteriner("Hasan","534786454","İÜ",3);
        v2.musteriEkle(m1);
        v2.musteriEkle(m3);

        Veteriner v3 = new Veteriner("Merve","678124324","İTÜ",7);
        v3.musteriEkle(m2);
        v3.musteriEkle(m3);
        v1.musteriGoster();

        SehirVeterinerlikleri s1 = new SehirVeterinerlikleri("Ankara");
        s1.sehireVeterinerEkle(v1);
        SehirVeterinerlikleri s2 = new SehirVeterinerlikleri("İstanbul");
        s2.sehireVeterinerEkle(v2);
        SehirVeterinerlikleri s3 = new SehirVeterinerlikleri("Bolu");
        s3.sehireVeterinerEkle(v3);

        s1.sehirdekiToplamVeterinerSayisi();

        YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kopek2);

        YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(m3);

    }
}