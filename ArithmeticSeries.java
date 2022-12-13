//Arithmetic series

import java.util.Scanner;

public class ArithmeticSeries {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an (positive)integer : ");
        int start = keyboard.nextInt();
        int finish = keyboard.nextInt();
        int arithmetic = keyboard.nextInt();

        for (int i = 0; i < (int) (finish / arithmetic); i++) {
            System.out.print(" " + start);
            start = start + arithmetic;
        }
    }
}
