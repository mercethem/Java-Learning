//Sum arrays values
public class SumAllElementrWithArray {
    public static void main(String[] args) {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int totalSum = 0;
        for (int i = 0; i < A.length ; i++) {
            totalSum= A[i] + totalSum;
        }
        System.out.println(totalSum);
    }
}
