public class Main {
    public static void main(String[] args) {

        HesapMakinesi hm = new HesapMakinesi();
        HesapMakinesi.Topla toplayici = hm.new Topla();
        int toplam = toplayici.topla(5,6);
        System.out.println("Toplam: "+toplam);

        HesapMakinesi.Cikar cikarici = hm.new Cikar();
        int fark = cikarici.cikar(12,3);
        System.out.println("Fark: "+fark);

        int carpim = hm.carp(5,3);
        System.out.println("Çarpım: "+carpim);

        String bolum = hm.bolmeYap(16,4);
        if (!bolum.equals("")){
            System.out.println("Bölüm: "+bolum);
        }
    }
}