import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        veriYazma();
        veriOkuma();
    }

    private static void veriOkuma() {

        try (BufferedReader okuyucu = new BufferedReader(new FileReader("karakter.txt"))){
            String s;

            while ( (s = okuyucu.readLine()) != null){
                System.out.println(s);
            }

        }catch (Exception e){
            System.out.println("HATA.");
        }
    }

    private static void veriYazma() {
        try (BufferedWriter yazici = new BufferedWriter(new FileWriter("karakter.txt",true))){
            yazici.write("Merhaba");
            yazici.newLine();
            yazici.write("ddd\n");
            yazici.write("-----\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}