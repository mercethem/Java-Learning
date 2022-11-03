import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.println("What is answer ? " + number1 + " + " + number2 + " = ");
        Scanner input = new Scanner(System.in);
        int keyboard = input.nextInt();

        if (keyboard == number1 + number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
