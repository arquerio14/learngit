import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double ort;

        System.out.println("Vize notu gir:");
        a = input.nextInt();
        System.out.println("Final notu gir:");
        b = input.nextInt();
        ort = (a*0.4)+(b*0.6);

        if (ort >= 50){
            System.out.println("Geçtiniz, notunuz: "+ort);
        }else {
            System.out.println("Kaldınız, notunuz: "+ort);
        }
    }
}