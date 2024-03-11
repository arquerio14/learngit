import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("1. Kenarı girin:");
        a = input.nextInt();
        System.out.print("2. Kenarı girin:");
        b = input.nextInt();
        System.out.print("3. Kenarı girin:");
        c = input.nextInt();

        if (a==b && a==c){
            System.out.println("Eşkenar üçgen.");
            return;
        }if (a==b || a==c){
            System.out.println("İkizkenar üçgen.");
            return;
        }if (b==c){
            System.out.println("İkizkenar üçgen.");
            return;
        }else {
            System.out.println("Çeşitkenar üçgen.");
        }
    }
}