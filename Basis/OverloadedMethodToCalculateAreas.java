import java.util.Scanner;

public class OverloadedMethodToCalculateAreas {

    static double square (double a, double b){
        return a*b;
    }
    /**static double rectangle(double a, double b){
        return a*b;
    }
    static double triangle(double a, double b){
        return a*b;
    }
    static double circle(double radius){
        return Math.PI*Math.pow(radius,2);
    }*/

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a=keyboard.nextDouble();
        double b=keyboard.nextDouble();
        System.out.println(square(a,b));
    }
}
