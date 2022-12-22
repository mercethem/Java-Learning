import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter integer for height: ");
        System.out.println("Please enter integer for length: ");
        int height = keyboard.nextInt();
        int length = keyboard.nextInt();
        int i;
        int j;

        for (i = 1; i <= height; i++) {
            for (j = 1; j <= i; j++) {
                if (height / length >= i / j) {
                    System.out.print("*");
                } else {
                }
            }
            System.out.print("\n");
        }
    }
}
