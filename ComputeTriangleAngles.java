//Computing Angles

import java.util.Scanner;

public class ComputeTriangleAngles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter three points: ");
        double x1 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();
        double x2 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();
        double x3 = keyboard.nextDouble();
        double y3 = keyboard.nextDouble();
        /** x1 and y1, x2 and y2, x3 and y3 coordinate to triangle **/

        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        /** a,b, c are length of triangle's sides **/

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("First angle is " + Math.round(A * 100) / 100.0);
        System.out.println("Second angle is " + Math.round(B * 100) / 100.0);
        System.out.println("Third agle is " + Math.round(C * 100) / 100.0);
    }
}
