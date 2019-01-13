package Chapter3;
import java.util.Scanner;
public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer:");
        int integer = input.nextInt();
        System.out.print("Is" + integer + "divisible by 5 and 6?");
        if(integer % 5 == 0 && integer % 6 ==0)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.print("Is" + integer + "divisible by 5 or 6?");
        if(integer % 5 == 0 || integer % 6 == 0)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.print("Is" + integer + "divisible by 5 or 6,but not both?");
        if(integer % 5 == 0 ^ integer % 6 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
