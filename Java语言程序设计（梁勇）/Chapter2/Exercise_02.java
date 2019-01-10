package Chapter2;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double s = radius * radius * Math.PI;
        double v = s * length;
        java.text.DecimalFormat df1 = new java.text.DecimalFormat("#.####");
        java.text.DecimalFormat df2 = new java.text.DecimalFormat("#.##");
        System.out.println("The area is " + df1.format(s));
        System.out.println("The volume is " + df2.format(v));
    }
}
