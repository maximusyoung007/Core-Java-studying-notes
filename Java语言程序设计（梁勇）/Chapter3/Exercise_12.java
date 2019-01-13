package Chapter3;
import java.util.Scanner;
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = input.nextInt();
        int s = 0;
        int m = n;
        while (m > 0) {
            s = s * 10 + m % 10;
            m = m / 10;
        }
        if(s == n)
            System.out.println(n + " is palindrome.");
        else
            System.out.print(n + " is not a palindrome");
    }
}
