package Lesson.lec2.lec1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int num = 2;
        System.out.println("Массив до сдвига: \n" + Arrays.toString(arr));
        for (int i = 0; i < num; i++) {
            int temp = arr[arr.length - 1];
            for (int j = 0; j < arr.length; j++) {
                int temp2 = arr[j];
                arr[j] = temp;
                temp = temp2;
            }
        }
        System.out.println("Массив после сдвига:\n" + Arrays.toString(arr));
    }
}
