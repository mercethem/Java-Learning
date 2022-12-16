//Finding any value in array
import java.util.Scanner;

public class SearchingAnElementInArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter any key : ");
        int key = keyboard.nextInt();
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        for (int i = 0; i <A.length ; i++) {
            if (A[i]==key){
                System.out.println(i);
                System.exit(0); //Search when finished that line pushes step out!
            }

        }
        System.out.println("Not Found");
    }
}
