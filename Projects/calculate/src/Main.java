public class Main {
    public static void main(String[] args) {

        CemberDaire d1 = new CemberDaire(15);
        d1.alanHesapla();
        d1.cevreHesapla();
        System.out.println("Alan: "+ d1.getAlan());
        System.out.println("Cevre: "+ d1.getCevre());

        CemberDaire d2 = new CemberDaire(5);
        d2.alanHesapla();
        d2.cevreHesapla();
        System.out.println("Alan: "+ d2.getAlan());
        System.out.println("Cevre: "+ d2.getCevre());
    }
}