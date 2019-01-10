package Chapter2;
import java.util.Scanner;
public class Exercise_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58℉ and 41℉");
        double ft = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour:");
        double v = input.nextDouble();
        double t = 35.74 + 0.6215 * ft - 35.75 * Math.pow(v,0.16) + 0.4275 * ft * Math.pow(v,0.16);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.#####");
        System.out.print("the wind chill index is " + df.format(t));
    }
}
