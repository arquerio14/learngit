public class Student implements Comparable<Student> {
    private String ad;
    private int id;

    public Student(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ad: "+ad+" Id: "+id;
    }

    @Override
    public int compareTo(Student o) {
        /*if (this.id < o.id){
            return -1;
        }else if (this.id > o.id){
            return 1;
        }else return 0;*/
        if (this.ad.compareTo(o.ad) < 0){
            return -1;
        } else if (this.ad.compareTo(o.ad) > 0) {
            return 1;
        }else return 0;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
