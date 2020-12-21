package by.tms.examples.oop.collections;

import java.util.Comparator;

public class LastLetterComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String o1reversed = new StringBuilder(o1).reverse().toString();
        String o2reversed = new StringBuilder(o2).reverse().toString();
        return o1reversed.compareTo(o2reversed);
    }
}
