//Find your number's radix

import java.util.Scanner;

public class FindRadix {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String number;
        System.out.println("Please enter your number : ");
        number = keyboard.nextLine();

        if (number.matches("[0-1]+")) {
            System.out.println("Binary Radix (2)");
        } else if (number.matches("[0-7]+")) {
            System.out.println("Octal Radix (8)");
        } else if (number.matches("[0-9]+")) {
            System.out.println("Decimal Radix (10) ");
        } else if (number.matches("[0-9,A-F]+")) {
            System.out.println("Hexadecimal Radix (16)");
        } else {
            System.out.println("That is not a number!");
        }
    }
}
