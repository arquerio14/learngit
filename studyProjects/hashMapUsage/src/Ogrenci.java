import java.util.Objects;

public class Ogrenci {
    private int id;
    private String isim;

    public Ogrenci(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return id == ogrenci.id && Objects.equals(isim, ogrenci.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
