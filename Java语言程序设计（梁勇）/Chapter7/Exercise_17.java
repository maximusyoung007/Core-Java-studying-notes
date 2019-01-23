package Chapter7;
import java.util.Scanner;
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter a student name: ");
            names[i] = input.next();
            System.out.print("Enter a student score: ");
            scores[i] = input.nextDouble();
        }
        for (int i = 0; i < numberOfStudents - 1; i++) {
            double currentMin = scores[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < numberOfStudents; j++) {
                if (currentMin > scores[j]) {
                    currentMin = scores[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                scores[currentMinIndex] = scores[i];
                scores[i] = currentMin;
                String temp = names[currentMinIndex];
                names[currentMinIndex] = names[i];
                names[i] = temp;
            }
        }
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(names[i] + "\t" + scores[i]);
        }
    }
}

