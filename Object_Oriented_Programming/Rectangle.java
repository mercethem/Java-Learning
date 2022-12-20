//Created for rectangle's finding area and perimeter. This class and others in this package's OOP's learning

package Object_Oriented_Programming;

import java.util.Scanner;

class Rectangle {
    private double breadth;
    private double length;

    static double area(double length, double breadth) {
        return length * breadth;
    }

    static double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a length : ");
        double length = keyboard.nextDouble();
        System.out.println("Please enter a breadth : ");
        double breadth = keyboard.nextDouble();
        System.out.println("Area is : " + Rectangle.area(length, breadth));
        System.out.println("Perimeter is " + Rectangle.perimeter(length, breadth));
    }
}
