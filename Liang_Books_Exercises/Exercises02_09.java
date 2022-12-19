
//Physics: acceleration)

import java.util.Scanner;

public class Exercises02_09 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter to values v0, v1 and t for calculate acceleration : ");

        float initialSpeed = keyboard.nextFloat();
        float finishSpeed = keyboard.nextFloat();
        float time = keyboard. nextFloat();
        float acceleration = (finishSpeed - initialSpeed) / time ;
        System.out.println(acceleration);

    }
}