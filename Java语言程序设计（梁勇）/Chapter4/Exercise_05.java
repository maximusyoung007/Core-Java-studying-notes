package Chapter4;
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area =  numberOfSides * side * side / (Math.tan(Math.PI / numberOfSides) * 4);
        System.out.println("The area of the polygon is " + area);
    }
}
