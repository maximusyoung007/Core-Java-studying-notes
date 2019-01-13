package Chapter3;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 49 % 10);
        Scanner input = new Scanner(System.in);
        System.out.print("what is the sum of " + number1 + "," + number2 + " and " + number3 + "?");
        int answer = input.nextInt();
        System.out.print("please input your answer:");
    }
}
