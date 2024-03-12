import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayının ortalamasını bulmak istiyorsun");
        int sayi = input.nextInt();

        int sayilar[] = new int[sayi];
        double ortalama=0;

        for (int i=0;i<sayi;i++){
            System.out.print("Sayı giriniz : ");
            sayilar[i] = input.nextInt();
            ortalama = ortalama + sayilar[i];
        }
        System.out.println("Girdiğinz sayıların ortalaması : "+ortalama/sayi);
    }
}