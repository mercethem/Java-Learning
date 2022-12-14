//Draw pattern
import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int counter=0;
        int counter2=number;

        for (int i = 1; i <= number+counter; i++,number--) {
            for (int j = number; j>=0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i ; k++) {
                System.out.format("%01d ", 0);

            }
            counter++;
            System.out.println();
        }


        for (long l = 1; l <= number2+counter2; l++,number2--) {
            for (int n =  number2 ; n>=1 ; n--) {
                System.out.format("%1d ", 0);

            }
            for (int m = 1; m<=number2; m++) {
                System.out.print(" ");
            }

            counter2++;
            System.out.println();
        }
    }
}
//This pattern not complete, i will finish this later!
