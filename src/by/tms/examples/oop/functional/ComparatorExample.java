package by.tms.examples.oop.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>(List.of(new Tree(), new Tree(), new Tree(), new Tree()));
        forest.forEach(it -> System.out.println(it));

        System.out.println();

        forest.sort((o1, o2) -> o1.age - o2.age);
        forest.forEach(System.out::println);

        System.out.println();

        Comparator<Tree> c = Comparator.comparingInt(o -> o.age); // won't work if written in one line
        forest.sort(c.reversed());
        forest.forEach(System.out::println);

        System.out.println();

        forest.sort(Comparator.comparingInt(o -> new Random().nextInt(2)));
        forest.forEach(System.out::println);
    }

    private static class Tree {
        int age;

        public Tree(int i) {
            age = i;
        }

        public Tree() {
            age = new Random().nextInt(100);
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", ComparatorExample.Tree.class.getSimpleName() + "[", "]")
                    .add("age=" + age)
                    .toString();
        }
    }
}
