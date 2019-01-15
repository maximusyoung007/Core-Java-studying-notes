package Chapter4;
import java.util.Scanner;
public class Exercise_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a character:");
        String a = input.next();
        char aa = a.charAt(0);
        int aaa = (int)aa;
        System.out.print("the unicode for the character " + aa + " is " + aaa);
    }
}
