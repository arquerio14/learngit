public class Dikdortgen extends GeometrikSekil {

    private int ikinciKenar;

    public Dikdortgen(int birinciKenar,int ikinciKenar){
        setBirinciKenar(birinciKenar);
        this.ikinciKenar = ikinciKenar;
    }
    public void adiniSoyle(){
        System.out.println("Ben bir dikdörtgen nesnesiyim.");
    }

    @Override
    public void cevreHesapla() {
        setHesaplananCevre(2*(getBirinciKenar()+ikinciKenar));
        System.out.println("Dikdörtgenin çevresi: "+getHesaplananCevre());
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar()*ikinciKenar);
        System.out.println("Dikdörtgenin alanı: "+getHesaplananAlan());
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }


}
