//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi = 7;
        boolean isPrime = true;

/*            if (sayi%2==0||sayi%3==0){
                System.out.println("Sayı Asal Değildir.");
            }else {
                System.out.println("Sayı Asaldır.");
            }*/

        if (sayi==1){
            System.out.println("Sayı Asal Değildir.");
            return;
        }
        if (sayi<1){
            System.out.println("Geçersiz Sayı.");
            return;
        }

        for (int i=2;i<sayi;i++){
            if (sayi % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı Asaldır.");
        }else {
            System.out.println("Sayı Asal Değildir.");
        }

    }
}