package Chapter5;
import java.util.Scanner;
public class Exercise_46 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string:");
        String s1 = input.next();
        int len = s1.length();
        System.out.print("the reversed string is:");
        for(int i = len - 1;i >= 0;i--){
            char a = s1.charAt(i);
            System.out.print(a);
        }
    }
}
