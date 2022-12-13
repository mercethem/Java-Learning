import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        long number = keyboard.nextLong();
        long result;
        while (number > 0) {
            result = number % 10;
            number = (int) (number / 10);
            System.out.println(result);
        }
    }
}
