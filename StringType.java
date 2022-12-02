import java.util.Locale;

public class StringType {
    public static void main(String[] args) {
        String str = "Hello dear Java!";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(7));
        /** System.out.println(str.charAt(16));//StringIndexOutOfBoundsException!!!!!!!! **/

        System.out.println(str.concat(str));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.ENGLISH));

        String str2 = "      \n\t     #843signal to          noise issue      \t\n      ";
        System.out.println(str2.trim()); //Trim is important for example data import! Exception paswords!!


    }
}
