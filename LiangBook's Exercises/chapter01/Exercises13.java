public class Exercises13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.55;
        double f = 5.9;

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        e = (a * x) + (b * y);
        f = (c * x) + (d * y);

        /*44.5 = (3.4 * x) + (50.2 * y);
        5.9 = (2.1 * x) + (0.55 * y);*/

        System.out.println("x is : " + x + "y is : " + y);

    }
}