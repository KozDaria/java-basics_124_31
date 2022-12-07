import java.util.*;

public class Game {
    static Map<UserOfGame, Integer> map = new HashMap<>();
    static int point = 0;


    public static void main(String[] args) {
        initialize();
        String name = inputName();
        printPointByName(name);
    }

    private static void printPointByName(String name) {
        for (Map.Entry<UserOfGame, Integer> item : map.entrySet()) {
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
        UserOfGame user1 = new UserOfGame("David");
        UserOfGame user2 = new UserOfGame("Jane");
        UserOfGame user3 = new UserOfGame("Joni");
        UserOfGame user4 = new UserOfGame("Sam");
        UserOfGame user5 = new UserOfGame("Fred");
        map.put(user1, 123);
        map.put(user2, 45);
        map.put(user3, 290);
        map.put(user4, 10);
        map.put(user5, 55);
    }
}
