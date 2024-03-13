public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci(319);
        Ogrenci ogr3 = new Ogrenci(212,(byte) 7);
        Ogrenci ogr4 = new Ogrenci(1,(byte) 12,"Akif");
        Ogrenci ogr5 = new Ogrenci(23,(byte) 11,"Zeki",true);

        ogr4.setOgrenciNo(57);
        ogr4.ogrenciBilgileriYazdir();

    }
}