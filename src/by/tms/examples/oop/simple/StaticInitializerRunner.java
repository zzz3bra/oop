package by.tms.examples.oop.simple;

public class StaticInitializerRunner {

    public static void main(String[] args) {
        System.out.println("Начало работы программы");
        StaticInitializer.method();
        StaticInitializer.method();
        System.out.println(StaticInitializer.GREETING_FOR_CURRENT_USER);

    }

}
