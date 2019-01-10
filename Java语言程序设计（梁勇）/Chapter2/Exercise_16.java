package Chapter2;
import java.util.Scanner;
public class Exercise_16 {
    public static void main(String[] atgs){
    Scanner input = new Scanner(System.in);
    java.text.DecimalFormat df  = new java.text.DecimalFormat("#.####");
    System.out.print("Enter the side: ");
    double side = input.nextDouble();
    double area = 3 * Math.pow(3,0.5) * side * side / 2;
    System.out.println("The area of the hexagon is " + df.format(area));
    }
}
