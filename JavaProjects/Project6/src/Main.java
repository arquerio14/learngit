//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*        int sayilar[] = {1, 2, 5, 7, 9, 0};
        int aranacak = 9;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                System.out.println("Aranan sayı bulundu.");
                return;
            }
        }
        System.out.println("Aranan sayı bulunamadı.");*/

        int sayilar[] = {1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Aranan sayı bulundu.");
        }else {
            System.out.println("Aranan sayı bulunamadı.");
        }
    }
}