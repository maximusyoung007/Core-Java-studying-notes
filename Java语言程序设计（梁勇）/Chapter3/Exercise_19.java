package Chapter3;
import java.util.Scanner;
public class Exercise_19 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter three lines:");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if (a + b > c && a + c > b && b + c > a) {
                System.out.print("the perimeter is " + (a + b + c));
            }
    }
}
