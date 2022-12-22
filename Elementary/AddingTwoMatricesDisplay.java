
public class AddingTwoMatricesDisplay {
    public static void main(String[] args) {

        int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int B[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
        int C[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%02d ", A[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int k = 0; k < B.length; k++) {
            for (int j = 0; j < B[k].length; j++) {
                System.out.printf("%02d ", B[k][j]);

            }
            System.out.println();
        }
        System.out.println("+\n--------");

        for (int l = 0; l < C.length; l++) {
            for (int j = 0; j < C[l].length; j++) {
                C[l][j] = A[l][j] + B[l][j];
                System.out.printf("%02d ", C[l][j]);
            }
            System.out.println();
        }
    }
}

