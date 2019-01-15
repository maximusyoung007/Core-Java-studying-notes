package Chapter4;
import java.util.*;
public class Exercise_04 {
    public static void main(String[] args){
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.print("enter the side:");
        Scanner input = new Scanner(System.in);
        double s = input.nextDouble();
        double area = (6 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 6));
        System.out.print("the area of hexagon is " + df.format(area));
    }
}
