import java.util.Scanner;

//Financial application: compound value
public class Exercises02_13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the monthly saving amount: ");
        float monthlySaving = keyboard.nextFloat();

        System.out.println(" Please enter savings percentage (e.g 5 ): ");
        float percentage = keyboard.nextFloat();

        float monthPercentage = (float) ((percentage * 0.01) / 12);
        float totalSaving;
        totalSaving = monthlySaving * (1 + monthPercentage);
        totalSaving = (totalSaving + monthlySaving) + (1 + monthPercentage);
        totalSaving = (totalSaving + monthlySaving) + (1 + monthPercentage);
        totalSaving = (totalSaving + monthlySaving) + (1 + monthPercentage);
        totalSaving = (totalSaving + monthlySaving) + (1 + monthPercentage);
        totalSaving = (totalSaving + monthlySaving) + (1 + monthPercentage);
        System.out.println(totalSaving);
    }
}