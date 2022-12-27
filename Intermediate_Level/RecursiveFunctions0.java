// This is about fibonacci done using the recursive function
package Intermediate_Level;

import java.util.Scanner;

public class RecursiveFunctions0 {
    public static int fibonacci(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer want to learn addition with fibonacci :");
        int number = keyboard.nextInt();
        for (int i = 0; i <number ; i++) {
            System.out.printf("%s,",fibonacci(i));
        }


        System.out.println(fibonacci(number));
    }
}
