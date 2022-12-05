import java.util.*;

public class Random {
    static java.util.Random random = new java.util.Random();
    static ArrayList<Integer> list1 = new ArrayList<>();
    static LinkedList<Integer> list2 = new LinkedList<>();

    public static void addValue(List<Integer> list, String type) {
        long startTime = System.currentTimeMillis();
        int n = 1_000_000;
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(n));
        }
        System.out.println("Runtime for " + type + "is " + (System.currentTimeMillis() - startTime));
    }

    public static void main(String[] args) {
        addValue(list1, "ArrayList ");
        addValue(list2, "LinkedList ");
    }
}
