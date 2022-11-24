import java.util.Scanner;

public class InputTrial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first enter: ");
        double number1 = input.nextDouble();

        System.out.println("Please enter your second enter: ");
        double number2 = input.nextDouble();

        System.out.println("This is your numbers total: ");
        double total = number1 + number2;

        System.out.println(total);
    }
}
