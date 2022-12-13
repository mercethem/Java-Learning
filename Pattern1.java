//Draw pattern
/**
 * 1  2  3  4  5
 * 1  2  3  4  5
 * 1  2  3  4  5
 * 1  2  3  4  5
 * 1  2  3  4  5
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plase enter an integer for pattern of matrix : ");
        int number = keyboard.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%3d", j, "%3d");
            }
            System.out.println();

        }
    }
}

