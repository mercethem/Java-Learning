import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fahrenheit : ");
        double fahrenheit = input.nextDouble();
        double calculate = (fahrenheit - 32) * (5.0 / 9);

        System.out.println(fahrenheit + " Fahrenheit is " + calculate + " celcius degree.");
    }
}
