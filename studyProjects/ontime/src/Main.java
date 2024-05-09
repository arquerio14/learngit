import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int a=123456789,toplam=0,s=0;

        while (true){
            s++;
            if (a == 0){
                break;
            } else if (a % 2 == 0) {
                array.add(0);
                a = a / 2;
            } else if (a % 2 == 1) {
                array.add(1);
                a = a / 2;
            }
        }
        for (int i=0;i < array.size();i++){
            toplam = toplam + array.get(i);
        }
        if (toplam > 10){
            a = toplam;
            toplam=0;
            array.clear();
            while (true){
                if (a == 0){
                    break;
                } else if (a % 2 == 0) {
                    array.add(0);
                    a = a / 2;
                } else if (a % 2 == 1) {
                    array.add(1);
                    a = a / 2;
                }
            }
        }
        for (int i=0;i < array.size();i++){
            toplam = toplam + array.get(i);
        }
        System.out.println(toplam);
    }
}