//String Methods

public class StringMethods {
    public static void main(String[] args) {


        String str = "    Hello    Java    ";   // - - - - H e l l o - -  -  -  J  a  v  a  -  -  -  -
                                                // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        int a = str.length(); //Calculates how much letter
        String b = str.toLowerCase(); //Modifies all letters to lowercase
        String c = str.toUpperCase(); //Modifies all letters to uppercase
        String d = str.trim(); //Deletes spaces to in front and behind
        String e = str.substring(7); //Output starts which from letter
        String f = str.substring(6,15); //Output starts which from character and finish
                                        // which character(Can not take last letter! 6<=str<15
        String g = str.replace('a','b'); //Modifies old characters with new characters
                                                        //Firs value = old characters - Second value = new characters











        System.out.println(g);

    }
}
