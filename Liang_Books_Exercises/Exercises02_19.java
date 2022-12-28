//Geometry : Area of a triangle

import java.util.Scanner;

public class Exercises02_19 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter x1,y1,x2,y2,x3,y3 ");
        double x1 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();
        double x2 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();
        double x3 = keyboard.nextDouble();
        double y3 = keyboard.nextDouble();
        double side1 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double side2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double side3 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double s = ((side1 + side2 + side3) / 2);
        double area;
        area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
        System.out.println(area);


    }
}