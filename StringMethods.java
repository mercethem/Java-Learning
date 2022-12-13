//String Methods
import java.util.*;

public class StringMethods {
    public static void main(String[] args) {

        String str = "    Hello    Java    ";   /** - - - - H e l l o - -  -  -  J  a  v  a  -  -  -  - */
                                                /** 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 */
        int a = str.length(); //Calculates how much letter
        String b = str.toLowerCase(); //Modifies all letters to lowercase
        String c = str.toUpperCase(); //Modifies all letters to uppercase
        String d = str.trim(); //Deletes spaces to in front and behind
        String e = str.substring(7); //Output starts which from letter*/
        String f = str.substring(6,15); /** Output starts which from character and finish
                                            which character(Can not take last letter! 6<=str<15*/
        String g = str.replace('a','b'); /** Modifies old characters with new characters
                                                            Firs value = old characters - Second value = new characters
                                                            str.replaceAll("\\s+", " ").trim() this method is deletes default
                                                            spaces with normal just one space. */
        boolean h = str.startsWith(" "); //Controlling what is the start characters (Plural or singular)
        boolean i = str.endsWith(" ");   //Controlling what is the last characters (Plural or singular)
        char j = str.charAt(5);          //Controlling what is the character inside brackets
        int k = str.indexOf("e",10);    // What is row number of character inside brackets from beginning
                                                    // After comma character is second one index that
                                                    // [There is no index result is "-1"]
        int l = str.lastIndexOf("k",10);    // What is row number of character inside brackets from ending
                                                        // After comma character is second one index
                                                        // [There is no index result is "-1"]
        boolean m = str.equals("    Hello    Java    ");     //Controlling the value and inside brackets' same or not
        /** String str1 = "Pyramid";                     */  // Literals always fall in pool and program can understand equals
        /** String str2 = new String("Pyramid");         */  // If first is in heap and second is in pool that so they are not equal
        /** str1 != str2 (it's mean these are not equal) */
        /** because str1 is in pool and str2 in in heap  */

        boolean n =str.equalsIgnoreCase("    hello    java    "); //Ignoring upper and lower case

        String str1 = "JAVA";
        String str2 = "PYTHON";
        String str3 = "java";
        int o = str1.compareTo(str2);   //If result is positive then the greater outside of brackets
                                        //If result is negative then the greater one inside of brackets
                                        //If result is 0 then they are equal
                                        //Uppercase letters smaller than lowercase letters [Remember ASCII]
        boolean p = str.contains("llo    Java");  //Controlling is there inside bracket's string value to given value

        System.out.println(l);

    }
}
