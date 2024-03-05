import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2;
        String islem;
        System.out.println("İki Sayı ile Dört İşlem\n----------\n1- Toplama İşlemi (+)\n2- Çıkartma İşlemi (-)\n3- Çarpma İşlemi (*)\n4- Bölme İşlemi (/)\n-----------");
        System.out.print("İşlem Yapılacak İlk Değer :");
        number1 = input.nextDouble();
        System.out.print("İşlem Yapılacak İkinci Değer :");
        number2 = input.nextDouble();
        System.out.print("----------\nYapacağınız İşlem :");
        islem = input.next();

        System.out.println(hesapMakinesi(number1,number2,islem));
    }

    public static double hesapMakinesi(double a, double b, String karar) {
        if (karar.equals("+") || karar.equals("1")) {
            return a + b;
        } else if (karar.equals("-") || karar.equals("2")) {
            return a - b;
        } else if (karar.equals("*") || karar.equals("3")) {
            return a * b;
        } else if (karar.equals("/") || karar.equals("4")) {
            return a / b;
        } else {
            return 0;
        }
    }
}