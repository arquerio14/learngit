import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,fonksiyon;

        System.out.print("x'i giriniz:");
        x = input.nextInt();
        System.out.print("y'i giriniz:");
        y = input.nextInt();

        if (x>0 && y<0){
            fonksiyon = 4*x+2*y+4;
            System.out.println("f("+x+","+y+") = "+fonksiyon);
            return;
        }if (x>0 && y==0){
            fonksiyon = 2*x-y+3;
            System.out.println("f("+x+","+y+") = "+fonksiyon);
            return;
        }if (x<0 && y>0){
            fonksiyon = 3*x+4*y+3;
            System.out.println("f("+x+","+y+") = "+fonksiyon);
            return;
        }else System.out.println("Fonksiyon tanımsız.");
    }
}