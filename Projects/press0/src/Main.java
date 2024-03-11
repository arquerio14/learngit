import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=1,b=1;

        while (true){
            System.out.print("Çarpılacak sayıyı girin:");
            a = input.nextInt();
            if (a==0){
                break;
            }
            b = a*b;
        }

        System.out.println("Sayılarınızın çarpımı : "+b);
    }
}