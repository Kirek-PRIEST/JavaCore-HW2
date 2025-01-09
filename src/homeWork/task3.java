package homeWork;

public class task3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 8, 5, 6, 0, 8, 0, 0};

        System.out.println(twoZeros(arr));
    }

    public static boolean twoZeros(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 0 && array[i+1] == 0){
                return true;
            }
        }
        return false;
    }
}
