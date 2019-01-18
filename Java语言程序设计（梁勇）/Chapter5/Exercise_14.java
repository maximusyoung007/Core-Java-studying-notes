package Chapter5;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input two integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int d = 0;
        if(num1 >= num2){
            d = num2;
        }
        else
            d = num1;
        while(d > 0){
            if(num1 % d == 0 && num2 % d == 0){
                System.out.println(d + " is gcd");
                break;
            }
            d--;
        }
    }
}
