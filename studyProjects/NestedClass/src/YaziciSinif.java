public class YaziciSinif {

    private int privateDegisken=1;
    int defaultDegisken=2;
    protected int protectedDegisken=3;
    public int publicDegisken=4;

    private void privateMetot(){}
    void defaultMetot(){}
    protected void protectedMetot(){}
    public void publicMetot(){}

    class StringDiziYazdir{

        void stringDiziYazdir(String[] dizi){
            for (String gecici:dizi){
                System.out.println(gecici);
            }
        }
    }
}
