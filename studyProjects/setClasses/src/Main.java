import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("f");
        hashSet.add("a");
        hashSet.add("1");
        hashSet.add("4");
        hashSet.add("a");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("c");
        linkedHashSet.add("f");
        linkedHashSet.add("a");
        linkedHashSet.add("1");
        linkedHashSet.add("4");
        linkedHashSet.add("a");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("f");
        treeSet.add("a");
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("a");
        System.out.println(treeSet);
    }
}