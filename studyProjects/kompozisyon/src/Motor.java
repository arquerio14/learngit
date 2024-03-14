public class Motor {

    private String isim;
    private int beygirGucu;

    public Motor(){
        isim = "Honda";
        beygirGucu = 135;
        System.out.println(isim+" İsimli "+beygirGucu+" Beygir gücünde motor oluşturuldu.");
    }

    public void calıstır(){
        System.out.println("Motor çalıştırıldı.");
    }
    public void stop(){
        System.out.println("Stop edildi.");
    }
}
