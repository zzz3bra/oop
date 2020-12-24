package by.tms.examples.oop.functional;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DeferredExecutionExample {
    public static void main(String[] args) {
        int a = 1;
        BinaryOperator<Integer> sum = (Integer x, Integer y) -> {
            if (a > 0 ) { // значение переменной a захватывается при создании лямбды
                System.out.println("Больше 0");
            }
            System.out.println("Выполнение sum");
            return x + y;
        };
//        a = 2; // переопределение - сломает effectively final требование

        UnaryOperator<Integer> doubleNumber = x -> {
            System.out.println("Выполнение doubleNumber");
            return x * 2;
        };

        BiFunction<Integer, Integer, Integer> functionSumAndThenDoubleNumbers = sum.andThen(doubleNumber);

        if (new Random().nextBoolean()) {
            functionSumAndThenDoubleNumbers.apply(1, 2);
        }
        System.out.println("Конец работы");
    }
}
