package Chapter6;
import java.util.Scanner;
public class Exercise_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " +
                getArea(side));
    }
    public static double getArea(double side) {
        double area = 5 * side * side / Math.tan(Math.PI / 5) / 4;
        return area;
    }
}
