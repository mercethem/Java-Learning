import java.util.Scanner;

public class Exercises02_06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a integer between 0 and 1000 : ");
        int number = keyboard.nextInt();
        int digits1 = number % 10;
        int digits10 = ((number % 100) / 10);
        int digits100 = number / 100;
        int total = digits1 + digits10 + digits100;
        System.out.println("The sum of digits is " + total);

    }
}