package by.tms.examples.oop.simple;

public class ExceptionSimpleExample {

    public static void main(String[] args) {

        int a = Integer.parseInt("200.0");

        try {
            int b = Integer.parseInt("100.0");
        } catch (NumberFormatException e) {
            NumberFormatException exception = new NumberFormatException("User input is invalid");
            exception.initCause(e);
            throw new RuntimeException("Sample", exception);
        }

        System.out.println("Application Finished");
    }
}
