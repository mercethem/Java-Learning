import java.util.Scanner;

//Cost of driving
public class Exercises02_23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter driving distance, miles per gallon, price per gallon : ");

        double drivingDistance = keyboard.nextDouble();
        double milesPerGallon = keyboard.nextDouble();
        double pricePerGallon = keyboard.nextDouble();
        double result;
        result = drivingDistance/milesPerGallon*pricePerGallon;
        System.out.println(result);
    }
}