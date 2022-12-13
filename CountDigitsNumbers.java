//Count digit to numbers
import java.util.Scanner;

public class CountDigitsNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        long number = keyboard.nextLong();
        int count= 0;

        while (number>0){

        number = number/10;
        count++;

        }
        System.out.println(count);




    }
}
