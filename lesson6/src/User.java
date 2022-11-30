public class User extends Person {

    public User(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return "Very_cute_" + super.getName();
    }
}
