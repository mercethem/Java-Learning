import java.util.Scanner;

public class Exercises02_03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value for feet : ");
        double feet = keyboard.nextDouble();
        double a_feet = 0.305; //meter
        double meter = a_feet * feet;
        System.out.println(feet + " feet is " + meter + " meters ");
    }
}