//Finding about a circle's calculations with OOP
package Object_Oriented_Programming.Circle;
import java.util.Scanner;
class Circle {
    private static double radius;
    private static double height;
    static double lidArea(double radius, double height) {

        return Math.PI * radius * radius;
    }
    static double totalSurfaceArea(double radius, double height) {
        return (2 * Math.PI * Math.pow(radius, 2) * height) + 2 * Math.PI * Math.pow(radius, 2);
    }
    static double volume(double radius, double height) {

        return (Math.PI * radius * radius * height);
    }
}
class CircleTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter radius : ");
        double radius = keyboard.nextDouble();
        System.out.println("Please enter height : ");
        double height = keyboard.nextDouble();
        System.out.println("Lid Area is : " + Circle.lidArea(radius, height) + "\n" +
                "Total surface area is : " + Circle.totalSurfaceArea(radius, height) + "\n" +
                "Volume is : " + Circle.volume(radius, height));
    }
}
