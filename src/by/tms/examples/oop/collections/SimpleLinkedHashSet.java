package by.tms.examples.oop.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SimpleLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        System.out.println("HashSet:");
        set1.add("Germany");
        set1.add("Russia");
        set1.add("Belarus");
        for (String item : set1) {
            System.out.println(item);
        }
        System.out.println("--------------------");
        System.out.println("LinkedHashSet:");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Germany");
        set2.add("Russia");
        set2.add("Belarus");
        for (String item : set2) {
            System.out.println(item);
        }
    }
}
