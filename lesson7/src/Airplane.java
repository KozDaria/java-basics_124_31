public class Airplane {

    public static void Initialize(int weight1, int weight2) {
        class Wing {

            int weight;

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public void printWeight() {
                System.out.println("Weight = " + this.weight);
            }
        }

        Wing wing = new Wing();
        wing.setWeight(weight1);
        wing.printWeight();
        Wing wing2 = new Wing();
        wing2.setWeight(weight2);
        wing2.printWeight();
    }

    public static void main(String[] args) {
        Initialize(1200, 1500);

    }
}

