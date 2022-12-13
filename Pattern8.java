//Draw pattern
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int counter=1;
        for (int i = 1; i <= number+counter; i++,number--) {
            for (int j = number; 1 <=j ; j--) {
                System.out.printf("%02d ",counter);
                counter++;
            }
            System.out.println();
        }
    }
}
