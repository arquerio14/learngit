import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> isimlerListesi = new ArrayList<>();
        String[] isimlerDizisi = new String[1000000];

        long baslamaZamani = System.currentTimeMillis();
        for (int i=0 ; i < 1000000 ; i++){
            isimlerDizisi[i] = "deneme " + i;
        }
        long bitmeZamani = System.currentTimeMillis();
        System.out.println("Dizi çalışma süresi: "+(bitmeZamani-baslamaZamani));

        baslamaZamani = System.currentTimeMillis();
        for (int i=0 ; i < 1000000 ; i++){
            isimlerListesi.add("deneme "+i);
        }
        bitmeZamani = System.currentTimeMillis();
        System.out.println("Liste çalışma süresi: "+(bitmeZamani-baslamaZamani));
    }
}