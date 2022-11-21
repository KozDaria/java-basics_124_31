public class Main {
    public static void main(String[] args) {
        House newHouse = new House();
        House oldHouse = new House();
        newHouse.setName("LSR");
        newHouse.setYear(2002);
        newHouse.setNumberOfFloors(12);
        oldHouse.setName("USSR");
        oldHouse.setYear(1952);
        oldHouse.setNumberOfFloors(5);
        System.out.println(newHouse.toString());
        System.out.println(oldHouse.toString());
    }
}