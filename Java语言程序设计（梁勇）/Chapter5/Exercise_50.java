package Chapter5;
import java.util.Scanner;
public class Exercise_50 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string:");
        String s1 = input.nextLine();
        char a = ' ';
        int count = 0;
        for(int i = 0;i < s1.length();i++){
            a = s1.charAt(i);
            if(a >= 'A' && a <= 'Z')
                count++;
           }
        System.out.print("the number of uppercase letters is " + count);
    }
}
