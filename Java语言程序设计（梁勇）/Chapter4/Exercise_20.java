package Chapter4;
import java.util.Scanner;
public class Exercise_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int len = s.length();
        char first = s.charAt(0);
        System.out.print("the length is " + len + " and the first char is " + first + ".");
    }
}
