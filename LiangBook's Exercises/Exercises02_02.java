import java.util.Scanner;

public class Exercises02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius and length of cylinder " +
                            "that want to calculate volume : ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area  =  radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}