import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> yigin = new Stack<>();

        yigin.add("Muhammed");
        yigin.add("Mustafa");
        yigin.add("Omar");
        System.out.println(yigin);
        System.out.println(yigin.pop());
        System.out.println(yigin);
        System.out.println(yigin.peek());
        System.out.println(yigin);
        System.out.println(yigin.push("Can"));
        System.out.println(yigin);
        System.out.println(yigin.search("Mustafa"));
        System.out.println(yigin.isEmpty());

    }
}