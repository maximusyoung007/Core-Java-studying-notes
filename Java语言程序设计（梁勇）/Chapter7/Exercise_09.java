package Chapter7;
import java.util.Scanner;
public class Exercise_09 {
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++)
            if (min > array[i])
                min = array[i];
        return min;
    }
    public static void main(String[] args) {
        double[] num = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double numbers: ");
        for (int i = 0; i < num.length; i++)
            num[i] = input.nextDouble();
        System.out.println("The min is " + min(num));
    }
}
