//Calculation and information about student with OOP
package Object_Oriented_Programming.Student;

import java.util.Scanner;

public class Student {
    public int roll;
    public String name;
    public String course;
    public double m1, m2, m3;

    public double total() {
        return ((m1 + m2 + m3));
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (total() >= 70)
            return 'A';
        else if (total() >= 60)
            return 'B';
        else if (total() >= 50)
            return 'C';
        else if (total() >= 40)
            return 'D';
        else
            return 'F';
    }

    public String details() {
        return "Roll no : " + roll + "\n" + "Name : " + name + "\n" + "Course : " + course;
    }
}


class StudentTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Please enter your roll number : ");
        s.roll = keyboard.nextInt();
        System.out.println("Plese enter your name : ");
        s.name= keyboard.next();
        System.out.println("Plese enter your course name : ");
        s.course = keyboard.next();
        System.out.println("Plese enter your m1 score : ");
        s.m1 = keyboard.nextInt();
        System.out.println("Plese enter your m2 score : ");
        s.m2 = keyboard.nextInt();
        System.out.println("Plese enter your m3 score : ");
        s.m3= keyboard.nextInt();
        System.out.println("Total : " + s.total());
        System.out.println("Average : "+ s.average());

        System.out.println("Details  \n" + s.details());
    }
}

