public class MethodTrial1 {
    static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    static void change(int A[], int index, int value) {
        A[index] = value;
    }
    static void says (String name){
        System.out.println("Wellcome Mr./Mrs. " + name);
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        int A[] = {2, 4, 6, 8, 10};
        change(A, 2, 20);
        System.out.println(max(a, b));
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);

        }
        String name = " Victor" ;
        says(name);
    }
}
