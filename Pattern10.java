//Draw pattern
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int counter=0;

        for (int i = 1; i <= number+counter; i++,number--) {
            for (int j = number; j>=0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i ; k++) {
                System.out.printf("%d", counter);

            }
            counter++;
            System.out.println();
        }
    }
}
