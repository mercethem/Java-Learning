//Fibonacci
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        long number = keyboard.nextLong();
        long number1 = 1;
        long number2 = 1;
        long number3;
        long temp1;
        long temp2;
        for (long i = 0; i < number; i++) {
            number3 = number1 + number2;
            temp1 = number2;
            number2 = number3;
            number3 = temp1 ;

            temp2 = number1;
            number1=number2;
            number2=temp2;
            System.out.print(" "+ number3);

        }
    }
}
