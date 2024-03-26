import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String , Integer> treeMap = new TreeMap<>();
        treeMap.put("Adana",01);
        treeMap.put("İstanbul",34);
        treeMap.put("Bolu",14);
        treeMap.put("Ankara",06);
        treeMap.put("İzmir",35);
        System.out.println(treeMap);

        TreeMap<Kare , String> kareStringTreeMap = new TreeMap<>();
        Kare k1 = new Kare(4,"Mavi");
        Kare k2 = new Kare(7,"Sarı");
        Kare k3 = new Kare(6,"Mor");
        kareStringTreeMap.put(k1 , "Mavi kare");
        kareStringTreeMap.put(k2 , "Sarı kare");
        kareStringTreeMap.put(k3 , "Mor kare");
        System.out.println(kareStringTreeMap);
    }
}