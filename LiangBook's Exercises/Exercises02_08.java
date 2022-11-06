import java.util.Scanner;

public class Exercises02_08 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the time zone offset to GMT : ");
        byte gmt = keyboard.nextByte();
        long totalSeconds = (long) (System.currentTimeMillis() / 1000);

        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println(currentHours + gmt + " : " + currentMinutes + " : " + currentSeconds);
    }
}