import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива больший или равный 2");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Введите массив целых чисел указанного размера");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(checkArray(array));
    }

    private static String checkArray(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                return "Please, try again";
            }
        }
        return "OK";
    }
}