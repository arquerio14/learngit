import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*String st1 = "Emre";
        String st2 = "Hasan";
        String st3 = "Emre";
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());*/

        Ogrenci ogr1 = new Ogrenci(1,"Muhammed");
        System.out.println(ogr1.hashCode());
        Ogrenci ogr2 = new Ogrenci(1,"Muhammed");
        System.out.println(ogr2.hashCode());
        System.out.println(ogr1.equals(ogr2));

        /*HashMap<Integer,String> plakalar = new HashMap<>();

        plakalar.put(01,"Adana");
        plakalar.put(14,"Bolu");
        plakalar.put(34,"İstanbul");
        plakalar.put(06,"Ankara");
        plakalar.put(35,"İzmir");
        plakalar.put(null,"null değer");

        HashMap<Integer,String> plakalarYedek = new HashMap<>();
        System.out.println(plakalarYedek.size());
        plakalarYedek.putAll(plakalar);
        System.out.println(plakalarYedek.size());
        plakalarYedek.clear();
        System.out.println(plakalarYedek.size());

        System.out.println(plakalar);
        String deger = plakalar.get(14);
        System.out.println(plakalar.get(null));
        System.out.println(deger);
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.containsKey(23));
        System.out.println(plakalar.containsValue("Bolu"));

        for (Integer key : plakalar.keySet()){
            System.out.print(key+" ");
        }
        System.out.println("\n");
        for (String values : plakalar.values()){
            System.out.print(values+" ");
        }*/
    }
}