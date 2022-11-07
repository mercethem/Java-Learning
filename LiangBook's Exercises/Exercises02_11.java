import java.util.Scanner;

public class Exercises02_11 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a year want to calculate: ");
        int year = keyboard.nextInt();
        System.out.println  (312032486 + year *
                (int)((365 * 24 * 60 * 60) / 7 -
                        (365 * 24 * 60 * 60 / 13) +
                        (365 * 24 * 60 * 60 / 45)));

    }
}