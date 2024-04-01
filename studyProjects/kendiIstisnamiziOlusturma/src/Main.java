import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaş giriniz: ");
        int y = input.nextInt();

        try {
            if (y < 0) {
                throw new NegatifYasHatasi("Negatif yaş girmeyiniz !");
            }
        }catch (Exception e){
            System.out.println("Hata: "+e);
        }
    }
}