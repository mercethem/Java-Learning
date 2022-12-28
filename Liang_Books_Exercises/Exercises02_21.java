//Financial application: Calculate future investment value

import java.util.Scanner;

public class Exercises02_21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter investment amount, annual interest rate in percentage, number of year : ");

        float investmentAmount = keyboard.nextFloat();
        float annualInterestRateInPercentage = keyboard.nextFloat();
        float numberOfYear = keyboard.nextFloat();
        float monthlyInterestRate = (float) ((annualInterestRateInPercentage * 0.01) / 12);
        float futureInvestmentValue;
        futureInvestmentValue = (float) (investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYear * 12));
        System.out.println(futureInvestmentValue);


    }
}