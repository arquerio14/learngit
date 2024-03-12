public class Main {
    public static void main(String[] args) {
        int[][] sayilar = new int[2][3];
        sayilar[0][0] = 1;
        sayilar[0][1] = 2;
        sayilar[0][2] = 3;
        sayilar[1][0] = 4;
        sayilar[1][1] = 5;
        sayilar[1][2] = 6;

        int[][] sayilar2 = {{1,2,3},{4,5,6},{7,8,9}};

        for (int satir=0;satir<sayilar.length;satir++){
            for (int sütun=0;sütun<sayilar[satir].length;sütun++){
                System.out.println(satir+". satırın "+sütun+". sütununun değeri : "+sayilar[satir][sütun]);
            }
        }
        System.out.println("--------------------");
        int[][] borclar = {{0,100,200},{350,0,250},{150,500,0}};
        String[] isimler = {"Emre","Hasan","Ali"};
        for (int satir=0;satir<borclar.length;satir++){
            for (int sütun=0;sütun<borclar[satir].length;sütun++){
                if (satir != sütun){
                    int alacak = borclar[satir][sütun] - borclar[sütun][satir];
                    if (alacak<0){
                        System.out.println(isimler[satir]+"nin "+isimler[sütun]+"den alacağı miktar : "+(-alacak));
                    }
                }
            }
        }
    }
}