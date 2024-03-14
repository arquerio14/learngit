public class Main {
    public static void main(String[] args) {

        Memur m1 = new Memur();
        m1.setIsim("Ahmet");
        m1.setMaas(4000);

        Memur m2 = new Memur();
        m2.setIsim("Ayşe");
        m2.setMaas(3500);

        Memur m3 = new Memur();
        m3.setIsim("Fatma");
        m3.setMaas(3000);

        m3.bilgileriGoster();
        Memur.kanunuSoyle();
        System.out.println("Toplam: "+Memur.eklenenMemurSayisi);
    }
}