public class Main {
    public static void main(String[] args) {

        try {
            metot3();
        }catch (Exception e){
            System.out.println("Hata yakalandı: "+e);
        }

    }

    private static void metot() throws NumberFormatException {
        Integer sayi = Integer.parseInt("abc");
    }
    private static void metot2()  {
        metot();
    }
    private static void metot3() throws NumberFormatException,ArrayIndexOutOfBoundsException {
        metot2();
    }
}