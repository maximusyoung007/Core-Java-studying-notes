package Chapter3;
import java.util.Scanner;
public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.0");
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double hDistance = Math.pow(x * x, 0.5);
        double vDistance = Math.pow(y * y, 0.5);
        if (hDistance <= 5 && vDistance <= 2.5)
            System.out.println("Point (" + df.format(x) + ", " + df.format(y) +
                    ") is in the rectangle");
        else
            System.out.println("Point (" + df.format(x) + ", " + df.format(y) +
                    ") is not in the rectangle");
    }
}
