import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int array[] = {23,2,3,4,5};
        int a=1,gecici,gecici2;
        int dizi[] = new int[array.length];
        for (int i=0;i < array.length;i++){
            dizi[i] = array[i]*a;
            a++;
        }
        for (int i=0;i < array.length;i++){
            for (int j=0;j < array.length;j++){
                if (dizi[i] < dizi[j]){
                    gecici = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = gecici;
                    gecici2 = array[j];
                    array[j] = array[i];
                    array[i] = gecici2;
                }
            }
        }
    }
}