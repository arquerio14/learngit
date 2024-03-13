import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kalan,number,number1,carpim,ekok;

        System.out.print("Büyük sayıyı gir : ");
        number = input.nextInt();
        System.out.print("Küçük sayıyı gir : ");
        number1 = input.nextInt();

        carpim = number*number1;

        while (true){
            kalan = number%number1;
            if (kalan==0){
                break;
            }
            number = number1;
            number1 = kalan;
        }
        System.out.println("Sayıların EBOB'u : "+number1);
        ekok = carpim/number1;
        System.out.println(ekok);
    }
}