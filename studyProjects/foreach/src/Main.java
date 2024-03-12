public class Main {
    public static void main(String[] args) {
        String isimler[] = {"Ahmet", "Mehmet", "Hasan"};

        diziYazdir(isimler);

    }
    public static void diziYazdir(String dizi[]){
        for (String isim:dizi){
            System.out.println("İsim : "+isim);
        }
    }
}