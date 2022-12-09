public class RightAndLeftShift {
    public static void main(String[] args) {
        int i = 1000 << 3; // (1000*2^n)
        int j = 1024 >> 8; // (2/2^n)
        int k = 1024 >>> 8; // (2/2^n)
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}
