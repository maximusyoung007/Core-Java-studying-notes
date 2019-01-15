package Chapter4;
import java.util.Scanner;
public class Exercise_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1:");
        String s1 = input.next();
        System.out.print("Enter string s2:");
        String s2 = input.next();
        if(s1.indexOf(s2) != -1)
            System.out.print(s2 + " is substring of " + s1);
        else
            System.out.print(s2 + " is not substring of " + s1);
    }
}
