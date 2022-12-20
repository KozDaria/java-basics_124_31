public class ThreadName implements Runnable {
    private static Object object = new Object();

    public void run() {
        while (true) {
            synchronized (object) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        activateTenThreads();
    }

    private static void activateTenThreads() {
        Thread thread1 = new Thread(new ThreadName());
        thread1.start();
        Thread thread2 = new Thread(new ThreadName());
        thread2.start();
    }
}
