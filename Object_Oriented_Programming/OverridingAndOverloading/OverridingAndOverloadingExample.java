//This classes about overriding and overloading.
package Object_Oriented_Programming.OverridingAndOverloading;

class Car {
    public void start() {
        System.out.println("Car Started");

    }

    public void accelerate() {
        System.out.println("Car Accelerate");
    }

    public void changeGear() {
        System.out.println("Car Gear changed");

    }
}

class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic Gear");

   }

    public void openRoof() {
        System.out.println("Sun roof is opened");
    }
}

class OverloadingLuxuryCar extends Car { //So overloading uses different parameters subclasses from superclasses
    public void changeGear(int a) {
        System.out.println("Overloading Automatic Gear");
    }

    public void openRoof(int b) {
        System.out.println("Overloading Sun roof is opened");

    }
}

public class OverridingAndOverloadingExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.accelerate();
        c.changeGear();
        System.out.println();

        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.accelerate();
        lc.changeGear();
        lc.openRoof();
        System.out.println();

        Car C = new LuxuryCar();
        C.start();
        C.accelerate();
        C.changeGear();
        /** C.openRoof(); */ /**Just this command doesn't work because reference is Car but object LuxuryCar
         * that's mean is if you want to use object so you have to use be careful take references.
         * Your reference chose your functions not to object!. */
        System.out.println();

        OverloadingLuxuryCar OC = new OverloadingLuxuryCar();
        OC.start();
        OC.accelerate();
        OC.changeGear();
        System.out.println();

        Car OC2 = new OverloadingLuxuryCar();
        OC.start();
        OC.accelerate();
        OC.changeGear(4);
        OC.openRoof(4);

    }

}

