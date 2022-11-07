import java.util.Scanner;

public class Exercises02_09 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter to values v0, v1 and t for calculate acceleration : ");

        float v0 = keyboard.nextFloat(); // v0 is first speed
        float v1 = keyboard.nextFloat(); // v1 is last speed
        float t = keyboard. nextFloat(); // t is time change
        float a = (v1 - v0) / t ; //a is acceleration
        System.out.println(a);

    }
}