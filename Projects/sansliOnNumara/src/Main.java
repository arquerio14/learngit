import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,Integer> random = new HashMap<Integer, Integer>();
        ArrayList<Integer> randomsıra = new ArrayList<>();
        HashSet<Integer> sansliOnNumara = new HashSet<>(10);

        mapiSayilarlaDoldu(random);

        for (int i=1 ; i<=60 ; i++){
            int gecici = random.get(i);
            for (int j=0 ; j < gecici ; j++){
                randomsıra.add(i);
            }
        }
        Collections.shuffle(randomsıra);
        for (int i=0 ; i < 10; i++){
            int rnd = (int) ((Math.random() * 999999) + 1);
            sansliOnNumara.add(randomsıra.get(rnd));
        }
        System.out.println(sansliOnNumara);
    }

    private static void mapiSayilarlaDoldu(HashMap<Integer, Integer> random) {
        for (int i=0;i < 1000000; i++){
            int rnd = (int) ((Math.random() * 60) + 1);
            if (random.containsKey(rnd)){
                random.put(rnd,random.get(rnd)+1);
            }else random.put(rnd,1);
        }
    }
}