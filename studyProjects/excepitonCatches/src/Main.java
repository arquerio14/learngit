public class Main {
    public static void main(String[] args) {
        String[] dizi = {"abc","234",null,"bdc"};

        for (int i=0 ; i< dizi.length+2 ; i++){

            try {
                int sayi= dizi[i].length() + Integer.parseInt(dizi[i]);
            }catch (NumberFormatException hata){
                System.out.println(hata);
            }catch (NullPointerException hata){
                System.out.println(hata);
            }catch (ArrayIndexOutOfBoundsException hata){
                System.out.println(hata);
            }
        }
        System.out.println("Çalışıyor.");
        for (int i=0 ; i< dizi.length+2 ; i++){

            try {
                int sayi= dizi[i].length() + Integer.parseInt(dizi[i]);
            }catch (Exception hata){
                System.out.println(hata);
            }
        }
        System.out.println("Çalışıyor");
    }
}