package Chapter2;
import java.util.Scanner;
public class Exercise_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int num = input.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.print("the sum of the digits is:" + sum);
    }
}
