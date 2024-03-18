public class Main {
    public static void main(String[] args) {
        Canlı canli = new Canlı();
        canli.adiniSoyle();

        Canlı kartal = new Kartal();
        kartal.adiniSoyle();
        ((Kartal)kartal).uc();

        Canlı panda = new Panda();
        panda.adiniSoyle();
        ((Panda)panda).oyna();
    }

    public static Canlı rastgeleSec(){

    }
}