package by.tms.examples.oop.simple;

public class InstanceInitializer {

    public static void staticMethod() {
        System.out.println("В методе класса(статическом)");
    }

    public void instanceMethod() {
        System.out.println("В методе экземпляра");
    }

    public static final String[] CONST;
    static {
        String str = System.getProperty("user.name");
        //логика по работе с именем
        CONST = new String[]{str.replace("3", "4")};
        System.out.println("Первый статический блок инициализации");
    }

    {
        System.out.println("Первый блок инициализации");
    }

    static {
        System.out.println("Второй статический блок инициализации");
    }

    public InstanceInitializer() {
//        System.out.println("Конструктор"); - не работает, требуется использовать инициализатор экземпляра
        super();
        System.out.println("Конструктор");
    }

    static {
        System.out.println("Третий статический блок инициализации");
    }

    {
        System.out.println("Второй блок инициализации");
    }

    static {
        System.out.println("Четвертый статический блок инициализации");
    }

}
