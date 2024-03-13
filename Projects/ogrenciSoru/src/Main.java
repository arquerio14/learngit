import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Öğrenci sayısı giriniz : ");
        int ogrenciSayisi = input.nextInt();
        System.out.print("Soru sayısı giriniz : ");
        int soruSayisi = input.nextInt();

        char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];
        char[] cevapAnahtari = new char[soruSayisi];
        
        cevapAnahtariGoster(cevapAnahtari);
        ogrenciCevaplariniGoster(tumCevaplar);
        cevapAnahtariOlustur(cevapAnahtari);
        ogrenciCevaplariniYerlestir(tumCevaplar);
        ogrencileriDegerlendir(cevapAnahtari,tumCevaplar);
    }

    private static void cevapAnahtariGoster(char[] cevapAnahtari) {
        for (char secenek : cevapAnahtari){
            System.out.print(secenek+",");
        }
        System.out.println();
    }

    private static void ogrenciCevaplariniGoster(char[][] tumCevaplar) {
        for (int satir=0;satir<tumCevaplar.length;satir++){
            for (int sutun=0;sutun<tumCevaplar[satir].length;sutun++){
                System.out.print(tumCevaplar[satir][sutun]+",");
            }
            System.out.println();
        }
    }

    private static void ogrencileriDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {
        for (int satir=0;satir<tumCevaplar.length;satir++){
            int dogruCevap = 0;
            for (int sutun=0;sutun<tumCevaplar[satir].length;sutun++){
                if (tumCevaplar[satir][sutun] == cevapAnahtari[sutun]){
                    dogruCevap++;
                }
            }
            System.out.println(satir+". öğrencinin doğru sayısı : "+dogruCevap);
        }
    }

    private static void cevapAnahtariOlustur(char[] cevapAnahtari) l{
        for (int i=0;i<cevapAnahtari.length;i++){
            cevapAnahtari[i] = cevapOlustur();
        }
    }

    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {
        for (int satir=0;satir<tumCevaplar.length;satir++){
            for (int sutun=0;sutun<tumCevaplar[satir].length;sutun++){
                tumCevaplar[satir][sutun] = cevapOlustur();
            }
        }
    }

    private static char cevapOlustur() {
        int rastgeleSayi = 65 + (int) (Math.random()*5);
        char uretilenSecenek = (char) rastgeleSayi;
        return uretilenSecenek;
    }
}