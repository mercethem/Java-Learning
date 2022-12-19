//Created for validating name and birthday with using method

import java.util.Scanner;

public class ValidateNameAndAge {
    static String id(String str) {
        return str;
    }

    static short day(short x) {
        return x;
    }

    static short month(short x) {
        return x;
    }

    static short year(short x) {
        return x;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name and birth day (day/month/year) : ");
        String id = keyboard.nextLine();
        short day = keyboard.nextShort();
        short month = keyboard.nextShort();
        short year = keyboard.nextShort();
        if (id == id(id) && day == day(day) && month == month(month) && year == year(year)) {
            System.out.println("Your ID is " + id(id) + "\n " + " Your birthday is " + day(day) + " / " + month(month) +
                    " / " + year(year));
        } else {
            System.out.println("Wrong answer!!!");
        }
    }
}
