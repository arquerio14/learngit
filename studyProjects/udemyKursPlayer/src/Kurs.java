public class Kurs {
    private String kursIsim;

    public Kurs(String kursIsim) {
        this.kursIsim = kursIsim;
    }

    public String getKursIsim() {
        return kursIsim;
    }

    public void setKursIsim(String kursIsim) {
        this.kursIsim = kursIsim;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "kursIsim='" + kursIsim + '\'' +
                '}';
    }
}
