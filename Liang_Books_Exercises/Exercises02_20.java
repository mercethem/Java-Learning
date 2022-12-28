//Financial application: Calculate interest

import java.util.Scanner;

public class Exercises02_20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter balance and annual interest rate (e.g. 3 for %3) : ");
        float balance = keyboard.nextFloat();
        float annualInterestRate = keyboard.nextFloat();
        float interest = balance * (annualInterestRate / 1200);
        System.out.println(interest);


    }
}