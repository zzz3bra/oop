package by.tms.examples.oop.simple;

public class StaticInitializer {
    public static final String HELLO;
    static {
        String temp = "temp"; // операции со временной переменной
        temp = temp + "temp2";
        HELLO = temp; // присвоение
    }
    public static String GREETING_FOR_CURRENT_USER;

    public static void method() {
        System.out.println("Method");
    }

    static {
        GREETING_FOR_CURRENT_USER = System.getProperty("user.name");//присвоим значение перемонной окружения в статическое поле
        if (GREETING_FOR_CURRENT_USER == null) {
            GREETING_FOR_CURRENT_USER = "";
        }
        System.out.println("Выполнен первый статический блок");
    }

    private static void methodPrivate() {
        System.out.println("Method private has been called");
    }

    static {
        methodPrivate();
        if (GREETING_FOR_CURRENT_USER.equals("z3vs")) {
            GREETING_FOR_CURRENT_USER = "Особенное приветствие";
        } else if (GREETING_FOR_CURRENT_USER.equals("")) {
            GREETING_FOR_CURRENT_USER = "Особенное приветствие для анонима";
        } else {
            GREETING_FOR_CURRENT_USER = "Приветствие для " + GREETING_FOR_CURRENT_USER;
        }
        System.out.println("Выполнен второй статический блок");
    }

    public static void main(String[] args) {
        System.out.println(GREETING_FOR_CURRENT_USER);
    }
}
