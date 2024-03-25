import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> sehirler = new Vector<>(3);

        System.out.println(sehirler.capacity());
        sehirler.add("Bolu");
        sehirler.add("Bolu");
        sehirler.add("Bolu");
        sehirler.add("Bolu");
        System.out.println(sehirler.capacity());
        sehirler.add("Bolu");
        sehirler.add("Bolu");
        sehirler.add("Ankara");
        System.out.println(sehirler.capacity());

        System.out.println(sehirler);
        System.out.println(sehirler.firstElement());
        System.out.println(sehirler.lastElement());

        System.out.println("for ile gezinti");
        for (int i=0 ; i < sehirler.size() ; i++){
            System.out.print(sehirler.get(i)+",");
        }

        Iterator<String> iterator = sehirler.iterator();
        System.out.println("\nIterator ile gezinti");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }
}