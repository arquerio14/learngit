import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("Muhammmed",5);
        Student std2 = new Student("Ayşe",2);
        Student std3 = new Student("Fatma",4);

        Student[] students = {std1,std2,std3};

        System.out.println("Dizi sıralanmadan önce.");
        for (Student s:students){
            System.out.println(s);
        }
        Arrays.sort(students);

        System.out.println("Dizi sıralamadan sonra.");

        for (Student s:students){
            System.out.println(s);
        }
    }
}