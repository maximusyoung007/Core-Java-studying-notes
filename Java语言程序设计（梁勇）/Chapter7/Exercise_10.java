package Chapter7;
import java.util.Scanner;
public class Exercise_10 {
    public static double min(double[] array) {
        double min = array[0];
        int n = 0;
        for (int i = 1; i < array.length; i++)
            if (min > array[i]) {
                min = array[i];
                n = i;
            }
        return n;
    }
    public static void main(String[] args) {
        double[] num = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double numbers: ");
        for (int i = 0; i < num.length; i++)
            num[i] = input.nextDouble();
        System.out.println("The index of min is " + (int)min(num));
    }
}
