package Chapter2;
import java.util.Scanner;
public class Exercise_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.print("Enter investment amount");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years:");
        int year = input.nextInt();
        double value = amount * Math.pow((1 + interestRate / 1200),year * 12);
        System.out.println("Accumulated value is $" + df.format(value));
    }
}
