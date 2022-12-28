import java.util.Scanner;

public class Exercises02_05 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate for calculate them : ");

        double subtotal = keyboard.nextDouble();
        double gratuityRate = keyboard.nextDouble();
        double gratuity = (subtotal * gratuityRate) / 100;
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    }
}