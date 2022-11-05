import java.util.Scanner;

public class ConditionalExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number for calculate square ");

        int number1 = input.nextInt();
        int number2 = number1 > 0 ? number1 * 1 : number1 * -1;
        int total = number1 * number1;
        System.out.println(total);

    }
}
