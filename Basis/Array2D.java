//About how can i use 2D arrays
public class Array2D {
    public static void main(String[] args) {

        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]);
            }
        }
        System.out.println();

        int B[][] = new int[3][];
        B[0] = new int[5];
        B[1] = new int[3];
        B[2] = new int[8];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
