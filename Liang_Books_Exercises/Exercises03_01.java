package import1;

import java.util.Scanner;

//Algebra: solve quadratic equations
public class Exercises03_01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plase enter equation's complements to a,b,c :");

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        double r1;
        double r2;
        double discriminant;
        discriminant = (b * b) - (4 * a * c);
        r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        r2 = (-b - Math.sqrt(discriminant)) / (2 * a);


        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else if (discriminant == 0) {
            System.out.println("The equation's two same roots" + r1);
        } else {

            System.out.println("The equation's roots are " + r1 + r2);

        }
    }
}