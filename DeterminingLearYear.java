import java.util.Scanner;

public class DeterminingLearYear {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Please enter the year that you want to check : ");

        int year = inputYear.nextInt();
        boolean isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        /*We could use (10. and 11.)
         isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)*/

        if (isLeapYear) {
            System.out.println(year + " is a leap year that is your enter");
        } else {
            System.out.println(year + " is not a leap year that is your enter");
        }
    }
}
