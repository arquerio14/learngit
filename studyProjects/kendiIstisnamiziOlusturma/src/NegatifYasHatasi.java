public class NegatifYasHatasi extends Exception {
    String hataMesaji;

    public NegatifYasHatasi(String hataMesaji) {
        this.hataMesaji = hataMesaji;
    }

    @Override
    public String toString() {
        return "NegatifYasHatasi{" +
                "hataMesaji='" + hataMesaji + '\'' +
                '}';
    }
}
