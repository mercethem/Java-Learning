import java.util.Scanner;

public class IfSwap {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if ( number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        } /*This block's purpose, do you want to just positive integer then can use in this class.
            If you don't use that block then your answer can be negative integer*/


        System.out.println("What is answer ? " + number1 + " - " + number2 + " = ");
        Scanner input = new Scanner(System.in);
        int keyboard = input.nextInt();

        if (keyboard == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
