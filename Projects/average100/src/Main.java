public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[100];
        int toplam=0,ortalama=0;

        for (int i=0;i<sayilar.length;i++){
            sayilar[i] = (int) (Math.random() *100);
            toplam = toplam + sayilar[i];
            System.out.print(sayilar[i]+",");
        }
        ortalama = toplam / sayilar.length;
        System.out.println("\n"+ortalama);
    }
}