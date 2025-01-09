package homeWork;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println("countEvens(" + Arrays.toString(arr) + ") → " + evens(arr));
    }

    public static int evens(int[] array) {
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                quantity += 1;
            }
        }
        return quantity;
    }
}
