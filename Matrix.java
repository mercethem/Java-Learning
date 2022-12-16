//Draw matrix
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer for rows : ");
        System.out.println("Please enter an integer for column : ");
        int line = keyboard.nextInt();
        int column = keyboard.nextInt();
        for (int i=1; i<=column ;i++){
            for(int j=1; j<=line ;j++){
                System.out.print(" ( "+ i + " , " + j + " ) ");
            }
            System.out.println();
        }
    }
}
