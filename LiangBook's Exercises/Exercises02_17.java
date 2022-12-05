//Science: wind-chill temperature)

import java.util.Scanner;

public class Exercises02_17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a temperature between -58ºF or 41ºF and wind is greater or equal 2 mph : ");
        double ta = keyboard.nextDouble(); //ta is the outside temperature measured in degrees Fahrenheit
        double v = keyboard.nextDouble();// v is the speed measured in miles per hour
        /*** The formula cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or
         above 41ºF. **/

        double twc; //twc is formula's result

        twc = 35.74 + (0.6215  * ta) - 35.75 * Math.pow(v,0.16) + 0.4275 * ta * Math.pow(v,0.16);
        System.out.println("The wind chill index is : " + twc);




    }
}