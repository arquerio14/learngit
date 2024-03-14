public class Main {
    public static void main(String[] args) {

        //String[] ureticiFirmalar = {"HP","Fujitsu","Dell"}
        Bilgisayar b1 = new Bilgisayar(8,16,new String[]{"HP","Fujitsu","Dell"});


        String[] ureticiler = b1.getUreticiFirmalar();
        ureticiler[0] = "Apple";
        bilgisayariYazdir(b1);
    }
    public static void bilgisayariYazdir(Bilgisayar yazdirilacakPC){
        System.out.println("Çekirdek sayısı: "+yazdirilacakPC.getCekirdekSayisi()+", Ram Miktarı: "+yazdirilacakPC.getRamBoyutu()+", Üretici firmalar: "+yazdirilacakPC.getUreticiFirmalar()[0]);
    }
}