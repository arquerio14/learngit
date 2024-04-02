import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        maasOku();

        try(BufferedReader yazici = new BufferedReader(new FileReader("siralimaas.txt"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void maasOku() {
        HashMap<String ,Integer> maas = new HashMap<>();
        ArrayList<String> key = new ArrayList<>();

        try(BufferedReader okuyucu = new BufferedReader(new FileReader("maas.txt"))) {
            String oankiSatir = okuyucu.readLine();

            while (oankiSatir != null){

                String[] satir = oankiSatir.split(" ");
                key.add(satir[0]);

                maas.put(satir[0], Integer.valueOf(satir[1]));

                oankiSatir = okuyucu.readLine();
            }
            int enBuyukMaas = 0;
            int gecici = 0;
            for (String temp : key){

                gecici = maas.get(temp);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}