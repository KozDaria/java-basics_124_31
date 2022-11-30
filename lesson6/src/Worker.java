public class Worker extends Human implements IdCard {
    String nameOfBank;

    public Worker(String name, String surname, String nameOfBank) {
        super(name, surname);
        this.nameOfBank = nameOfBank;
    }

    public void print() {
        System.out.println(super.getName() + " " + super.getSurname() + " " + this.nameOfBank);
    }


    @Override
    public void addYear(int year) {
        print();
        System.out.print(year);
    }
}
