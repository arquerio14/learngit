import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("5");
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("1",1);
        treeMap.put("2",2);
        treeMap.put("3",3);
        treeMap.put("4",4);
        treeMap.put("5",5);

        //SortedSet ve SortedMap metodları

        System.out.println(treeMap.comparator());
        System.out.println(treeSet.comparator());

        System.out.println(treeSet.subSet("2","4"));
        System.out.println(treeMap.subMap("1","3"));

        System.out.println(treeSet.headSet("4"));
        System.out.println(treeMap.headMap("3"));

        System.out.println(treeSet.tailSet("4"));
        System.out.println(treeMap.tailMap("2"));

        System.out.println(treeSet.first());
        System.out.println(treeMap.firstKey());

        System.out.println(treeSet.last());
        System.out.println(treeMap.lastKey());

        //NavigableSet ve NavigableMap metodları

        System.out.println("Lower: "+treeSet.lower("3"));
        System.out.println("Lower: "+treeMap.lowerKey("3"));

        System.out.println("Floor: "+treeSet.floor("3"));
        System.out.println("Floor: "+treeMap.floorKey("3"));

        System.out.println("Ceiling: "+treeSet.ceiling("3"));
        System.out.println("Ceiling: "+treeMap.ceilingKey("3"));

        System.out.println(treeSet);
        System.out.println("Poll first: "+treeSet.pollFirst());
        System.out.println(treeSet);

        System.out.println("Poll last: "+treeSet.pollLast());
        System.out.println(treeSet);
    }
}