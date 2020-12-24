package by.tms.examples.oop.functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorsExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (Integer x, Integer y) -> x + y;
        BinaryOperator<Integer> sumAsMethodReference = Integer::sum;

        System.out.println(sum.apply(20, 20));

        System.out.println();

        UnaryOperator<Integer> doubleNumber = x -> x * 2;
        BiFunction<Integer, Integer, Integer> sumAndThenDouble = sum.andThen(doubleNumber);
        System.out.println(sumAndThenDouble.apply(20, 10));

        IntBinaryOperator sumPrimitive = (int x, int y) -> x + y;
    }
}
