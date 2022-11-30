public class User extends Person {

    private Person person;
    private Person person1;

    public User(String name) {
        super.setName(name);
    }

    public User() {
    }

    @Override
    public String getName() {
        System.out.println("Введите имя");
        return scanner.nextLine();
    }
}
