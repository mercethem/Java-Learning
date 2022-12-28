import java.util.Scanner;

public class Exercises02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a celsius degree : ");
        double celsius = input.nextDouble();
        double fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.println(celsius + " is " + fahrenheit + " fahrenheit ");

    }
}