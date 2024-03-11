import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac, a;

        System.out.println("Sayı giriniz:");
        sayac = input.nextInt();

        for (int i = 2; i <= sayac; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.print(i + ",");
            }
        }
    }
}