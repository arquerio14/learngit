public class CemberDaire {
    private int cevre;
    private int alan;
    private int pi=3;
    private int r;

    public CemberDaire(){}

    public CemberDaire(int yaricap){
        this.r = yaricap;
    }

    public void alanHesapla (){
        alan = pi*(r*r);
    }

    public void cevreHesapla (){
        cevre = 2*pi*r;
    }

    public int getCevre() {
        return cevre;
    }

    public int getAlan() {
        return alan;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
