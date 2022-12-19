//Numbers change to string
import java.util.*;

public class NumbersToString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int result;
        String str = "";

        while (number > 0) {
            result = number % 10;
            number = number / 10;
            str = str + result;
        }
        char characters;
        for (int i = str.length()-1; i>=0; i--) {
            characters=str.charAt(i);
            switch (characters) {
                case '0' -> System.out.println("zero");
                case '1' -> System.out.println("one");
                case '2' -> System.out.println("two");
                case '3' -> System.out.println("three");
                case '4' -> System.out.println("four");
                case '5' -> System.out.println("five");
                case '6' -> System.out.println("six");
                case '7' -> System.out.println("seven");
                case '8' -> System.out.println("eight");
                case '9' -> System.out.println("nine");
            }
        }
    }
}
