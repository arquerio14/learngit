import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kalan,number,number1;

        System.out.print("Büyük sayıyı gir : ");
        number = input.nextInt();
        System.out.print("Küçük sayıyı gir : ");
        number1 = input.nextInt();

        while (true){
            kalan = number%number1;
            if (kalan==0){
                break;
            }
            number = number1;
            number1 = kalan;
        }
        System.out.println("Sayıların EBOB'u : "+number1);
    }
}