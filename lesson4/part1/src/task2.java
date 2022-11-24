public class task2 {
    public static void main(String[] args) {
        String dividedBy3And5 = "Делится на 3 и на 5:";
        String dividedBy3 = "Делится на 3:";
        String dividedBy5 = "Делится на 5:";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                dividedBy3And5 = dividedBy3And5 + " " + i;
            } else if (i % 3 == 0) {
                dividedBy3 = dividedBy3 + " " + i;
            } else if (i % 5 == 0) {
                dividedBy5 = dividedBy5 + " " + i;
            }
        }
        System.out.println(dividedBy3);
        System.out.println(dividedBy5);
        System.out.println(dividedBy3And5);
    }
}