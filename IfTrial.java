import java.util.Scanner;

public class IfTrial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter and integer: ");
        int number = keyboard.nextInt();


        if (number % 2 == 0) {
            System.out.println("Hi even");
        }

        if (number % 5 == 0) {
            System.out.println("Hi five");


        }
    }
}
