//Args about (...X), like arrays
public class VaribleArgs {
    static void show(int...A){
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
    static void showList(String ...S){
        for (int i = 0; i < S.length; i++) {
            System.out.println(i+1 + ": " + S[i]);
        }    
    }
    static void showList2(int start,String ...S){
        for (int i = 0; i <S.length; i++) {
            System.out.println(start + ": " + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList2(5, "john" , "Smith" , "George");
    }
}
