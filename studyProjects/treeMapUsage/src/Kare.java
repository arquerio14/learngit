public class Kare implements Comparable<Kare> {
    private int kenar;
    private String renk;

    public Kare(int kenar, String renk) {
        this.kenar = kenar;
        this.renk = renk;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public int compareTo(Kare o) {
        if (this.getKenar() < o.getKenar()){
            return -1;
        } else if (this.getKenar() > o.getKenar()) {
            return 1;
        }else return 0;

    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                ", renk='" + renk + '\'' +
                '}';
    }
}
