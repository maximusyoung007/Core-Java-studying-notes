package Chapter2;
import java.util.Scanner;
public class Exercise_13 {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        System.out.println("Enter the monthly saving value: ");
        int monthlySaving = input.nextInt();
        double totalValue = 0;
        for(int i = 0;i < 6;i++){
            totalValue = (totalValue + monthlySaving) * (1 + 0.00417);
            if(i == 5){
                System.out.println("After sixth month,the account value is $" + df.format(totalValue));
            }
        }
    }
}
