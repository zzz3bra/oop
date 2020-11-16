package by.tms.examples.oop.simple;

public class MathHelperExample {

    public static void main(String[] args) {
        int sumOfTwoElements = MathHelper.Ints.sum(2, 2);
        System.out.println(sumOfTwoElements);

        int sumOfOneElement = MathHelper.Ints.sum(5);
        System.out.println(sumOfOneElement);

        long[] numbers = {3, 3, 3};
        long sumOfArrayElements = MathHelper.Longs.sum(numbers);
        System.out.println(sumOfArrayElements);

        System.out.println(String.join(" ", "пишу", "через", "пробел"));
    }

}
