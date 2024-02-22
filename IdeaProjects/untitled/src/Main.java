import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvtutar,tutar,toplam;

        System.out.print("Tutar giriniz : ");
        tutar = input.nextInt();
        if (tutar>0 && tutar<500){
            kdvtutar = tutar*0.18;
        }else {
            kdvtutar = tutar*0.08;
        }
        toplam = tutar + kdvtutar;
        System.out.println("KDV tutarınız : "+kdvtutar);
        System.out.println("Toplam tutarınız : "+toplam);
    }
}