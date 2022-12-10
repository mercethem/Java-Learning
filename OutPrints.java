public class OutPrints {
    public static void main(String[] args) {
        System.out.println(20 + 50 + " Hello "); //These brackes' into started with calculation and then coming string
        System.out.println(" Hello " + 20 + 50); //These brackes' into started with string then continue with string
        System.out.println(" Hello " + (20 + 50)); //Brackes always separate to outside to inside
        System.out.printf("Hello"); //There is no line gap
        System.out.printf("Hello\n");
        int x = -10;
        float y = 1252597.62152F;
        double t = 18.22D;
        char z = 'A';
        String str = "Java Program";
        System.out.printf("Hello %d %f %f %c %s World\n", x, y, t, z, str);
        /**     %[argument_index][flag][width][.precision]conversion
         argument index(1$, 2$, 3$ ..), flag(  '-','+','0','','('   )
         conversion  char(c), int(d[decimal],o[octal],x[hexadecimal]), float(f,e,g), String(s)     */
        System.out.printf("Hello %o %e %e %c %s World\n", x, y, t, z, str);
        System.out.printf("Hello %x %g %g %c %s World\n", x, y, t, z, str);
        System.out.printf("%3$s %2$f %1$d", x,y,str ); //This position for easy write and easy use and very useful way
        System.out.println();

        System.out.printf("%05d %020.2f %20s",x,y,str);/**For integer front of want to '0' or anything; for
         float after dot and before how much long is the number;for string how much long is string and gaps
         front the string and if use '-' then gaps after then string*/


    }
}
