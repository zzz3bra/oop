package by.tms.examples.oop.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamSkipLimitExample {
    public static void main(String[] args) {
        Integer[] hardcodedNumbers = {-1, -1, -1, -1, -1};
        Random random = new Random();
        Stream.concat(Stream.of(hardcodedNumbers), Stream.generate(() -> random.nextInt(101)))
                .skip(4)
                .limit(10)
                .takeWhile(it -> it < 100) // aborts the stream if condition is not satisfied
                .sorted()
                .forEach(System.out::println);
    }
}
