import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println("Result: " + Arrays.toString(array));
    }

    private static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}