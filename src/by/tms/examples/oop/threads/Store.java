package by.tms.examples.oop.threads;

public class Store {
    private int product = 0;

    public synchronized void get() { // synchronized - capture monitor of Class Object
        while (product == 0) {
            try {
                wait(); // transfer current thread to waiting state and free monitor
            } catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Покупатель купил один товар");
        System.out.println("Товаров осталось " + product);
        notify(); // wakes any thread waiting on the monitor
    }

    public synchronized void put() { // synchronized - capture monitor of Class Object
        while (product >= 3) {
            try {
                wait(); // transfer current thread to waiting state and free monitor
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил один товар");
        System.out.println("Товаров осталось " + product);
        notify(); // wakes any thread waiting on the monitor
    }
}
