public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1-2");
        Worker worker1 = new Worker("Helena", "Davids", "JPMorgan");
        worker1.addYear(1980);

        System.out.println(System.lineSeparator());
        System.out.println("Task 3");
        Truck tr = new Truck(100, "audi", 'A', 234.12f, 4, 400);
        tr.outPut();

        System.out.println(System.lineSeparator());
        System.out.println("Task 4");
        SaveSecretNumber saver = new SaveSecretNumber();
        saver.getSecretNumber();

        System.out.println(System.lineSeparator());
        System.out.println("Task 5");
        User user = new User();
        System.out.println("User name is " + user.getInfo());
    }
}