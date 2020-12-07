package by.tms.examples.oop.collections;

import by.tms.examples.oop.inheritance.SmallBeresta;

import java.util.HashSet;
import java.util.Set;

public class SimpleSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Germany");
        set.add("Russia");
        set.add("Belarus");
        for (String item : set) {
            System.out.println(item);
        }
        System.out.println();
        set.add("USA");
        for (String item : set) {
            System.out.println(item);
        }
        System.out.println();
        set.add("England");
        for (String item : set) {
            System.out.println(item);
        }

        boolean result = set.add("Belarus");
        System.out.println("Adding Belarus one more time returned " + result);
        System.out.println();
        set.add(null);
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println();
        Set<SmallBeresta> berestas = new HashSet<>();
        berestas.add(new SmallBeresta());
        berestas.add(new SmallBeresta());
        SmallBeresta smallBeresta = new SmallBeresta();
        smallBeresta.burn();
        berestas.add(smallBeresta);
        System.out.println(berestas);
    }
}
