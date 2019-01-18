package Chapter5;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args) {
        int correctCount = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        while (count < 10) {
            int number1 = 1 + (int)(Math.random() * 15);
            int number2 = 1 + (int)(Math.random() * 15);
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();
            String replyString;
            if (number1 + number2 == answer) {
                replyString = "You are correct!";
                correctCount++;
            }
            else {
                replyString = "Your answer is wrong.\n" + number1 + " + "
                        + number2 + " should be " + (number1 + number2);
            }
            System.out.println(replyString);
            count++;
        }
        System.out.println("Correct count is " + correctCount);
        long endTime = System.currentTimeMillis();
        System.out.println("Time spent is " + (endTime - startTime) / 1000 + " seconds");
    }
}
