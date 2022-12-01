//Methods

public class Methods {
    public static void main(String[] args) {

        //ceil
        System.out.println(Math.ceil(3.0));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.5));
        System.out.println(Math.ceil(3.8));

        //floor
        System.out.println(Math.floor(3.0));
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.5));
        System.out.println(Math.floor(3.8));

        //rint
        System.out.println(Math.rint(3.0));
        System.out.println(Math.rint(3.2));
        System.out.println(Math.rint(3.4999999999));
        System.out.println(Math.rint(3.49999999999999999999999999));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(3.8));

        //round
        System.out.println(Math.round(3.0));
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.8));


        //min-max-abs
        System.out.println(Math.max(3, 4));
        System.out.println(Math.max(2.5, 3));
        System.out.println(Math.max(3, Math.max(4, Math.max(5, 6))));
        System.out.println(Math.min(2.5, 4.6));
        System.out.println(Math.abs(-2.7));

        //Randoms
        for (int i = 0; i < 8; i++) {
            System.out.println((int)(Math.random() * 10) + 5);



        }


    }
}
