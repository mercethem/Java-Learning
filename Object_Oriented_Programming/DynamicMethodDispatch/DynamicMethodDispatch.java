//This section about what want you to take any method you have to use object, not about reference.
package Object_Oriented_Programming.DynamicMethodDispatch;


class Super {
    public void method1() {
        System.out.println("Super Method1");
    }

    public void method2() {
        System.out.println("Super Method2");
    }
}

class Sub extends Super {
    public void method2() {
        System.out.println("Sub Method2");
    }

    public void method3() {
        System.out.println("Sub Method3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super s=new Super();
        s.method1();
        s.method2();
        System.out.println();

        Sub s2=new Sub();
        s2.method1();//This method from super class and output is "Super Method1"
        s2.method2();
        s2.method3();
        System.out.println();

        Super s3=new Sub();
        s3.method1(); //This method from super class and output is "Super Method1"
        s3.method2(); //Output from subclass!! Sub Method2 is output!
        // s3.method3();    // This command is "Sub Method 3" doesn't work. Because object is in sub method.
                            // Do not about super reference!
        System.out.println();

        //Sub s4 = new Super(); => This command doesn't work because we need sub required

    }
}

