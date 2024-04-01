import java.io.*;

public class Main {
    public static void main(String[] args) {

        dosyayaYaz();
        dosyadanOku();
    }

    private static void dosyadanOku() {
        DataInputStream dataInputStream = null;
        boolean dosyaSonu = false;

        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));

            try {
            while (!dosyaSonu) {
                Ogrenci okunanOgrenci;
                int id = dataInputStream.readInt();
                String isim = dataInputStream.readUTF();
                boolean aktif = dataInputStream.readBoolean();
                okunanOgrenci = new Ogrenci(id, isim, aktif);
                System.out.println(okunanOgrenci);
            }
            }catch (EOFException e){
                System.out.println("Dosya sonuna gelindi.");
                dosyaSonu = true;
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void dosyayaYaz() {
        DataOutputStream dataOutputStream = null;
        Ogrenci ogr1 = new Ogrenci(1,"Ahmet",true);
        Ogrenci ogr2 = new Ogrenci(2,"Mehmet",false);

        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciler.dat")));
            dataOutputStream.writeInt(ogr1.id);
            dataOutputStream.writeUTF(ogr1.isim);
            dataOutputStream.writeBoolean(ogr1.aktif);

            dataOutputStream.writeInt(ogr2.id);
            dataOutputStream.writeUTF(ogr2.isim);
            dataOutputStream.writeBoolean(ogr2.aktif);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dataOutputStream != null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}