//Physics: Finding runway length

import java.util.Scanner;

public class Exercises02_12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter speed and acceleration calculate for length: ");
        float speed = keyboard.nextFloat();
        float acceleration = keyboard.nextFloat();
        float length = ((speed * speed) / (2 * acceleration));
        System.out.println(length);

    }
}