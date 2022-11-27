import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(array[0] == 3 || array[array.length - 1] == 3);
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
}