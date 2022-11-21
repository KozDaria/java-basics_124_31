public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("black");
        Car audi = new Car("pink", 1650);
        Car nissan = new Car();
        bmw.setName("X5");
        bmw.setWeight(2135);
        audi.setName("A3");
        nissan.setColor("white");
        System.out.println(nissan.toString());
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
    }
}