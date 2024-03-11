import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = input.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;
        boolean palindremoMu = true;

        while (altSinir < ustSinir){
            if (kelime.charAt(altSinir) != kelime.charAt(ustSinir)){
                palindremoMu = false;
                break;
            }
            altSinir++;
            ustSinir--;
        }
        if (palindremoMu){
            System.out.println("Kelima palindrome.");
        }else {System.out.println("Kelima palindrome değil.");}
    }
}