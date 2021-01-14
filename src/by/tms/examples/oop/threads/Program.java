package by.tms.examples.oop.threads;

public class Program {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            new Thread(new CountThread(commonResource), "thread-" + i).start();
        }
    }

    static class CommonResource {
        int x = 0;

        synchronized void increment() {
            for (int i = 1; i < 5; i++) {
                System.out.printf("Thread: %s Counter: %s %n", Thread.currentThread().getName(), getX());
                x = getX() + 1;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }

        synchronized public int getX() { // synchronized keyword creates reentrant lock
            return x;
        }
    }

    static class CountThread implements Runnable {
        final CommonResource commonResource;

        CountThread(CommonResource commonResource) {
            this.commonResource = commonResource;
        }

        @Override
        public void run() {
            commonResource.increment();
        }
    }
}

