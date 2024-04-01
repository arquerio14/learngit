import java.io.Serializable;

public class Ogrenci implements Serializable {
    int id;
    String isim;
    boolean aktif;
    private final long serialVersionUID = 1L;

    public Ogrenci(int id, String isim, boolean aktif) {
        this.id = id;
        this.isim = isim;
        this.aktif = aktif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}
