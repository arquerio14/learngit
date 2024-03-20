public interface interfaceA {
    void metotA();
    default void defaultMetot(){
        System.out.println("Ben default metodum.");
    }
    static final int  sayi = 10;
    static void staticMetot(){
        System.out.println("Ben statik metodum");
    }
}
