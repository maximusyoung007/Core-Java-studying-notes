package Chapter2;
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:");
        double s = input.nextDouble();
        double gr = input.nextDouble();
        double g = s * gr / 100;
        double t = s + g;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.#");
        System.out.print("The gratuity is $" + df.format(g) + " and total is $" + df.format(t));

    }
}
