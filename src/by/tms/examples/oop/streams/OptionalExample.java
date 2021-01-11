package by.tms.examples.oop.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class OptionalExample {
    private static Random RANDOM = new Random();

    public static void main(String[] args) {
        Optional<Object> emptyOptional = Optional.ofNullable("some value");

        if (emptyOptional.isEmpty()) {
            System.out.println("Optional is empty");
        }

        if (emptyOptional.isPresent()) {
            System.out.println("Optional has value");
        }

        Object result = emptyOptional.orElse("Default Value");

        System.out.println(result);

        OptionalDouble averageOneAndThree = average(1, 3);
        averageOneAndThree.orElse(RANDOM.nextDouble());// always executed because JVM need argument value to call `orElse` method - bad practice
        System.out.println(averageOneAndThree.orElseGet(() -> RANDOM.nextDouble()));// lazy execution - best practice

        OptionalDouble averageWithoutValues = average(-1, 8);
        System.out.println(averageWithoutValues.orElseThrow(() -> {
            System.out.println("Preparing exception");
            return new RuntimeException("At least one positive number expected!");
        }));
    }

    private static OptionalDouble average(int... numbers) {
        return IntStream.of(numbers).filter(i -> i > 0).average();
    }
}
