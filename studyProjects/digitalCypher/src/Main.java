public class Main {
    public static void main(String[] args) {
        String message="whowrotethesetestcases",uzunluk;
        Integer key=123921;
        uzunluk = key.toString();
        int keys[] = new int[uzunluk.length()];
        int j=0,m=0,k=1,kalan,s=0;
        int dizi[] = new int[message.length()];
        for (int i=0;i < message.length();i++){
            if (message.charAt(i) == 'a'){
                dizi[i]=1;
            }else if (message.charAt(i) == 'b'){
                dizi[i]=2;
            }else if (message.charAt(i) == 'c'){
                dizi[i]=3;
            }else if (message.charAt(i) == 'd'){
                dizi[i]=4;
            }else if (message.charAt(i) == 'e'){
                dizi[i]=5;
            }else if (message.charAt(i) == 'f'){
                dizi[i]=6;
            }else if (message.charAt(i) == 'g'){
                dizi[i]=7;
            }else if (message.charAt(i) == 'h'){
                dizi[i]=8;
            }else if (message.charAt(i) == 'i'){
                dizi[i]=9;
            }else if (message.charAt(i) == 'j'){
                dizi[i]=10;
            }else if (message.charAt(i) == 'k'){
                dizi[i]=11;
            }else if (message.charAt(i) == 'l'){
                dizi[i]=12;
            }else if (message.charAt(i) == 'm'){
                dizi[i]=13;
            }else if (message.charAt(i) == 'n'){
                dizi[i]=14;
            }else if (message.charAt(i) == 'o'){
                dizi[i]=15;
            }else if (message.charAt(i) == 'p'){
                dizi[i]=16;
            }else if (message.charAt(i) == 'q'){
                dizi[i]=17;
            }else if (message.charAt(i) == 'r'){
                dizi[i]=18;
            }else if (message.charAt(i) == 's'){
                dizi[i]=19;
            }else if (message.charAt(i) == 't'){
                dizi[i]=20;
            }else if (message.charAt(i) == 'u'){
                dizi[i]=21;
            }else if (message.charAt(i) == 'v'){
                dizi[i]=22;
            }else if (message.charAt(i) == 'w'){
                dizi[i]=23;
            }else if (message.charAt(i) == 'x'){
                dizi[i]=24;
            }else if (message.charAt(i) == 'y'){
                dizi[i]=25;
            }else if (message.charAt(i) == 'z'){
                dizi[i]=26;
            }
        }
        for (int i=1; i < uzunluk.length();i++){
            k = k*10;
        }
        for (int i=k;i > 0;i= i/10 ){
                keys[s] = key / i;
                key = key % i;
                s++;
        }
        for (int i=0,ı=0;i < message.length();i++,ı++){
            if (ı == uzunluk.length()){
                ı=0;
            }
            dizi[i] = dizi[i] + keys[ı];
        }
        //for (int gecici : dizi){
          //  System.out.println(gecici);
        //}
        for (int gecici:keys){
            System.out.println(gecici);
        }
    }
}