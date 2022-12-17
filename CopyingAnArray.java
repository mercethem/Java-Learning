//Copying an array

public class CopyingAnArray {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        A[0] = 8;
        A[1] = 6;
        A[2] = 10;
        A[3] = 9;
        A[4] = 2;
        A[5] = 15;
        A[6] = 7;
        A[7] = 13;
        A[8] = 14;
        A[9] = 11;
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            System.out.print(B[i] + " ");
        }


    }
}
