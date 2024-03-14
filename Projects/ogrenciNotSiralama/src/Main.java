
public class Main {
    public static void main(String[] args) {

        Ogrenci tumOgrenciler[] = new Ogrenci[100];

        for (int i=0 ; i < tumOgrenciler.length ; i++){

            int rastgeleId = (int) (Math.random() * 5000);
            int rastgeleNot = (int) (Math.random() * 101);

            Ogrenci yeni = new Ogrenci(rastgeleId,rastgeleNot);
            tumOgrenciler[i] = yeni;
            tumOgrenciler[i].ogrenciBilgileriYazdir();
        }
    }
}