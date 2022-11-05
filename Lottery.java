import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two number about two digits : ");

        int number1 = (int) (Math.random() * 100);
        int chosen1 = input.nextInt();
        boolean result1 = (number1 == chosen1);

        int number2 = (int) ((Math.random() * 100));
        int chosen2 = input.nextInt();
        boolean result2 = (number2 == chosen2);

        int number3 = (int) (Math.random() * 100);
        int chosen3 = input.nextInt();
        boolean result3 = (number3 == chosen3);

        int number4 = (int) (Math.random() * 100);
        int chosen4 = input.nextInt();
        boolean result4 = (number4 == chosen4);

        int number5 = (int) (Math.random() * 100);
        int chosen5 = input.nextInt();
        boolean result5 = (number5 == chosen5);

        int number6 = (int) (Math.random() * 100);
        int chosen6 = input.nextInt();
        boolean result6 = (number6 == chosen6);

        if (result1) {
            System.out.println(" ");
        } else {
            System.out.print("" + number1);
        }
        if (result2) {
            System.out.println(" ");
        } else {
            System.out.print(" " + number2);
        }
        if (result3) {
            System.out.println(" ");
        } else {
            System.out.print(" " + number3);
        }
        if (result4) {
            System.out.println(" ");
        } else {
            System.out.print(" " + number4);
        }
        if (result5) {
            System.out.println(" ");
        } else {
            System.out.print(" " + number5);
        }
        if (result6) {
            System.out.println(" ");
        } else {
            System.out.println(" " + number6);
        }

        if (result1 && result2 && result3 && result4 && result5 && result6) {
            System.out.println("Congratulations you win 100.000$ ");
        } else if (result1 || result2 || result3 || result4 || result5 || result6) {
            System.out.println("Congratulations you win 1.000$ ");
        } else {
            System.out.println("We are sorry you lose :( ");

            /*I do not know how can i select dual, triple, quaternary, quintet formation
            then i will chance later i will learn.*/
        }
    }
}
