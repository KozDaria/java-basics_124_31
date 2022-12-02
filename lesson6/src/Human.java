public abstract class Human {
    protected String name;
    protected String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    abstract void print();
}
