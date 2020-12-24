package by.tms.examples.oop.functional;

import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream()
                .filter(it -> it % 2 == 0)
                .map(it -> it * 2L)
                .mapToLong(aLong -> aLong)
                .forEach(System.out::println);
    }
}
