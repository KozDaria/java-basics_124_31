public class ThreadPrint extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        activateTenThreads();
    }

    private static void activateTenThreads() {
        for (int i = 0; i < 10; i++) {
            ThreadPrint thread = new ThreadPrint();
            System.out.println(thread.getName() + " State " + thread.getState());
            thread.start();
            System.out.println(thread.getName() + " State " + thread.getState());
        }
    }
}
