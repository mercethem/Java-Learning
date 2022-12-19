//About summing all array with using method
public class SumArrayWithMethod {
    static int arr(int ...A) {
        int total = 0;
        for (int i = 0; i <A.length ; i++) {
            total += A[i];
        }
        return total;

    }


    public static void main(String[] args) {
        System.out.println(arr(1,2,3,4));
    }
}
