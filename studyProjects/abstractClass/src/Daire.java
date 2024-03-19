public class Daire extends GeometrikSekil {

    public Daire(int yaricap){
        setBirinciKenar(yaricap);
    }

    public void adiniSoyle(){
        System.out.println("Ben bir daire nesnesiyim.");
    }

    @Override
    public void cevreHesapla() {
        setHesaplananCevre((int) (2 * 3.14 * getBirinciKenar()));
        System.out.println("Dairenin çevresi: "+getHesaplananCevre());
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) 3.14 * getBirinciKenar()*getBirinciKenar());
        System.out.println("Dairenin alanı: "+getHesaplananAlan());
    }
}
