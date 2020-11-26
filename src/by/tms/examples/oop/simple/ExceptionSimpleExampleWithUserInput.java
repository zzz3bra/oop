package by.tms.examples.oop.simple;

import java.util.Scanner;

public class ExceptionSimpleExampleWithUserInput {

    public static void main(String[] args) {
        System.out.println("Please enter a number:");

        int number = 0;
        try {
            number = getNumber();
        } catch (Exception e) {// bad practice - too wide
            System.out.println("An exception happened!");
            e.printStackTrace();
        }

        int result = 0;
        try {
            result = 100 / number;
            System.out.println("Number from input is " + number);
            System.out.println("100/" + number + "=" + result);
        } catch (ArithmeticException e) {
            System.out.println("Number from input is " + number + " which caused arithmetic exception:" + e .getMessage());
        }
    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            String line = "";
            try {
                line = scanner.nextLine();
                return Integer.parseInt(line);
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Your input is not a valid integer: " + line);
                e.printStackTrace();
            }
        } while (true);
    }
}
