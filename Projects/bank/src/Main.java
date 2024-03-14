public class Main {
    public static void main(String[] args) {

        bankDetails emre = new bankDetails(1,700);
        bankDetails hasan = new bankDetails(2,950);
        bankDetails merve = new bankDetails(3,1400);
        merve.paraCek(400);

        bankDetails.bankaOzetiGoster();

        hasan.kiyasla(merve);
    }
}