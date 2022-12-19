import java.util.Scanner;

//Factorial
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        int number = keyboard.nextInt();
        long result = 1;
        for (int i = 0 ; i < number; i++, result *=i) {

        }
        System.out.println(result);
    }
}
