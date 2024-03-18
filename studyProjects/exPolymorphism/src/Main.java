public class Main {
    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        Kopek kopek1 = new Kopek("Doberman");
        Kedi kedi1 = new Kedi("Van");

        adiniSoyle(kopek1);
    }
    public static void adiniSoyle(Hayvan hayvan){
        hayvan.adiniSoyle();
    }
}