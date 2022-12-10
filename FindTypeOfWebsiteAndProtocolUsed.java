//Find type of website and the protocol used

import java.util.Scanner;

public class FindTypeOfWebsiteAndProtocolUsed {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your website : ");
        String url = keyboard.nextLine();
        if (url.contains(".com")){
            System.out.println("Website's type is Commercial");
        } else if (url.contains(".gov")) {
            System.out.println("Website's type is Government");
        } else if (url.contains(".org")){
            System.out.println("Website's type is Organisation");
        } else if (url.contains(".net")) {
            System.out.println("Website's type is Network");
        } else if (url.contains(".biz")){
            System.out.println("Website's type is Business");
        } else {
            System.out.println("Not Found website's type");
        }
        if(url.contains("http")){
            System.out.println("Protocol is: HypeText Transfer Protocol");
        } else if (url.contains("https")){
            System.out.println(" Protocol is: HyperText Transfer Protocol Secure");
        } else if (url.contains("ftp")){
            System.out.println(" Protocol is: File Transfer Protocol");
        } else if (url.contains("pop3")){
            System.out.println(" Protocol is: Post Office Protocol");
        } else if (url.contains("SMTP")){
            System.out.println(" Protocol is: Simple Mail Transfer Protocol");
        } else {
            System.out.println("Nan not found protocol!");
        }
    }
}
