//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number1=220,number2=284;
        int toplam1=0,toplam2=0;

        for (int i=1;i<=number1;i++){
            if (number1 % i == 0){
                toplam1 = toplam1 + i;
            }
        }
        for (int i=1;i<=number2;i++){
            if (number2 % i == 0){
                toplam2 = toplam2 + i;
            }
        }
        if (toplam1==toplam2){
            System.out.println("Sayılarımız arkadaş sayıdır.");
        }else {
            System.out.println("Sayılarımız arkadaş sayı değildir.");
        }
    }
}