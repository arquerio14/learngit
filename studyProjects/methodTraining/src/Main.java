import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kullaniciSecim = -1;

        for (;;){
            kullaniciSecim= menuGoster();
            if (kullaniciSecim==0) {
                break;
            }
            Scanner input = new Scanner(System.in);

            System.out.println("Birinci sayıyı gir.");
            int birincisayi = input.nextInt();
            System.out.println("İkinci sayıyı gir.");
            int ikincisayi = input.nextInt();

            switch (kullaniciSecim){
                case 1 :
                    ikiSayiyiCarp(birincisayi,ikincisayi);break;
                case 2 :
                    int toplam = ikiSayiyiTopla(birincisayi,ikincisayi);
                    System.out.println("İki sayının toplamı : "+toplam);break;
                case 3 :
                    ikiSayininKuvveti(birincisayi,ikincisayi);
                    break;
                case 4 :
                    double toplamDouble = ikiSayiyiTopla(birincisayi,ikincisayi);
                    System.out.println("İki double sayinin toplamı : "+toplamDouble);
                case 5 :
                    String sonuc = isaretiBelirle(-2);
                    System.out.println(sonuc);
            }
        }

    }

    private static String isaretiBelirle(int i) {
        if (i>0){
            return "pozitif";
        } else if (i==0) {
            return "sayı sıfır";
        }else {return "negatif";}
    }


    public static void ikiSayininKuvveti(int birincisayi, int ikincisayi) {
        double toplamDouble = Math.pow(birincisayi,ikincisayi);
        System.out.println("Sayıların Kuvveti : "+toplamDouble);
    }

    public static int ikiSayiyiTopla(int birincisayi, int ikincisayi) {
        int toplam = birincisayi + ikincisayi;
        return toplam;
    }
    public static double  ikiSayiyiTopla(double birincisayi, double ikincisayi) {
        double toplam = birincisayi + ikincisayi;
        return toplam;
    }

    public static void ikiSayiyiCarp(int birincisayi, int ikincisayi) {
        System.out.println("Sayıların çarpımı : "+birincisayi*ikincisayi);
    }

    public static int menuGoster(){

        System.out.println("*************** MENU ***************");
        System.out.println("1 - İki sayının çarpımını bul");
        System.out.println("2 - İki sayının toplamını bul");
        System.out.println("3 - İki sayının kuvvetini bul");
        System.out.println("4 - İki double sayının toplamını bul");
        System.out.println("Çıkmak için 0 tuşlayınız");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        return secim;
    }
}