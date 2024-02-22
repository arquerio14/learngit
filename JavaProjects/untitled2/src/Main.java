import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k=0,t=0,ç=0;

        while (true){
            int number = input.nextInt();
            k++;
            if (number%2==0){
                ç = ç+number;
            }else {
                t = t+number;
            }
            if (k==20){
                break;
            }
        }
        System.out.println("Tek Sayılar : "+t);
        System.out.println("Çift Sayılar : "+ç);
    }
}