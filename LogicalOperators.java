import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("Your number divide by 2 and 3");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("Your number divide by 2 or 3");
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println("Your number divide by only 2 or only 3");
        }

    }
}
