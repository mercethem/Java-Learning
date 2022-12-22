import java.util.Scanner;

public class ExponentialNumbers2 {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        System.out.println(Math.pow(number1, number2));
    }
}    