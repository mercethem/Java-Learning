//Insert a value to array

import java.util.Scanner;

public class InsertAElementToArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an integer : ");
        int number = keyboard.nextInt();

        int A[] = new int[10];
        A[0] = 3;
        A[1] = 9;
        A[2] = 7;
        A[3] = 8;
        A[4] = 12;
        A[5] = 6;

        System.out.println("Place enter a sequence in array want to insert : ");
        int placeInArray = keyboard.nextInt();

        for (int i = A.length - placeInArray; i >= placeInArray; i--) {
            A[i + 1] = A[i];
        }
        A[placeInArray] = number;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println("");
    }
}
