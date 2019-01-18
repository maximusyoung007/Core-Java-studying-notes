package Chapter5;
import java.util.Scanner;
public class Exercise_45 {
    public static void main(String[] args) {
        final int COUNT = 10;
        double sum = 0;
        double squareSum = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < COUNT; i++) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            sum += number;
            squareSum += Math.pow(number, 2);
        }
        double mean = sum / COUNT;
        double deviation =
                Math.pow((squareSum - sum * sum / COUNT) / (COUNT - 1), 0.5);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
    }
}
