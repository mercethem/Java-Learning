import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUBTRACT");
        System.out.println("MULTIPLY");
        System.out.println("DIVIDE");

        System.out.println("Please enter two number : ");
        double number1 = keyboard.nextDouble();
        double number2 = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Please enter your step : ");
        String step = keyboard.nextLine();
        step = step.toUpperCase();


        switch (step) {
            case "ADD":
                System.out.println("Sum is : " + (number1 + number2));
                break;
            case "SUBTRACT":
                System.out.println("Difference is : " + (number1 - number2));
                break;
            case "MULTIPLY":
                System.out.println("Product is : " + (number1 * number2));
                break;
            case "DIVIDE":
                System.out.println("Ratio is : " + (number1 / number2));
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
