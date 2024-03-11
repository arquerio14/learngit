import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,faktoriyel=1;

        System.out.print("Sayı giriniz:");
        a = input.nextInt();

        while (a != 1){
            faktoriyel *= a;
            a--;
        }
        System.out.println("Girilen sayının faktöriyeli: "+faktoriyel);
    }
}