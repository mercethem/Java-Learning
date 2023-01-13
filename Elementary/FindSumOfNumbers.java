//Finding sum of numbers

import java.util.Scanner;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        int number = keyboard.nextInt();
        long sum = 0;

        for (int i = 0; i <= number; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
