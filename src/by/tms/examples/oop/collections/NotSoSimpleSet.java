package by.tms.examples.oop.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NotSoSimpleSet {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.reverseOrder();
        Comparator<String> lastLetterComparator = new LastLetterComparator();
        Set<String> set = new TreeSet<>(lastLetterComparator);
        set.add("Germany");
        set.add("Russia");
        set.add("Belarus");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
