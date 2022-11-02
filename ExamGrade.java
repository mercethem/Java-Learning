import java.util.Scanner;

public class ExamGrade {
    public static void main(String[] args) {
        System.out.println("Please enter your score : ");
        Scanner score = new Scanner(System.in);
        int grade = score.nextInt();
        if (grade >= 90) {
            System.out.println("Your Grade : AA");
        } else if (grade >= 85 && grade < 90) {
            System.out.println("Your Grade : BA");
        } else if (grade >= 80 && grade < 85) {
            System.out.println("Your Grade : BB");
        } else if (grade >= 75 && grade < 80) {
            System.out.println("Your Grade : BB");
        } else if (grade >= 70 && grade < 75) {
            System.out.println("Your Grade : BB");
        } else {
            System.out.println("Your Grade : FF");
        }

    }
}
