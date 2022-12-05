import java.util.*;

public class Game {
    static Map<User1, Integer> map = new HashMap<>();
    static int point = 0;


    public static void main(String[] args) {
        initialize();
        String name = inputName();
        printPointByName(name);
    }

    private static void printPointByName(String name) {
        for (Map.Entry<User1, Integer> item : map.entrySet()) {
            if (Objects.equals(item.getKey().getName(), name)) {
                point = item.getValue();
            }
        }
        System.out.println("User " + name + " has " + point + " points");
    }

    private static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print user's name");
        return scanner.nextLine();
    }

    private static void initialize() {
        User1 user1 = new User1("David");
        User1 user2 = new User1("Jane");
        User1 user3 = new User1("Joni");
        User1 user4 = new User1("Sam");
        User1 user5 = new User1("Fred");
        map.put(user1, 123);
        map.put(user2, 45);
        map.put(user3, 290);
        map.put(user4, 10);
        map.put(user5, 55);
    }
}
