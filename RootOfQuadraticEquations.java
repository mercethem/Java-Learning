//Algebra: solve quadratic equations

import java.util.Scanner;

public class RootOfQuadraticEquations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double x1 = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
        double x2 = (-b - (Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));
        System.out.println("x1 : " + x1 + " , " + " x2 : " + x2);

    }
}
