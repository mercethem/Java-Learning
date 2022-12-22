//Draw pattern

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plase enter an integer for pattern of matrix : ");
        int number = keyboard.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.format("%02d ", j + number * (i - 1), " %2d ");
            }
            System.out.println();
        }
    }
}
