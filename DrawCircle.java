import java.util.Scanner;

public class DrawCircle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a integer radius for draw to circle: ");
        int radius = keyboard.nextInt();
        double distance;

        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}



