public class Main {
    public static void main(String[] args) {
        int anaDizi[] = {1, 3, 5, 7};
        int kopyaDizi[] = new int[anaDizi.length];

        for (int index = 0; index < anaDizi.length; index++) {

            kopyaDizi[index] = anaDizi[index];

        }


        //arraycopy

        int kopyaDizi2[] = new int[anaDizi.length];
        System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);


        int denemeDizisi[] = new int[anaDizi.length];
        denemeDizisi = anaDizi;

        //diziYazdir(denemeDizisi);

        anaDizi[0] = 100;
        //System.out.println("\n----");
        //diziYazdir(denemeDizisi);

        int[] tersineDizi = tersiniDöndür(anaDizi);
        diziYazdir(anaDizi);
        System.out.println("\n-----");
        diziYazdir(tersineDizi);
    }

    public static int[] tersiniDöndür(int[] dizi) {
        int olusanDizi[] = new int[dizi.length];

        for (int i = 0, j = dizi.length - 1; i < dizi.length; i++, j--) {
            olusanDizi[i] = dizi[j];
        }
        return olusanDizi;
    }

    public static void diziYazdir(int[] dizi) {
        for (int sayi : dizi) {
            System.out.print(sayi + ",");
        }
    }
}