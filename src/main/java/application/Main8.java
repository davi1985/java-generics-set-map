package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main8 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");


//        System.out.println("set contains 'Notebook' ? " + set.contains("Notebook"));

        set.removeIf(item -> item.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }
    }
}
