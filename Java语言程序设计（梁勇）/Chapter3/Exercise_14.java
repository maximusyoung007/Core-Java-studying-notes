package Chapter3;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args){
        System.out.print("guess a number:");
        Scanner input = new Scanner(System.in);
        int a = (int)(Math.random() * 2);
        int b = input.nextInt();
        if(a == b)
            System.out.print("right.");
        else
            System.out.print("wrong.");
    }
}
