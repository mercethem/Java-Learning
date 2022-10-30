import java.util.Scanner;

public class CountingMonetary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your counting amount (e.g. 15.6) : ");

        double allMoney = scan.nextDouble();
        int totalMoney = (int)(allMoney * 100);

        int totalDollars = totalMoney / 100;
        int totalCoins = (int)(allMoney % 100);

        int total_25_cents = totalCoins / 25;
        int total_5_and_1_Cents = totalCoins % 25;

        int total_5_cents = total_5_and_1_Cents / 5;
        int total_1_cents = total_5_and_1_Cents % 5;


        System.out.println("Your money is : " + totalDollars + " dollars, " + total_25_cents + " 25 cents, "
                + total_5_cents + " 5 cents, " + total_1_cents + " 1 cents. ");
        //DO NOT WORK WELL!!!
    }
}
