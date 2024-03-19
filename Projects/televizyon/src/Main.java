import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) {

        menuGoster();
        boolean cikis = false;

        while (cikis == false) {
            System.out.println("Seçiminiz : (Menüyü görmek için 8'i tuşlayın)");
            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    tvKurVeKanallariOlusutur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanalBilgisiniGoster();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor.");
                    cikis = true;
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz.");
                    break;
            }
        }

    }

    private static void tvKurVeKanallariOlusutur() {
        if (tv == null) {
            input.nextLine();
            System.out.println("Televizyonun markasını giriniz.");
            String marka = input.nextLine();
            System.out.println("Televizyonun boyutunu giriniz.");
            String boyut = input.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        } else {
            System.out.println(tv);
        }
    }

    private static void tvAc() {
        if (tv != null) {
            tv.tvAc();
        } else {
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void sesArttir() {
        if (tv != null) {
            tv.sesArttir();
        } else {
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void sesAzalt() {
        if (tv != null) {
            tv.sesAzalt();
        } else {
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void kanalDegistir() {
        if (tv != null) {
            System.out.println("Hangi kanala gitmek istiyorsunuz: ");
            int acilmasiIstenenKanal = input.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
        } else {
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void kanalBilgisiniGoster() {
        if (tv != null) {
            tv.aktifKanaliGoster();
        } else {
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void tvKapat() {
        if (tv != null) {
            tv.tvKapat();
        } else {
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void menuGoster() {
        System.out.println("********* MENÜ **********");
        System.out.println(" 0 - Çıkış\n " +
                "1 - Televizyonu kur\n " +
                "2 - Televizyonu aç\n " +
                "3 - Sesi arttır\n " +
                "4 - Sesi azalt\n " +
                "5 - Kanal değiştir\n " +
                "6 - Kanal bilgisini göster\n " +
                "7 - Televizyonu kapat\n " +
                "8 - Menüyü göster ");
    }
}