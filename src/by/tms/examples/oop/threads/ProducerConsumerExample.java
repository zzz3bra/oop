package by.tms.examples.oop.threads;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(consumer).start();
        new Thread(producer).start();
    }

    static class Producer implements Runnable {
        private Store store;

        Producer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                store.put();
            }
        }
    }

    static class Consumer implements Runnable {
        private Store store;

        Consumer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                store.get();
            }
        }
    }
}
