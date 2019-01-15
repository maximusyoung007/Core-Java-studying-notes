package Chapter4;
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the length from the center to a vertex:");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * Math.pow(s,2) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("the area of the pentagon is %4.2f",area);
    }
}
