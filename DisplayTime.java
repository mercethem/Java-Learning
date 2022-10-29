import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        System.out.println("Please enter minute want to calculate : ");

        Scanner input = new Scanner(System.in);

        int minute = input.nextInt();
        int calculateMinutes = minute / 60;
        int calculateSeconds = minute % 60;

        System.out.println("Your want's : " + calculateMinutes + " hours and " + calculateSeconds + " minutes");

    }
}