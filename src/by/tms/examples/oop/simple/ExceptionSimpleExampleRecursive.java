package by.tms.examples.oop.simple;

public class ExceptionSimpleExampleRecursive {
    static int COUNTER = 0;

    public static void main(String[] args) {
        if (COUNTER++ == Integer.MAX_VALUE) {
            System.out.println("Done");
            return;
        }
        try {
            System.out.println(COUNTER);
        } catch (Throwable e) {
            return;
//            e.printStackTrace();
        }
        main(args);

    }
}
