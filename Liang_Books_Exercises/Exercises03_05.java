//Find future dates

import java.util.Scanner;

public class Exercises03_05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int day = keyboard.nextInt();
        int futureday = keyboard.nextInt();
        System.out.println("Please enter day and future number : ");
        int x = day + futureday;


        switch (x) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");

        }
    }
}