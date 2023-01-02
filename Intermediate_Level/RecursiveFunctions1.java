//About 0-->your number addition done using the recursive function
package Intermediate_Level;

import java.util.Scanner;

public class RecursiveFunctions1 {
    public static int addition(int n) {
        if (n == 1) return 1;
        return n + addition(n - 1);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(addition(number));

    }
}

