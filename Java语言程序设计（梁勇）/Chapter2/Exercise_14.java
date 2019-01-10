package Chapter2;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.####");
        System.out.print("Enter weight in pounds:");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches:");
        double height = input.nextDouble();
        double BMI = (pounds * 0.45359237) / Math.pow((height * 0.0254),2);
        System.out.println("BMI is " + df.format(BMI));
    }
}
