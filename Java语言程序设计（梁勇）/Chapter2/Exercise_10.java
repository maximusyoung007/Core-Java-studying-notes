package Chapter2;
import java.util.*;
public class Exercise_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        double m = input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double t = input.nextDouble();
        System.out.println("Enter the final temperature:");
        double ft = input.nextDouble();
        double q = m * (ft - t) * 4184;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.#");
        System.out.println("the energy needed is " + q);
    }
}
