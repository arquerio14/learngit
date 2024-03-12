public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[10];

        for (int i=0;i< sayilar.length;i++){
            sayilar[i] = (int) Math.pow(i,2);
        }
        for (int i=0;i< sayilar.length;i++){
            System.out.println("Değerler : "+sayilar[i]);
        }
    }
}