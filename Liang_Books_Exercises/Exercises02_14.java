import java.util.Scanner;

public class Exercises02_14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your pounds : ");
        float mass = keyboard.nextFloat();

        System.out.println("Please enter your inches : ");
        float inches = keyboard.nextFloat();

        float bmi = (float) (mass / (inches * inches) * 703.06957964);

        System.out.println(bmi);
    }
}