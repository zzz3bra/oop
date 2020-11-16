package by.tms.examples.oop.inheritance;

public class ChattyDog extends Dog {

    // overloading
    public void bark(int times) {
        System.out.println("Щас как облаю");
        for (int i = 1; i <= times; i++) {
            bark();
        }
        System.out.println("Осип...");
    }

    // overloading
    public String bark(long times) { // кроме возвращаемго значения изменены аргументы
        System.out.println("Щас как облаю");
        for (int i = 1; i <= times; i++) {
            bark();
        }
        System.out.println("Осип...");
        return "";
    }

}
