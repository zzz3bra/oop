package by.tms.examples.oop.threads;

public class ExampleThread extends Thread {
    public ExampleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Thread %s started... %n", Thread.currentThread().getName());
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("Thread %s finished... %n", Thread.currentThread().getName());
    }
}
