import java.util.Scanner;

public class DrawATrianle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int r = keyboard.nextInt();
        int i;
        int j;
        for (i=0; i<=r; i++){
            for (j=1; j<=r-i; j++){
                System.out.print("");
            }
            for (j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");}}}