import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        int randomsayi = (int) (Math.random() * 101);

        System.out.println("Sayı giriniz:");
        a = input.nextInt();


        while (a > randomsayi) {
            System.out.println("Sayıyı azaltın.");
            System.out.println("Yeni sayı giriniz:");
            a = input.nextInt();
            while (a < randomsayi) {
                System.out.println("Sayıyı yükseltin.");
                System.out.println("Yeni sayı giriniz:");
                a = input.nextInt();
            }
        }
        while (a < randomsayi) {
            System.out.println("Sayıyı yükseltin.");
            System.out.println("Yeni sayı giriniz:");
            a = input.nextInt();
            while (a > randomsayi) {
                System.out.println("Sayıyı azaltın.");
                System.out.println("Yeni sayı giriniz:");
                a = input.nextInt();
            }
        }
        System.out.println("Doğru sayıyı buldunuz.");
    }
}