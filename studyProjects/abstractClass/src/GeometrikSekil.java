public abstract class GeometrikSekil {

    private int birinciKenar;
    private int hesaplananAlan;
    private int hesaplananCevre;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getHesaplananCevre() {
        return hesaplananCevre;
    }

    public void setHesaplananCevre(int hesaplananCevre) {
        this.hesaplananCevre = hesaplananCevre;
    }

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}
