import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Tarkan","Tarkan tanıtım yazısı","tarkan_udemy");
        Egitmen mmg = new Egitmen("Muhammed","Muhammed java","ememci_java");
        System.out.println(ogr1);
        System.out.println(mmg);

        Ders d1 =new Ders(1,"Giriş",6.7);
        Ders d2 =new Ders(2,"Java",18.9);
        Ders d3 =new Ders(3,"Git",9.7);
        Ders d4 =new Ders(4,"Javafx",14.3);
        Ders d5 =new Ders(5,"Database",24.6);

        Ders d6 =new Ders(6,"OOP",13.1);
        Ders d7 =new Ders(7,"Nesneler",12.8);
        Ders d8 =new Ders(8,"Firebase",9.8);
        Ders d9 =new Ders(9,"Recyclerview",5.2);
        Ders d10 =new Ders(10,"Sharedpreferencas",27.3);

        Kurs javaKursu = new Kurs("İleri Seviye Java Kursu",mmg);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);

        Kurs androidKursu = new Kurs("Android Kursu",mmg);
        androidKursu.kursaDersEkle(d6);
        androidKursu.kursaDersEkle(d7);
        androidKursu.kursaDersEkle(d8);
        androidKursu.kursaDersEkle(d9);
        androidKursu.kursaDersEkle(d10  );

        ogr1.kursaKatil(javaKursu);
        ogr1.kursaKatil(androidKursu);
        ogr1.izlenecekDersEkle(d6);
        ogr1.izlenecekDersEkle(d1);
        ogr1.izlenecekDersEkle(d7);
        ogr1.izlenecekDersEkle(d3);

        listeyiOynat(ogr1.getIzlenecekDersListesi());

    }
    public static void listeyiOynat(LinkedList<Ders> izlenecekDersler){
        Scanner input = new Scanner(System.in);
        boolean cikis = false;
        boolean ileriDogruHareket = true;

        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0){
            System.out.println("Henüz bir ders eklenmemiş.");
        }else {
            Ders ilkders = iterator.next();
            System.out.println("Şuan izlenen ders: "+ilkders.getDersBaslik()+" Süre: "+ilkders.getDakika());
        }

        menuGoster();
        while (!cikis){
            System.out.print("Seçiminiz: ");
            int kullaniSecimi = input.nextInt();

            switch (kullaniSecimi){
                case 0:
                    System.out.println("Uygulamadan çıkılıyor...");
                    cikis = true;
                    break;
                case 1:
                    if (!ileriDogruHareket){
                        ileriDogruHareket = true;
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()){
                        Ders ilkders = iterator.next();
                        System.out.println("============================================================================");
                        System.out.println("ŞUANKİ DERS : Ders no: "+ilkders.getDersNo()+" Başlık: "+ilkders.getDersBaslik()+" Süre: "+ilkders.getDakika());
                        System.out.println("============================================================================");
                    }else {
                        System.out.println("SON DERSE GELDİNİZ.");
                    }
                    break;
                case 2:
                    if (ileriDogruHareket){
                        ileriDogruHareket = false;
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()){
                        Ders ilkders = iterator.previous();
                        System.out.println("============================================================================");
                        System.out.println("ŞUANKİ DERS : Ders no: "+ilkders.getDersNo()+" Başlık: "+ilkders.getDersBaslik()+" Süre: "+ilkders.getDakika());
                        System.out.println("============================================================================");
                    }else {
                        System.out.println("İLK DERSE GELDİNİZ.");
                    }
                    break;
                case 3:
                    System.out.println("============================================================================");
                    izlenecekDersleriListele(izlenecekDersler);
                    System.out.println("============================================================================");
                    break;
                case 9:
                    menuGoster();
                    break;
            }
        }
    }

    private static void izlenecekDersleriListele(LinkedList<Ders> izlenecekDersler) {
        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0){
            System.out.println("Henüz bir ders eklenmemiş.");
        }else {
            while (iterator.hasNext()){
                Ders ilkders = iterator.next();
                System.out.println("Ders no: "+ilkders.getDersNo()+" Başlık: "+ilkders.getDersBaslik()+" Süre: "+ilkders.getDakika());
            }
        }
    }

    private static void menuGoster() {
        System.out.println("---------- MENU ----------");
        System.out.println("0 - Çıkış");
        System.out.println("1 - Bir sonraki derse geç");
        System.out.println("2 - Bir önceki derse geç");
        System.out.println("3 - Tüm listeyi göster");
        System.out.println("9 - Menü");
    }
}