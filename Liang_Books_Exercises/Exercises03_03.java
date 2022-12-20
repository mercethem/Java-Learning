//Algebra: solve 2 * 2 linear equations

import java.util.Scanner;

public class Exercises03_03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a,b,c,d,e,f :");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double d = keyboard.nextDouble();
        double e = keyboard.nextDouble();
        double f = keyboard.nextDouble();

        if (((a * d) - (b * c)) != 0) {

            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("X is : " + x + "Y is : " + y);
        } else {
            System.out.println("The equation has no solution");
        }
    }
}