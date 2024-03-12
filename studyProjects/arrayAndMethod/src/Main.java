public class Main {
    public static void main(String[] args) {
        int sayilar[] = {1,2,3};
        diziGöster(sayilar);
        birArttir(sayilar);
        diziGöster(sayilar);

        toplamBul(5,7,2);
    }

    private static void toplamBul(int... parametreListesi) {
        int toplam=0;
        for (int oankiSayi:parametreListesi){
            toplam += oankiSayi;
        }
        System.out.println("Parametre listesinin ilk elemanı : "+parametreListesi[0]);
        System.out.println("Toplam : "+toplam);
    }


    private static void birArttir(int[] sayilar) {
        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }


    private static void diziGöster(int[] sayilar) {
        int j=1;
        for (int i:sayilar){
            System.out.println(j+". Eleman : "+i);
            j++;
        }
    }
}