public class Kedi extends Hayvan {

    private String tur;
    private String cins;

    public Kedi(String dogumTarihi, boolean kayitli,String cins) {
        super(dogumTarihi, kayitli);
        this.tur = "Kedi";
        this.cins = cins;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+"Kayıtlı mı: "+isKayitli()+" Doğum tarihi: "+getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
