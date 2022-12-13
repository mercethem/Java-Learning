//Multiplication Table for your number
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer number for multiplication table : ");
        int number = keyboard.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " X " + i + " = " + i * number);

        }
    }
}
