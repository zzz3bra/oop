package by.tms.examples.oop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 0, -8, 22};
        IntStream stream = IntStream.of(array);
        IntStream intStream = stream.filter(number -> number > 0); // lazy evaluation - will be run only after terminal operation
        long count = intStream.count();// after terminal operation `stream` and `intStream` are consumed and unavailable anymore
        System.out.println("count of integers greater than zero: " + count);

        long counter = Arrays.stream(array).filter(i -> i < 0).count(); // generic/best practice syntax for stream creation
        System.out.println("count of integers less than zero: " + counter);

        List<Integer> integers = List.of(2, 3, 4, 5, 0, -8, 22);
        Stream<Integer> integerStream = integers.stream();
        long countOfNegatives = integerStream.filter(i -> i < 0).count();
        System.out.println("count of integers less than zero using list: " + countOfNegatives);

        Arrays.stream(array).forEach(System.out::println);
    }
}
