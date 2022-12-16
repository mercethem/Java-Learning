//Sorting your array
import java.util.*;

public class ToSortingYourArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+ " . enter number ");
            array [i] = keyboard.nextInt();
            //array[i] = rand.nextInt(101);
        }
        System.out.println(java.util.Arrays.toString(array));
        java.util.Arrays.sort(array);
        System.out.println();
        System.out.println(java.util.Arrays.toString(array));

    }
}
