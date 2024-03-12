import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = {4,1,-3,7,9,13,-1};
        System.out.println("Sıralama öncesinde : ");
        diziYazdir(sayilar);

        Arrays.sort(sayilar);
        System.out.println("\nSıralama sonrasında : ");
        diziYazdir(sayilar);
    }
    public static void diziYazdir(int[] dizi){
        for (int e:dizi){
            System.out.print(e+",");
        }
    }
}