public class Client extends Human {
    String nameOfBank;

    public Client(String name, String surname, String nameOfBank) {
        super(name, surname);
        this.nameOfBank = nameOfBank;
    }

    public void print() {
        System.out.println(this.nameOfBank + " " + super.getName() + " " + super.getSurname());
    }
}
