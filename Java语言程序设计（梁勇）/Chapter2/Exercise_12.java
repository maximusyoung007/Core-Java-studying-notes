package Chapter2;
import java.util.Scanner;
public class Exercise_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration:");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = Math.pow(speed,2) / 2 / acceleration;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.###");
        System.out.println("the minimum runway length for this airplane is:" + df.format(length));
    }
}
