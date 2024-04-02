import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int toplamKarakterSayisi=0;
        int toplamKelimeSayisi=0;
        int toplamSatirSayisi=0;
        HashMap<String , Integer> kelimeTekrarMap = new HashMap<>();

        try(BufferedReader okuyucu = new BufferedReader(new FileReader("istiklalmarsi.txt"))) {

            String oankiSatir = okuyucu.readLine();

            while (oankiSatir != null){
                toplamSatirSayisi++;

                String[] satirdakiKelimeDizisi = oankiSatir.split(" ");
                toplamKelimeSayisi = toplamKelimeSayisi + satirdakiKelimeDizisi.length;

                for (String kelime : satirdakiKelimeDizisi){

                    if (kelimeTekrarMap.containsKey(kelime)){
                        kelimeTekrarMap.put(kelime,kelimeTekrarMap.get(kelime)+1);
                    }else {
                        kelimeTekrarMap.put(kelime,1);
                    }




                    toplamKarakterSayisi = toplamKarakterSayisi + kelime.length();
                }

                oankiSatir = okuyucu.readLine();
            }

            System.out.println("Toplam satır sayısı: "+toplamSatirSayisi);
            System.out.println("Toplam kelime sayısı: "+toplamKelimeSayisi);
            System.out.println("Toplam karakter sayısı: "+toplamKarakterSayisi);
            System.out.println(kelimeTekrarMap);

            int tekrarSayisi = 0;
            String enCokTekrarEdenKelime = null;

            for (Map.Entry<String ,Integer> temp : kelimeTekrarMap.entrySet()){
                if (temp.getValue() > tekrarSayisi && !temp.getKey().equals("")){
                    enCokTekrarEdenKelime = temp.getKey();
                    tekrarSayisi = temp.getValue();
                }
            }
            System.out.println("En çok tekrar eden kelime: "+enCokTekrarEdenKelime+" Tekrar sayısı: "+tekrarSayisi);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}