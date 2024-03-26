import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1,value2,egitmendegeri;
        boolean d = true;
        Kurs k1 =new Kurs("Java nedir");
        Kurs k2 =new Kurs("Nesne Tabanlı Programlama");
        Kurs k3 =new Kurs("Git nedir");
        Kurs k4 =new Kurs("Github");
        Kurs k5 =new Kurs("Javafx nedir");


        Egitmen egt1 = new Egitmen("Ahmet","Kaçak","02437866493",1,k1,k2);
        Egitmen egt2 = new Egitmen("Zeki","Sancar","02767892453",2,k4,k5,k3);
        Egitmen egt3 = new Egitmen("Fatma","Zorlu","02133041463",3,k2,k3);
        ArrayList<Egitmen> egitmenler = new ArrayList<>();
        egitmenler.add(egt1);
        egitmenler.add(egt2);
        egitmenler.add(egt3);

        while (d){
            girisMenuGoster();
            value1 = input.nextInt();
            switch (value1){
                case 0:
                    d = false;
                    break;
                case 1:
                    System.out.println("----- EĞİTMEN LİSTESİ -----");
                    for (Egitmen gecici :egitmenler){
                        System.out.println(gecici);
                    }
                    System.out.println("Eğitmen Seçiniz: ");
                    egitmendegeri = input.nextInt();
                    egitmenMenuGoster();
                    value2 = input.nextInt();
                    switch (value2){
                        case 0:
                            break;
                        case 1:

                    }
            }
        }
    }
    public static void girisMenuGoster(){
        System.out.println("--------------- MENÜ ---------------");
        System.out.println("1 - Eğitmen girişi.");
        System.out.println("2 - Öğrenci girişi.");
        System.out.println("0 - QUİT");
    }
    public static void egitmenMenuGoster(){
        System.out.println("--------------- EĞİTMEN MENÜ ---------------");
        System.out.println("1 - Ders ekle.");
        System.out.println("0 - BACK");
    }
}