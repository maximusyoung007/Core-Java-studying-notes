package Chapter6;
import java.util.Scanner;
public class Exercise_37 {
    public static String format(int number, int width) {
        String result = String.valueOf(number);
        int len = 0;
        while(number > 0){
            len++;
            number /= 10;
        }
        for (int i = 0; i < width - len; i++)
            result = "0" + result;
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number and its width");
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.println(format(number,width));
    }
}
