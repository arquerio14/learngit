//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*        int number = 28;
        int kalan = 0;
        int katsayı = 0;

        for (int i=1;i<number;i++){
            kalan = number % i;
            if (kalan==0){
                katsayı += i;
            }
            if (katsayı == number){
                System.out.println("Sayınız mükemmel sayıdır");
                break;
            }
        }
        System.out.println("Sayınız mükemmel sayı değildir.");*/

        int number = 62;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Sayı mükemmel sayıdır.");
        } else {
            System.out.println("Sayı mükemmel sayı değildir");
        }
    }
}