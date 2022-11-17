
import java.util.Scanner;

public class AverageCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three number for avarage calculation: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        /*Double is not true way (My search said) for avarage because 
        if you use for this at banks that is problem
        for after dot line! I will learn later on my way*/

        double avarage = (number1 + number2 + number3) / 3;

        System.out.println("Your avarage calculation: " + avarage);


    }
}