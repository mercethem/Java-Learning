//Deleting an element an array

import java.util.Scanner;

public class DeletingAnElementAnArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an index : ");
        int index = keyboard.nextInt();

        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < index; i++) {
            System.out.print(A[i] + " ");
        }
        for (int j = index; j < (A.length - index - 1); j++) {

            int temp = A[j];
            A[j] = A[j + 1];
            A[j + 1] = temp;

            System.out.print(A[j] + " ");
        }

    }
}

