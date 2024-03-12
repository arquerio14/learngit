import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        Scanner input = new Scanner(System.in);
        System.out.println("Ay değerini rakamla yazınız");
        int ay = input.nextInt();

        System.out.println("Aradığınız ay : "+aylar[ay-1]);
    }
}