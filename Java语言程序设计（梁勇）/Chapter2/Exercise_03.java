package Chapter2;
import java.util.Scanner;
public class Exercise_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet:");
        double f = input.nextDouble();
        double m = f * 0.305;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.####");
        System.out.println(f + " feet is " + df.format(m) + " meters");
    }
}
