//Finding max element of array
public class MaxElementOfArray {
    public static void main(String[] args) {
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max1 = A[0];
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max1 = A[i];
            }

        }
        System.out.println("Largest element is : " + max1);
    }
}
