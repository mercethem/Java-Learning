import java.util.Scanner;

//Geometry: Area of a hexagon
public class Exercises02_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the side : ");
        double area;
        double side = keyboard.nextDouble();
        area = (float) (((3 * Math.sqrt(3)) / 2.0) * (side * side));
        System.out.println("The area of the hexagon is : " + area);

    }
}