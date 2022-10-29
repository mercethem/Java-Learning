public class NumericTypeConversion {
    public static void main(String[] args) {
        int i = 5;

        long l = 5;

        i = (int)l; /* int is 32 bit but long is 64 bit.
                64 bit can cover 32 bit but 32 bit can not cover 64 bit.
                "(int)" is narrowing long to int. We need that program said
                us this because 32 bit of 64 bit's will go to waste.  */
        System.out.println(i);

        l = 2482000000L; // "L" is a literal.
        i = (int)l;

        System.out.println(i);  // Result is "-1812967296" and this name is integer overflow.
                                // (This is a LOGIC ERROR!!!)
    }
}
