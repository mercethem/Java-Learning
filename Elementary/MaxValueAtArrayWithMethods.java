//About finding max value in array with using method
public class MaxValueAtArrayWithMethods {

    static int arr(int... A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }
        }
        return A[A.length - 1];
    }


    public static void main(String[] args) {
        System.out.println(arr(1, 2, 3, 4, 354, 564, 21, 284, 999, -2000));
    }
}
