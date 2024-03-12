public class Main {
    public static void main(String[] args) {
        int sayilar[] = {1,5,8,23,76,2,-7,113,34,-12};

        diziYerDegistir(sayilar);
        selectionSort(sayilar);
        diziYazdir(sayilar);
        int sonuc = binarySearch(sayilar,23);
        System.out.println(sonuc);

    }
    public static int binarySearch(int[] dizi,int aranacakEleman){
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length-1;

        while (enYuksekIndex >= enDusukIndex){

            int ortaIndex = (enYuksekIndex+enDusukIndex)/2;
            if (aranacakEleman < dizi[ortaIndex]){
                enYuksekIndex = ortaIndex - 1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;
            }else {
                enDusukIndex = ortaIndex + 1;
            }
        }
        return -enDusukIndex -1;
    }

    public static void selectionSort(int[] dizi){
        for (int i=0;i < dizi.length;i++){

            int oankiEnKucukSayi = dizi[i];
            int oankiEnKucukIndeks = i;
            for (int j=i+1;j< dizi.length;j++){
                if (oankiEnKucukSayi > dizi[j]){
                    oankiEnKucukSayi = dizi[j];
                    oankiEnKucukIndeks = j;
                }
            }
            if (oankiEnKucukIndeks != i){
                dizi[oankiEnKucukIndeks] = dizi[i];
                dizi[i] = oankiEnKucukSayi;
            }
        }

    }

    public static void diziYerDegistir(int[] dizi){
        for (int i=dizi.length-1;i>0;i--){
            int randomIndex = (int) (Math.random() * (i+1));

            int gecici = dizi[i];
            dizi[i] = dizi[randomIndex];
            dizi[randomIndex] = gecici;
        }
    }

    public static void diziYazdir(int[] dizi){
        for (int e:dizi){
            System.out.println(e+",");
        }
    }
}