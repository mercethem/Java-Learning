//Geometric series

import java.util.Scanner;

public class GeometricSeries {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int start = keyboard.nextInt();
        int number = keyboard.nextInt();
        int geometric = keyboard.nextInt();


        for (int i = 1; i <= number; i++) {
            start = start * geometric;
            System.out.println(start);
        }
    }
}
