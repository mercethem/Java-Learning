import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatIsMailUsernameAndDomain {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your mail address : ");
        String str = keyboard.nextLine();
        //ArrayList<String> userNameList = new ArrayList<String>();
        //ArrayList<String> Domain = new ArrayList<String>();

        int length = str.length(); //Find how much long our string

        System.out.print("Username is : ");
        int userName = str.indexOf("@");
        char[] ch1 = str.toCharArray();
        for (int i = 0; i < userName; i++) {
            System.out.print(ch1[i]);
        }
        System.out.println();

        System.out.print("Domain is : ");
        int domain = str.lastIndexOf("@");
        char[] ch2 = str.toCharArray();
        for (int j = userName +1 ; j < str.length(); j++) {
            System.out.print(ch2[j]);
        }
        System.out.println(ch1);

    }
}

/** OTHER SOLVİNG WAY
 *  String str = "programmer@gmail.com";
 *  int i = str.indexOf("@");
 *  String userName = str.substring(0,i);
 *  String domain = str.substring(i+1, str.length());
 *  System.out.println.("Username : " + userName);
 *  System.out.println("Domain : " + domain);
 */