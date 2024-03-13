import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Çevirilmesini istediğiniz sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        decimalToBinary(sayi1);
    }

    private static void decimalToBinary(int sayi1) {
        int i=0,j=0;
        while (true) {
            i++;
            if (sayi1 == 1) {
                System.out.print("1");
                break;
            } else if (sayi1 % 2 == 1) {
                System.out.print("1");
                sayi1 = sayi1 / 2;
            } else if (sayi1 % 2 == 0) {
                System.out.print("0");
                sayi1 = sayi1 / 2;
            }
        }
    }
}