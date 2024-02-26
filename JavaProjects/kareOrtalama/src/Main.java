import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 0, say = 0, ort = 0, x;

        while (true) {
            System.out.print("X değerini giriniz :");
            x = input.nextInt();
            t = t + (x * x);
            if (x == 0) {
                break;
            }
            say++;
        }
        ort = t / say;
        System.out.println("Sonuç : " + ort);
    }
}