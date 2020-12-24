package by.tms.examples.oop.functional;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (Integer x) -> x >= 0;
        Predicate<Integer> isNegative = isPositive.negate();

        System.out.println("Is positive 9: " + isPositive.test(9));
        System.out.println("Is positive -9: " + isPositive.test(-9));

        System.out.println("Is negative 42: " + isNegative.test(42));
        System.out.println("Is negative -42: " + isNegative.test(-42));

        Predicate<Integer> integerPredicate = isNegative.and(x -> x < -100);
    }
}
