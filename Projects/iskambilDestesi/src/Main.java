public class Main {
    public static void main(String[] args) {
        String[] kartTürleri = {"Kupa","Maça","Karo","Sinek"};
        String[] kartNumaraları = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int[] deste = new int[52];

        desteOlustur(deste);
        desteKarisir(deste);
        desteGoster(deste,kartTürleri,kartNumaraları);

    }

    private static void desteKarisir(int[] deste) {
        for (int i=0;i< deste.length;i++){

            int rastgeleIndex = (int)(Math.random() * deste.length);
            int gecici = deste[i];
            deste[i] = deste[rastgeleIndex];
            deste[rastgeleIndex] = gecici;
        }
    }

    private static void desteGoster(int[] deste,String[] kartTürleri,String[] kartNumaraları) {
        for (int i=0;i< deste.length;i++){

            String kartTürü = kartTürleri[deste[i]/13];
            String kartNumarası = kartNumaraları[deste[i]%13];
            System.out.println(kartTürü+" "+kartNumarası);
        }
    }

    private static void desteOlustur(int[] deste) {
        for (int i=0;i<deste.length;i++){
            deste[i] = i;
        }
    }
}