import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array[] = {9,5,1,4,3};
        int a=1;
        int dizi[] = new int[array.length];
        for (int i=0;i < array.length;i++){
            dizi[i] = array[i]*a;
            a++;
        }
        Arrays.sort(dizi);
        for (int gecici : dizi){
            System.out.println(gecici);
        }

    }
}
