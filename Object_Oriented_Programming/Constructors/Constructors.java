//About constructor in java programming
package Object_Oriented_Programming.Constructors;


class Constructor {
    private double length;
    private double breadth;

    public Constructor() {
        length=1;
        breadth=1;
    }
    Constructor(double l, double b){
        length = l;
        breadth = b;
    }
     Constructor(double s){
        length=breadth=s;
    }
}
class ConstructorTest{
    public static void main(String[] args) {
        Constructor r = new Constructor();
        /** if enter two value or one value or don't any value that result is different constructor usable for result
         * first constructor is for do not any value, second one is two value and last one is just one value */


    }
}
