public class Truck extends Car{
    int wheels;
    int maxWeight;

    public void newWheels(int wheels) {
        this.wheels = wheels;
        System.out.println(wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }


}
