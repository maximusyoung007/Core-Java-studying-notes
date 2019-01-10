package Chapter2;
import java.util.Scanner;
public class Exercise_23 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        System.out.println("The cost of driving is $" + df.format((distance / milesPerGallon) * pricePerGallon));
    }
}
