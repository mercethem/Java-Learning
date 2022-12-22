//Similar methods about overloading
public class MethodOverloading {

    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        if (x > y)
            return x;
        else
            return y;
    }
    static int max(int x, int y, int z) {
        return x > y & x > z ? x : (y > z ? y : z);
    }

    public static void main(String[] args) {
        System.out.println(max(1.5F, 2.8F));
    }
}
