package Chapter2;
import java.util.Scanner;
public class Exercise_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.#####");
        System.out.print("Enter balance and interest rate:");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + df.format(interest));
    }
}
