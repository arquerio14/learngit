import org.w3c.dom.ls.LSOutput;

public class Kedi extends Hayvan {

    private String tür;

    public Kedi (String cins){
        setAyakSayisi(4);
        this.tür = tür;
    }

    public String getCins() {
        return tür;
    }

    public void setCins(String cins) {
        this.tür = cins;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kedi nesnesiyim.");
    }
}
