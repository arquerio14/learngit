import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Calisan> calisanlar = new ArrayList<>();



        try(BufferedReader okuyucu = new BufferedReader(new FileReader("maas.txt"))) {
            String oankiSatir = okuyucu.readLine();

            while (oankiSatir != null){

                String[] sira = oankiSatir.split(" ");
                String isim = sira[0];
                int maas = Integer.parseInt(sira[1]);
                Calisan geciciCalisan = new Calisan(isim,maas);
                calisanlar.add(geciciCalisan);

                oankiSatir = okuyucu.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(calisanlar, new Comparator<Calisan>() {
            @Override
            public int compare(Calisan o1, Calisan o2) {
                if (o1.maas > o2.maas){
                    return -1;
                } else if (o1.maas < o2.maas) {
                    return 1;
                }else return 0;
            }
        });
        try(BufferedWriter yazici = new BufferedWriter(new FileWriter("sirali_maas.txt"))) {

            for (Calisan gecici : calisanlar){
                yazici.write(gecici.isim+" "+gecici.maas);
                yazici.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}