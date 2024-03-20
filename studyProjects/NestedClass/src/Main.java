public class Main {
    public static void main(String[] args) {

        String[] sehirler ={"Ankara","İstanbul","Bolu"};

        YaziciSinif.StringDiziYazdir nesne = new YaziciSinif().new StringDiziYazdir();
        nesne.stringDiziYazdir(sehirler);
    }
}