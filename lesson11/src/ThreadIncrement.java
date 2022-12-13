public class ThreadIncrement implements Runnable {
    static Counter counter = new Counter();

    public static void main(String[] args) {
        activateIncThreads();
    }

    private static void activateIncThreads() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(counter.getCount());
    }

    @Override
    public void run() {
    }
}
