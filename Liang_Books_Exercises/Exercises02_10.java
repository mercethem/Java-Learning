
//Science: Calculating energy

import java.util.Scanner;

public class Exercises02_10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms : ");
        float amountOfWater = keyboard.nextFloat();
        System.out.println("Enter the initial temperature");
        float initialTemperature = keyboard.nextFloat();
        System.out.println("Enter the final temperature");
        float finalTemperature = keyboard.nextFloat();
        float neededEnergy = amountOfWater * ( finalTemperature - initialTemperature) * 4184 ;
        System.out.println(neededEnergy);


    }
}