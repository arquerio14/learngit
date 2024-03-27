public class Main {
    public static void main(String[] args) {

        try {
            Integer i = new Integer("asd");
            System.out.println(i);
        }catch (Exception e){
            System.out.println("Hata çıktı: "+e.toString());
        }
        try {
            int sonuc = 5/0;
        }catch (Exception e){
            System.out.println("Hata: "+e.toString());
        }
        try {
            int[] sayilar = {1,2,3};
            System.out.println(sayilar[4]);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            Object a = new Object();
            String s = (String) a;
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Finally çalıştı.");
            System.out.println("Program devam ediyor.");
        }

    }
}