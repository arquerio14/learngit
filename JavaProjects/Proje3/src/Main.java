//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char harf = 'İ';
        char[] kalın = {'A', 'I', 'O', 'U'};
        char[] ince = {'E', 'İ', 'Ö', 'Ü'};

        for (int i = 0; i < 4; i++) {
            if (harf == kalın[i]) {
                System.out.println("Kalın sesli harf.");
                return;
            }
            if (harf == ince[i]) {
                System.out.println("İnce sesli harf.");
                return;
            }
        }
        System.out.println("Aradığınız harf tanımlara uymuyor.");
    }
}