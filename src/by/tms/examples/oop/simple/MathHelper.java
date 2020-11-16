package by.tms.examples.oop.simple;

public class MathHelper {

    public static class Ints {

        public static int sum(int... numbers) {
            int result = 0;
            for (int index = 0; index < numbers.length; index++) {
                result += numbers[index];
            }
            return result;
        }

    }

    public static class Longs {

        public static long sum(long... numbers) {
            long result = 0;
            for (int index = 0; index < numbers.length; index++) {
                result += numbers[index];
            }
            return result;
        }

    }
}
