public class bankDetails {
    private int hesapNo;
    private int hesapBakiye;
    private static int tumBankaBakiyesi;
    private static int tumHesapSayisi;
    private static int operasyonSayisi;

    public bankDetails(){}

    public bankDetails(int hesapNo,int hesapBakiye){
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi += hesapBakiye;
        tumHesapSayisi++;
    }

    public void kiyasla(bankDetails müşterisim){
        if (this.getHesapBakiye() < müşterisim.getHesapBakiye()){
            System.out.println(this.getHesapNo()+".No'lu müşterinin "+müşterisim.getHesapNo()+".No'lu müşteriden hesap bakiyesi azdır.");
        } else if (this.getHesapBakiye() > müşterisim.getHesapBakiye()) {
            System.out.println(this.getHesapNo()+".No'lu müşterinin "+müşterisim.getHesapNo()+".No'lu müşteriden hesap bakiyesi çoktur.");
        }else {
            System.out.println(this.getHesapNo()+".No'lu müşterinin "+müşterisim.getHesapNo()+".No'lu müşteriye hesap bakiyesi eşittir.");
        }
    }

    public static void bankaOzetiGoster(){
        System.out.println("Bankadaki hesap sayısı: "+tumHesapSayisi+"\nBankadaki toplam para: "+tumBankaBakiyesi+"\nBankada yapılan operasyon sayısı: "+operasyonSayisi);
    }

    public void paraYatir(int paraMiktari){
        hesapBakiye += paraMiktari;
        tumBankaBakiyesi += paraMiktari;
        operasyonSayisi++;
    }

    public void paraCek(int paraMiktari){
        if (paraMiktari <= hesapBakiye){
            hesapBakiye -= paraMiktari;
            tumBankaBakiyesi -= paraMiktari;
            operasyonSayisi++;
        }else {
            System.out.println("Bakiye yetersiz.");
        }
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(int hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }
}
