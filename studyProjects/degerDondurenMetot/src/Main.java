public class Main {
    public static void main(String[] args) {
        System.out.println(StringDegerDondurenMetot());
    }

    private static String StringDegerDondurenMetot() {
        String selam = "Merhaba ";
        try {
            selam = selam + "try ";
            ArithmeticException e = new ArithmeticException();
            throw e;
        }catch (Exception e){
            selam = selam + "catch ";
            return selam;
        }finally {
            selam = selam + "finally ";
            return selam;
        }
    }
}