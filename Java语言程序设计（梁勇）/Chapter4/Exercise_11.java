package Chapter4;
import java.util.Scanner;
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a decimal number:");
        int a = input.nextInt();
        if(a < 10)
            System.out.print("the hex value is " + a);
        else if(a >= 10)
            System.out.print("the hex value is " + (char)('A' + a - 10));
    }
}
