import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day : \n" +
                "1 for Monday \n" +
                "7 for Monday \n");
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Midweek");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong enter, please enter integer 1 to 7!!!");
        }
    }
}
