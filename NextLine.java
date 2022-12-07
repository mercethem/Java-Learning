import java.util.*;

public class NextLine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("May i know your name ? ");

        String name;
        name = keyboard.nextLine();
        System.out.println("Wellcome Mr./Mrs. " + name);
    }
}
