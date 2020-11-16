package by.tms.examples.oop.simple;

public class ExampleStaticClass {
    private static String name = "Имя";

    private static void print(String text) {
        System.out.println(text);
    }

    /**
     * вложенный статический клаас - не имеет ссылкок на внешний класс,
     * доступ только к его static полям/методам (даже private)
     */
    static class InnerStaticMath {
        int sum(int a, int b) {
            print(name);//без указания имени класса
            return a + b;
        }
    }

    static class InnerStaticString {
        String concat(String first, String second) {
            ExampleStaticClass.print(ExampleStaticClass.name);
            return first + second;
        }
    }

}
