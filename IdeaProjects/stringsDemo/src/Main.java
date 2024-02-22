//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel.";

/*        System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ü"));
        System.out.println(mesaj.lastIndexOf("ü"));*/

        String yeniMesaj = (mesaj.replace(' ','-'));
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(3,8));

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
    }
}