public class ThreadIncrement implements Runnable {
    static Counter counter = new Counter();

    public static void main(String[] args) {
        activateIncThreads();
    }

    private static void activateIncThreads() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new ThreadIncrement());
            thread.start();
        }
        System.out.println(counter.getCount());
    }

    @Override
    public void run() {
        synchronized (counter) {
            while (counter.getCount() < 1000) {
                counter.increment();
            }
        }
    }
}
