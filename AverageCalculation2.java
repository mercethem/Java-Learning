
import java.util.Scanner;

public class AverageCalculation2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three number for average calculation: ");
        
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();

        float average = (number1 + number2 + number3)/3;
        /* AverageCalculation's problem, i used to double but
         * i understand that problem and i changed this double to float.*/
        
        System.out.println("Your average calculation: " + average);

    
    }
}