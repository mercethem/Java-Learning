//Draw pattern
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int counter=1;
        for (int i = 1; i <= number+counter; i++,number--) {
            for (int j = number; 1 <=j ; j--) {
                System.out.print(" * ");
                counter++;
            }
            System.out.println();
        }
    }
}
