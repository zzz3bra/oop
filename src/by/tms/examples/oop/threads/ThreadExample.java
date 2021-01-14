package by.tms.examples.oop.threads;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        ExampleThread exampleThread = new ExampleThread("thread-example");
        System.out.println(exampleThread.getState());
        exampleThread.start();
        System.out.println(exampleThread.getState());
        try {
            exampleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(exampleThread.getState());
        System.out.println("Main thread finished...");
    }
}
