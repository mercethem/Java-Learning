//Sorting an array
import java.util.Random;

public class ArrayToSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i] = rand.nextInt(20);
        }
        System.out.println(java.util.Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - 1); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}