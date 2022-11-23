public class task4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 2, 5};
        int origin = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count == array.length - 1 && origin > 0) {
                break;
            }
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] != array[j]) {
                        origin = array[i];
                        count++;
                    } else {
                        origin = -1;
                        count = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(origin > 0 ? "Уникальное число: " + origin : "В массиве нет уникальных чисел");
    }

}