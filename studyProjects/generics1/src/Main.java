public class Main {
    public static void main(String[] args) {
        String[] isimler = {"ayşe","ali","fatma"};
        Integer[] sayilar = {4,3,7,5,9,1,5,6};
        Character[] karakterler = {'a','b','c','ç'};

        /*GenericDiziYazdir<String> stringGenericDiziYazdir = new GenericDiziYazdir();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integerGenericDiziYazdir = new GenericDiziYazdir();
        integerGenericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> charGenericDiziYazdir = new GenericDiziYazdir();
        charGenericDiziYazdir.yazdir(karakterler);*/

        genericYazdir(isimler);
        genericYazdir(sayilar);
        genericYazdir(karakterler);
    }

    public static <Genel> void genericYazdir(Genel[] dizi){
        for (Genel gecici : dizi){
            System.out.println(gecici);
        }
    }
}