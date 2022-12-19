//Draw pattern
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int counter=1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf("* ");
                counter++;
            }
            System.out.println();
        }



    }
}
