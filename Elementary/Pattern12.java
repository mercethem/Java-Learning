//Draw pattern

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for draw pattern : ");
        int number = keyboard.nextInt();
        int number2 = number - 1;
        int counter = 0;

        for (int i = 0; i <= number + counter; i++, number--) {
            for (int j = number; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.format("%01d ", 0);

            }
            counter++;
            System.out.println();
        }
        int i, j;

        for (i = number2; i >= 1; i--) {

            for (j = i; j <= number2; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.format("%01d ", 0);
            }
            System.out.println("");
        }
    }
}