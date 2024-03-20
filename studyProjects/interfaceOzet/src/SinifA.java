public class SinifA implements interfaceA {

    @Override
    public void metotA() {
        defaultMetot();
    }

    @Override
    public void defaultMetot() {
        interfaceA.super.defaultMetot();
    }
}
