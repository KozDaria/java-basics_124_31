public class ThreadIncrement implements Runnable {
    static Counter counter = new Counter();

    public static void main(String[] args) {
        activateIncThreads();
    }

    private static void activateIncThreads() {
        Runnable task = ThreadIncrement::increment;
        for (int i = 0; i < 100; i++) {
            new Thread(task).start();
        }
    }

    private static void increment() {
        synchronized (counter) {
            for (int j = 0; j < 1000; j++) {
                counter.increment();
            }
            System.out.println(counter.getCount());
        }
    }

    @Override
    public void run() {
    }
}
