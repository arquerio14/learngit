import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=0,c=0;
        double toplam=0;

        System.out.print("1. Sayıyı gir:");
        a = input.nextInt();
        System.out.print("2. Sayıyı gir:");
        b = input.nextInt();
        System.out.print("3. Sayıyı gir:");
        c = input.nextInt();
        toplam = (a+b+c)/3;
        System.out.println("Toplan : "+toplam);
    }
}