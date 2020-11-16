package by.tms.examples.oop.simple;

import java.util.Arrays;
import java.util.Random;

public class ExamplePassingArgumentsAndReturningNewObjects {
    public static void main(String[] args) {
        int[][] arrayWithRandomNumbers = calculateSomethingWithNewArray();

        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            System.out.println(Arrays.toString(arrayWithRandomNumbers[i]));
        }

        int result = calculateSum(arrayWithRandomNumbers);

        System.out.println("Sum is " + result);
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] internal = array[i];
            for (int j = 0; j < internal.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int[][] calculateSomethingWithNewArray() {
        Random random = new Random();
        int[][] result = new int[3][3];
        for (int i = 0; i < result.length; i++) {
            int[] internal = result[i];
            for (int j = 0; j < internal.length; j++) {
                internal[j] = random.nextInt(101);
            }
        }
        return result;
    }
}
