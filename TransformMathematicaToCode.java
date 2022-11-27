public class TransformMathematicaToCode {
    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        double a = 1;
        double b = 1;
        double c = 1;

        double calculate = ((3 + 4 * x) / 5)
                - ((10 * (y - 5) * (a + b + c)) / x)
                + 9 * ((4 / x) + (9 + x) / y);
        System.out.println("Your calculation is : " + calculate);
    }
}
