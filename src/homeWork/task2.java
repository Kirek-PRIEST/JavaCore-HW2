package homeWork;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        System.out.println("Результат разницы между max и min массива: " + subtractionMaxMin(arr));
    }
    private static int subtractionMaxMin (int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max-min;
    }
}
