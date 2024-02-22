import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,f=0,x=0;
        n = input.nextInt();

        while (true){
            x = x + 1;
            f = f+1/(x*x);
            if (x==n){
                break;
            }
        }
        System.out.println("Sonuç : "+f);
    }
}