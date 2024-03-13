import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısı girin : ");
        int satirSayisi = input.nextInt();

        for (int i=0 ; i < satirSayisi ; i++){

            for (int j=0;j < satirSayisi ; j++){
                if (i == j || j==satirSayisi-i-1){
                    System.out.print("x");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}