package Chapter4;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.print("enter point1 in degrees:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("enter point2 in degrees:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                        Math.cos(Math.toRadians(y1 - y2)));
        System.out.print("the distance between two points is " + df.format(d) + "km");
    }
}