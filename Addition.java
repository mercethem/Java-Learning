import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() %10);
        int number2 = (int) (System.currentTimeMillis() / 7 %10);

        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + total + " is " + (number1 + number2 == total));
    }
}
