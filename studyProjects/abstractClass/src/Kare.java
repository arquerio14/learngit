public class Kare extends GeometrikSekil {

    public Kare(int kenar){
        setBirinciKenar(kenar);
    }

    public void adiniSoyle(){
        System.out.println("Ben bir kare nesnesiyim.");
    }

    @Override
    public void cevreHesapla() {
        setHesaplananCevre(getBirinciKenar()*4);
        System.out.println("Karenin çevresi: "+getHesaplananCevre());
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar()*getBirinciKenar());
        System.out.println("Karenin alanı: "+getHesaplananAlan());
    }
}
