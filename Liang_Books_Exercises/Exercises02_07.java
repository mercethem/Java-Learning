import java.util.Scanner;

public class Exercises02_07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of minutes for year calculation : ");
        long minutes = keyboard.nextLong();
        int years = (int) (((minutes / 60) / 24) / 365);
        int days = (int) ((minutes % (60 * 24 * 365) / (60 * 24)));

        System.out.println(years + " year " + days + " days ");
    }
}