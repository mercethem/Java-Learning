//This is about polymorphism. Same methods same names same types but different actions, this mean is polymorphism.

package Object_Oriented_Programming.Polymorphism;
class Test{
    public int max(int a, int b){
        return a>b?a:b;
    }
    public int max (int a, int b, int c){
        if (a>b && a>c) return a;
        else if (b>c) return b;
        else return c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Test t = new Test();
        t.max(10,5); //This is just for show about working
        t.max(20,10,5); //This is just for show about working
        System.out.println(t.max(10,5));
        System.out.println(t.max(20,10,1));
    }
}
