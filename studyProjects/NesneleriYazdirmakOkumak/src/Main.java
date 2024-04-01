import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();
        ogrenciListesi.add(new Ogrenci(4, "Ata", false));
        ogrenciListesi.add(new Ogrenci(5, "Berke", false));

        //dosyayaNesneYazdir();

        //dosyadanNesneOku();

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciNesneleriListesi.dat")))) {

            objectOutputStream.writeObject(ogrenciListesi);

        } catch (Exception e) {
            System.out.println("Hata alındı.");
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenciNesneleriListesi.dat")))) {


            ArrayList<Ogrenci> okunanListe = (ArrayList<Ogrenci>) objectInputStream.readObject();
            System.out.println("Okunan arraylist: "+okunanListe);

        } catch (Exception e) {
            System.out.println("Hata bulundu.");
        }

    }

    private static void dosyadanNesneOku() {
        boolean dosyaSonu = false;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenciNesneleri.dat")))) {

            while (!dosyaSonu) {
                try {
                    Ogrenci okunanOgrenci = (Ogrenci) objectInputStream.readObject();
                    System.out.println(okunanOgrenci);
                } catch (EOFException e) {
                    dosyaSonu = true;
                    System.out.println("Dosyanın sonuna geldin.");
                }
            }
        } catch (Exception e) {
            System.out.println("Hata bulundu.");
        }
    }

    private static void dosyayaNesneYazdir() {

        Ogrenci ogr1 = new Ogrenci(1, "Ahmet", true);
        Ogrenci ogr2 = new Ogrenci(2, "Ayşe", false);
        Ogrenci ogr3 = new Ogrenci(3, "Fatma", true);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciNesneleri.dat")))) {

            objectOutputStream.writeObject(ogr1);
            objectOutputStream.writeObject(ogr2);
            objectOutputStream.writeObject(ogr3);

        } catch (Exception e) {
            System.out.println("Hata alındı.");
        }
    }
}