package Chapter3;
import java.util.Scanner;
public class Exercise_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.0");
        System.out.print("enter a point with two coordinates:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double distance = Math.pow((a * a + b * b),0.5);
        if(distance > 10){
            System.out.print("the point (" + df.format(a) + "," + df.format(b) + ") is not in the circle.");
        }
        else
            System.out.print("the point (" + df.format(a) + "," + df.format(b) + ") is in the circle.");
    }
}
