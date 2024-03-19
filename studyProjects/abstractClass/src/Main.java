public class Main {
    public static void main(String[] args) {


        GeometrikSekil kare = new Kare(10);
        kare.cevreHesapla();
        kare.alanHesapla();
        ((Kare)kare).adiniSoyle();

        GeometrikSekil dikdortgen = new Dikdortgen(10,10);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        ((Dikdortgen) dikdortgen).adiniSoyle();

        GeometrikSekil daire = new Daire(5);

        System.out.println("*******************************");
        alanlariKarsilastir(kare,dikdortgen);
        System.out.println("*******************************");
        cevreleriKarsilastir(kare,dikdortgen);
        System.out.println("*******************************");
        alanVeCevreyiSoyle(daire);
    }

    public static void alanVeCevreyiSoyle(GeometrikSekil gs1){
        gs1.cevreHesapla();
        gs1.alanHesapla();
    }

    public static void alanlariKarsilastir(GeometrikSekil gs1,GeometrikSekil gs2){
        if (gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
            System.out.println("1. Parametredeki nesnenin alanı 2. nesnenin alanından küçük.");
        }else if (gs1.getHesaplananAlan() > gs2.getHesaplananAlan()) {
            System.out.println("1. Parametredeki nesnenin alanı 2. nesnenin alanından büyük.");
        }else {
            System.out.println("1. Parametredeki nesnenin alanı 2. nesnenin alanına eşit.");
        }
    }

    public static void cevreleriKarsilastir(GeometrikSekil gs1,GeometrikSekil gs2){
        if (gs1.getHesaplananCevre() < gs2.getHesaplananCevre()){
            System.out.println("1. Parametredeki nesnenin çevresi 2. nesnenin çevresinden küçük.");
        }else if (gs1.getHesaplananCevre() > gs2.getHesaplananCevre()) {
            System.out.println("1. Parametredeki nesnenin çevresi 2. nesnenin çevresinden büyük.");
        }else{
            System.out.println("1. Parametredeki nesnenin çevresi 2. nesnenin çevresine eşit.");
        }
    }
}