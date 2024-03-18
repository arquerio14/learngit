public class Kopek extends Hayvan {

    private String cins;

    public Kopek(String cins){
        setAyakSayisi(4);
        this.cins = cins;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir köpek nesnesiyim.");
    }
}
