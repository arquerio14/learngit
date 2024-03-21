import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> sayilar = new LinkedList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();

        long baslamaSuresi = System.currentTimeMillis();
        linkedListHazirla(sayilar);
        long bitmeSuresi = System.currentTimeMillis();
        System.out.println("LinkedList geçen zaman: "+(bitmeSuresi-baslamaSuresi));

        baslamaSuresi = System.currentTimeMillis();
        arrayListHazirla(sayilar2);
        bitmeSuresi = System.currentTimeMillis();
        System.out.println("ArrayList Geçen zaman: "+(bitmeSuresi-baslamaSuresi));
    }

    private static void arrayListHazirla(ArrayList<Integer> sayilar2) {
        for (int i = 0 ; i < 100000 ; i++){
            int yeniEklenecekEleman = (int) (Math.random() * 100000);
            siraliEkle(sayilar2,yeniEklenecekEleman);
        }
    }

    private static void linkedListHazirla(LinkedList<Integer> sayilar) {
        for (int i = 0 ; i < 100000 ; i++){
            int yeniEklenecekEleman = (int) (Math.random() * 100000);
            siraliEkle(sayilar,yeniEklenecekEleman);
        }
    }

    private static boolean siraliEkle(List<Integer> liste, int yeniEklenecekEleman) {
        ListIterator<Integer> iterator = liste.listIterator();
        while (iterator.hasNext()){
            int karsilastirmaSonucu = iterator.next().compareTo(yeniEklenecekEleman);
            if (karsilastirmaSonucu == 0){
                iterator.add(yeniEklenecekEleman);
                return true;
            } else if (karsilastirmaSonucu > 0) {
                iterator.previous();
                iterator.add(yeniEklenecekEleman);
                return true;
            }else {}
        }
        iterator.add(yeniEklenecekEleman);
        return true;
    }
}