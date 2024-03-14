public class Memur {

    private String isim;
    private int maas;
    public static int eklenenMemurSayisi;

    public Memur(){
        eklenenMemurSayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int mesaj) {
        if (maas < 0){
            maas = 0;
        }else {
            this.maas = mesaj;
        }
    }

    public void bilgileriGoster(){
        System.out.println("Oluşturulan memur nesnesi : "+eklenenMemurSayisi);
    }

    public static void kanunuSoyle(){
        System.out.println("000 Nolu kanun geçerli.");
    }
}