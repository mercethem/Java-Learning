//About char and ascii table

public class CharAndAscii {
    public static void main(String[] args) {
        char ch = 'A';
        int i = ch;
        ch++;
        System.out.println(i);
        System.out.println(ch++);

        char ch2 = '4';
        System.out.println(ch2);
        System.out.println((int) ch2);

        char ch3 = 0x0041;
        System.out.println(ch3);

        char ch4 = (char) 66.90;
        char ch5 = (char) 67.0;
        System.out.println(ch4);
        System.out.println(ch5);

        i = '2' + '3';
        System.out.println(i);

        System.out.println("Hello " + 'w' + 'o' + 'r' + 'l' + 'd');
        System.out.println("Hello " + '9');
        ch = 'Y';
        if ('A' <= ch && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else if ('0' <= ch && ch <= '9') {
            System.out.println(ch + " is a numeric character.");
        }


        for (i = 0; i < 127; i++) {
            System.out.printf("%4c", i);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
