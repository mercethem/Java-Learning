import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = scan.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is: " + (int) (tax * 100) / 100.0);
    }
}
