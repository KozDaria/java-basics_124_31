import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 7, 2};
        int k = array[0];
        System.out.println("Array1: " + Arrays.toString(array));
        array[0] = array[array.length - 1];
        array[array.length - 1] = k;
        System.out.println("Array2: " + Arrays.toString(array));
    }

}