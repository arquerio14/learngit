import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accum = 0;
        int coEf = 0;
        /*
        int a=0,i=0,sonuc=0,b;

        do {
            System.out.print("0 dışında sayı giriniz:");
            b = input.nextInt();
            a = a + b;
            i++;
        }while (b!=0);
        sonuc=a/(i-1);
        System.out.println("Girdiğiniz sayıların ortalaması : "+sonuc);
         */
        while(true){
            int numberTaken = input.nextInt();
            accum += numberTaken;
            if(numberTaken==0){
                System.out.println("Toplam sayı "+accum/coEf);
                break;
            }
            coEf++;
        }
    }
}