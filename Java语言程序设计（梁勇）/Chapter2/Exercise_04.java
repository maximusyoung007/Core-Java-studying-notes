package Chapter2;
import java.util.Scanner;
public class Exercise_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double p = input.nextDouble();
        double k = p * 0.454;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.###");
        System.out.println(p + " pounds is " + df.format(k) + " kilograms");
    }
}
