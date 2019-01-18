package Chapter5;
import java.util.Scanner;
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        String student1 = "";
        double score1 = 0;
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter a student name: ");
            String student = input.next();
            System.out.print("Enter a student score: ");
            double score = input.nextDouble();
            if (score > score1) {
                student1 = student;
                score1 = score;
            }
        }
        System.out.println("Top student " + student1 + "'s score is " + score1);
    }
}
