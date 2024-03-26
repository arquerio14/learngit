public class Student implements Comparable<Student> {
    private int id;
    private String isim;

    public Student(int id, String isim) {
        this.id = id;
        this.isim = isim;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.isim.compareTo(o.isim) < 0){
            return -1;
        }else if (this.isim.compareTo(o.isim) > 0){
            return 1;
        }else return 0;
    }
}
