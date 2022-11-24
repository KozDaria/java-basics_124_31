import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(checkArray(array));
    }

    private static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива больший или равный 2");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Введите массив целых чисел указанного размера");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static boolean checkArray(int[] array) {
        for (int j : array) {
            return j == 3 || j == 1;
        }
        return false;
    }
}