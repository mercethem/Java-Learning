//Rotation an array any value
public class RotationAnArray {
    public static void main(String[] args) {

        int A[]= new int[]{3,9,7,8,12,6,15,5,4,10};
        int temp = A[0];
        for (int i = 1; i< A.length; i++) {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " , ");
        }
    }
}
