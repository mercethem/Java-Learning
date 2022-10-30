import java.util.Scanner;

public class CountingMonetary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your money (e.g. 15.67) : ");

        double totalCash = scan.nextInt();
        int allCoins = (int)(totalCash * 100);

        int totalDolars = allCoins / 100;
        int totalCoins = allCoins % 100;

        int total_25_cents = totalCoins / 25;
        int total_10_5_cents = totalCoins % 25;

        int total_10_cents = total_10_5_cents / 10;
        int total_5_cents =  total_10_cents % 10;

        int totalLittleCents = total_5_cents / 5;
        int total_1_cents = total_5_cents % 5;

        System.out.println(totalDolars +" "+ total_25_cents + " " + total_5_cents + " " + total_1_cents);
        //DO NOT WORK WELL!!!

    }
}
