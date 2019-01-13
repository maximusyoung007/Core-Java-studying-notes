package Chapter3;
import java.util.Scanner;
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.println("enter a,b,c,d,e,f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double t = a * d - b * c;
        if(t == 0){
            System.out.print("equation has no solution.");
        }
        else {
            double x = (e * d - b * f) / t;
            double y = (a * f - e * c) / t;
            System.out.print("x is " + x + " and y is " + y);
        }
    }
}
