import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tmp, a, b;
        System.out.print("a değerini gir : ");
        a = input.nextInt();
        System.out.print("b değerini gir : ");
        b = input.nextInt();
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a değeri : " + a);
        System.out.println("b değeri : " + b);
    }
}