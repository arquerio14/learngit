import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka,String boyut){
        this.marka = marka;
        this.boyut = boyut;
        kanallar = new ArrayList<>();
        ses = 10;
        aktifKanal = 1;
        kanallariOlustur();
        this.acik = false;
    }

    public void kanalDegistir(int acilmasiIstenenKanal){
        if (acik){
            if (acilmasiIstenenKanal != aktifKanal){
                if (acilmasiIstenenKanal <= kanallar.size() && acilmasiIstenenKanal >= 0){
                    aktifKanal = acilmasiIstenenKanal;
                    System.out.println("Kanal: "+acilmasiIstenenKanal+" Bilgi: "+kanallar.get(acilmasiIstenenKanal-1).kanalBilgisiniGoster());
                }else {
                    System.out.println("Geçerli bir kanal numarası giriniz.");
                }
            }else {
                System.out.println("Zaten "+aktifKanal+". kanaldasınız. Değiştirme yapılamadı.");
            }
        }else {
            System.out.println("Önce televizyonu açınız.");
        }
    }
    public void aktifKanaliGoster(){
        if (acik){
            System.out.println("Aktif kanal: "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
        }else {
            System.out.println("Önce televizyonu açınız.");
        }
    }

    public void sesArttir(){
        if (ses < 20 && acik == true){
            ses++;
            System.out.println("Ses seviyesi: "+ses);
        }else{
            System.out.println("Ses maximumda daha fazla artmıyor veya tv kapalı.");
        }
    }
    public void sesAzalt(){
        if (ses > 0 && acik == true){
            ses--;
            System.out.println("Ses seviyesi: "+ses);
        }else{
            System.out.println("Ses minimumda daha fazla azalmıyor veya tv kapalı");
        }
    }

    public void tvAc(){
        if (acik == false){
            acik = true;
            System.out.println("TV açıldı.");
        }else {
            System.out.println("TV zaten açık.");
        }
    }
    public void tvKapat(){
        if (acik == true){
            acik = false;
            System.out.println("TV kapatıldı.");
        }else {
            System.out.println("TV zaten kapalı.");
        }
    }

    private void kanallariOlustur() {
        HaberKanali cnn = new HaberKanali("CNN",1,"Genel haber");
        kanallar.add(cnn);
        HaberKanali bein = new HaberKanali("BeinSports",3,"Spor haber");
        kanallar.add(bein);
        MüzikKanali dreamTurk = new MüzikKanali("Dream Türk",2,"Yerli");
        kanallar.add(dreamTurk);
        MüzikKanali numberOne = new MüzikKanali("NumberOne",4,"Yabancı");
        kanallar.add(numberOne);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka: "+marka+" Boyut: "+boyut+" olan tv oluşturuldu";
    }
}
