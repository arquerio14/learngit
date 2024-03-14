public class işlemler {

    public static void topla(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam = toplam + sayi;
        }
        System.out.println("Toplam: "+toplam);
    }
    public static void cıkar(int... sayilar){
        int sonuc = 0;
        for (int sayi:sayilar){
            sonuc = sonuc - sayi;
        }
        System.out.println("Sonuç: "+sonuc);
    }
    public static void carp(int... sayilar){
        int sonuc = 1;
        for (int sayi:sayilar){
            sonuc = sonuc * sayi;
        }
        System.out.println("Sonuç: "+sonuc);
    }
    public static void bol(int bölünen,int bölen){
        int sonuc = 0;
        if (bölen == 0 || bölünen == 0){
            System.out.println("Hatalı sayı girdiniz.0 girmeyin.");
            return;
        }
        sonuc = bölünen / bölen;
        System.out.println("Sonuç: "+sonuc);
    }
}
