//This class will not run, i am going to change all of that!!!

import java.util.Scanner;


public class USATaxRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("How much do you earn salary ? Please enter (e.g. 10000):  " +
                "(Do not use after dot) = ");
        double salary = input.nextDouble();
        double tax = 0;
        if (salary > 50000) {
            tax = salary * 0.25;
        } else if (salary > 25000) {
            tax = salary * 0.20;
        } else if (salary > 10000) {
            tax = salary * 0.15;
        } else {
            tax = salary * 0.1;
        }


        System.out.println("Are you single or married? " +
                "If you are single enter (1), else so you are married enter (2) " +
                "[Do not enter other number]");

        byte maritalStatus = input.nextByte();
        double tax2 = 0;
        if (maritalStatus == 1) {
            tax2 = salary * 0.1;
        } else {
            tax2 = salary * 0.08;
        }


        System.out.println("How much child do you have ? ");
        byte members = input.nextByte();
        double tax3 = 0;
        if (members >= 4) {
            tax3 = salary * 0.08;
        } else if (members >= 2) {
            tax3 = salary * 0.09;
        } else
            tax3 = salary * 0.1;

        System.out.println(tax + tax2 + tax3);
    }
}