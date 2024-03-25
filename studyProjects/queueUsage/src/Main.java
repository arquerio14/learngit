import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Ogrenci> ogrenciKuyruk = new PriorityQueue<>(new Comparator<Ogrenci>() {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) {
                if (o1.getId() < o2.getId()){
                    return -1;
                }else return 1;
            }
        });

        ogrenciKuyruk.offer(new Ogrenci(5,84));
        ogrenciKuyruk.offer(new Ogrenci(2,24));
        ogrenciKuyruk.offer(new Ogrenci(6,98));
        ogrenciKuyruk.offer(new Ogrenci(1,47));
        ogrenciKuyruk.offer(new Ogrenci(9,16));

        while (!ogrenciKuyruk.isEmpty()){
            System.out.println(ogrenciKuyruk.poll());
        }


        /*PriorityQueue<String> isimler = new PriorityQueue<>();
        isimler.offer("ayşe");
        isimler.offer("burak");
        isimler.offer("mehmet");
        isimler.offer("fatma");
        isimler.offer("hasan");

        while (!isimler.isEmpty()){
            System.out.println(isimler.poll());
        }*/

        /*Queue<Integer> sayilar = new LinkedList<>();
        sayilar.offer(2);
        sayilar.offer(5);
        sayilar.offer(1);
        sayilar.offer(7);
        sayilar.offer(9);
        sayilar.add(4);

        System.out.println(sayilar);
        System.out.println(sayilar.peek());
        System.out.println(sayilar.poll());
        System.out.println(sayilar);*/
    }
}