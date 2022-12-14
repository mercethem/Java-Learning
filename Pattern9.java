//Draw pattern
import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int counter=1;
        for (int i = 1; i <= number+counter; i++,number--) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = number; 1 <=k ; k--) {
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
    }
}
