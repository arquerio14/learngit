public class Ogrenci implements Comparable<Ogrenci> {
    private int id;
    private int notDegeri;

    public Ogrenci(int id,int notDegeri){
        this.id = id;
        this.notDegeri = notDegeri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotDegeri() {
        return notDegeri;
    }

    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if (this.notDegeri > o.getNotDegeri()){
            return 1;
        } else if (this.notDegeri < o.getNotDegeri()) {
            return -1;
        }else {return 0;}
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", notDegeri=" + notDegeri +
                '}';
    }
}
