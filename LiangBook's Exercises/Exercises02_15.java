// Geometry: distance of two points

import java.util.Scanner;

public class Exercises02_15 {
    public static void main(String[] args) {
        System.out.println("Please enter x1,x2,y2,y3");
        Scanner keyboard = new Scanner(System.in);

        double x1 = keyboard.nextDouble();
        double x2 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();
        double resultFirst;
        double resultSecond;
        double result;

        resultFirst = x2 - x1;
        resultSecond = y2 - y1;
        result = Math.sqrt((Math.pow(resultFirst, 2) + Math.pow(resultSecond, 2)));
        System.out.println(result);


    }
}