import java.util.ArrayList;

public class MyStack {

    private ArrayList<Object> liste;

    public MyStack(){
        liste = new ArrayList<>();
        System.out.println("2");;
    }

    static{
        System.out.println("1");
    }


    public int kacElemanVar(){
        return liste.size();
    }
    public boolean bosMu(){
        return liste.isEmpty();
    }
    public Object elemanGoster(){
        return liste.get(kacElemanVar() - 1);
    }
    public Object pop(){
        Object geriyeDondurulecekEleman = liste.get(kacElemanVar() - 1);
        liste.remove(kacElemanVar() - 1);
        return geriyeDondurulecekEleman;
    }
    public void push(Object eklenecekEleman){
        liste.add(eklenecekEleman);
    }
    public void yazdir(){
        System.out.println("********************YIĞIN İÇERİĞİ********************");
        for (int i=0;i<liste.size();i++){
            System.out.println(i+". indekste : "+liste.get(i));
        }
    }

}
