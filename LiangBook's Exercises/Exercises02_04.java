import java.util.Scanner;

public class Exercises02_04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number in pounds for calculate kilograms: ");
        double pound = keyboard.nextDouble();
        double onePound = 0.454; //kilogram
        double kilogram = pound * onePound;
        System.out.println(pound + " pounds is " + kilogram + " kilograms ");

    }
}