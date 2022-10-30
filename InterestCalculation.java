import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your annual interest rate (e.g., 4.5) : ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter to how much year pay for you want (e.g., 5) : ");
        int numberOfYear = input.nextInt();

        System.out.println("Please enter your loan amount (e.g., 1500) : ");
        double loanAmount = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYear * 12))));
        double totalPayment = monthlyPayment * numberOfYear * 12;

        System.out.println("Your total payment is " + (float)totalPayment);
        System.out.println("your monthly payment is " + (float)monthlyPayment);

    }
}
