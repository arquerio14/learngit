public class Main {
    public static void main(String[] args) {
        int[][] matris = new int[5][5];

        randomSayiUret(matris);
        ekranaYazdir(matris);
        caprazTopla(matris);
    }

    private static void caprazTopla(int[][] matris) {
        int toplam=0;
        for (int satir=0 ; satir < matris.length ; satir++){
            if (satir % 2 == 0) {
                for (int sütun = 0; sütun < matris[satir].length; sütun = sütun + 2) {
                    toplam = toplam + matris[satir][sütun];
                }
            }else if (satir % 2 == 1){
                for (int sütun = 1; sütun < matris[satir].length; sütun = sütun + 2) {
                    toplam = toplam + matris[satir][sütun];
                }
            }
        }
        System.out.println(toplam);
    }

    private static void ekranaYazdir(int[][] matris) {
        for (int satir=0 ; satir < matris.length ; satir++){
            for (int sütun=0 ; sütun < matris[satir].length ; sütun++){
                System.out.print(matris[satir][sütun]+",");
            }
            System.out.println();
        }
    }

    private static void randomSayiUret(int[][] matris) {
        for (int satir=0 ; satir < matris.length ; satir++){
            for (int sütun=0 ; sütun < matris[satir].length ; sütun++){
                matris [satir][sütun] = (int) (Math.random() * 10);
            }
        }
    }
}