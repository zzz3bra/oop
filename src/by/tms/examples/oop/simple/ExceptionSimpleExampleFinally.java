package by.tms.examples.oop.simple;

public class ExceptionSimpleExampleFinally {

    public static void main(String[] args) {
        int b = 0;

        b = getIntValue(b);

        try {

        } finally { // should have at least one catch or finally

        }

        System.out.println("Application Finished");
        System.out.println("Value of b is " + b);
    }

    private static int getIntValue(int b) {
        try {
            b = Integer.parseInt("100.0");
        } catch (NumberFormatException e) {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            //will this line be executed?
            System.out.println("I'm second catch block");
        } finally {
            return 2;
        }
    }
}
