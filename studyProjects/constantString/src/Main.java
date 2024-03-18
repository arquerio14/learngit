public class Main {
    public static void main(String[] args) {
        /*String isim = new String("emre");
        String ad = new String("emre");

        System.out.println(isim == ad);
        System.out.println(isim.equals(ad));

        String abc = "emre";
        String yeni = abc.concat(" altunbilek");
        System.out.println(isim == abc);*/

        String isim = "Muhammed";
        System.out.println(isim.length());
        System.out.println(isim.charAt(4));
        System.out.println(isim.concat("Mustafa"));
        System.out.println(isim);
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());

        System.out.println(isim.trim());

        String ay = "Ocak";
        String ay2 = "ocak";

        System.out.println(ay.equals(ay2));
        System.out.println(ay.equalsIgnoreCase(ay2));

        System.out.println(ay.compareTo(ay2));
        System.out.println(ay.startsWith("A"));
        System.out.println(ay.endsWith("k"));
        System.out.println(ay.contains("ca"));

        System.out.println(isim.substring(3));
        System.out.println(isim.substring(3,6));

        System.out.println(isim.indexOf("e"));
        System.out.println(isim.lastIndexOf("m"));
    }
}