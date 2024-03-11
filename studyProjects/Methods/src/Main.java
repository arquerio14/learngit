//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi=topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,5,7,5,3,9,12);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Silindi.");
    }
    public static void menuGoster(){
        System.out.println("İki sayının toplamını bul");
        System.out.println("İki sayının farkını bul");
        System.out.println("İki sayının çarpmını bul");
        System.out.println("İki sayının bölümünü bul");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}