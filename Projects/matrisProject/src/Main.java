public class Main {
    public static void main(String[] args) {
        int[][] matris = new int[3][2];
        int toplam=0;

        for (int satir=0;satir< matris.length;satir++){

            for (int sütun=0;sütun<matris[2].length;sütun++){
                matris[satir][sütun] = (int) (Math.random() * 11);
                toplam = toplam + matris[satir][sütun];
                System.out.print(matris[satir][sütun]+",");
            }
        }
        System.out.println("\nMatristeki sayıların toplamı : "+toplam);

        int enBuyukSayi = matris[0][0];
        int enKucukSayi = matris[0][0];
        for (int satir=0;satir< matris.length;satir++){

            for (int sütun=0;sütun<matris[2].length;sütun++){
                if (matris[satir][sütun]>enBuyukSayi){
                    enBuyukSayi=matris[satir][sütun];
                }
                if (matris[satir][sütun]<enKucukSayi){
                    enKucukSayi=matris[satir][sütun];
                }
            }
        }
        System.out.println(enBuyukSayi);
        System.out.println(enKucukSayi);
    }
}