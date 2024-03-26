import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(5,"Kerim");
        Student st2 = new Student(2,"Zeliha");
        Student st3 = new Student(7,"Orçun");
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        Student enBuyukOgrenci = Collections.max(students);
        System.out.println(enBuyukOgrenci);
        Student enKucukOgrenci = Collections.min(students);
        System.out.println(enKucukOgrenci);

        System.out.println("Sıralamadan önce: "+students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() < o2.getId()){
                    return 1;
                } else if (o1.getId() > o2.getId()) {
                    return -1;
                }else return 0;
            }
        });
        System.out.println("Sıralamadan sonra: "+students);

        Collections.shuffle(students);
        System.out.println("Karıştırıldıktan sonra: "+students);
    }
}