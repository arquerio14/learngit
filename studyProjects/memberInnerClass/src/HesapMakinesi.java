public class HesapMakinesi {

    public int carp(int i, int i1) {
        Carp carp = new Carp();
        int carpim = carp.carp(i,i1);
        return carpim;
    }

    public String bolmeYap(int sayi1,int sayi2) {
        class Bolme{
            public String bol(int i,int j){
                if (j == 0){
                    System.out.println("Bölen sıfır olamaz.");
                    return "";
                }else {
                    int sonuc = i/j;
                    return String.valueOf(sonuc);
                }
            }
        }
        Bolme b = new Bolme();
        String sonuc = b.bol(sayi1,sayi2);
        return sonuc;
    }

    public class Topla{
        public int topla(int i,int j){
            return i+j;
        }
    }
    public class Cikar{
        public int cikar(int i,int j){
            return i-j;
        }
    }
    public class Carp{
        public int carp(int i,int j){
            return i*j;
        }
    }

}
