public class Calisan {
    String isim;
    int maas;

    public Calisan(String isim, int maas) {
        this.isim = isim;
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                '}';
    }
}
