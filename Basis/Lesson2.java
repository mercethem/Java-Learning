import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();
        // keyboard = new Scanner(System.in);
        for (int i = array.length; i <= 0; i--) {
            //System.out.println((i+1)+ " . enter number ");
            // array [i] = keyboard.nextInt();
            array[i] = rand.nextInt(20);

            for (int j = 0; j <= array.length; j++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                } else {
                    continue;

                    // System.out.println(array[i]);
                }
            }
            System.out.println(java.util.Arrays.toString(array));
        }
    }
}