import java.util.*;

public class Duplicates {
    static List<String> list1 = new ArrayList<>(Arrays.asList("11", "12", "11", "12"));

    public static void printValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество знаков");
        int n = scanner.nextInt();
        System.out.println("Введите n строк");
        for (int i = 0; i < n; i++) {
            list1.add(scanner.next());
        }
    }

    public static Set<String> removeDuplicate(List<String> list1) {
        return new HashSet<>(list1);
    }

    public static void main(String[] args) {
        printValue();
        System.out.println(list1);
        System.out.println(removeDuplicate(list1));
    }
}
