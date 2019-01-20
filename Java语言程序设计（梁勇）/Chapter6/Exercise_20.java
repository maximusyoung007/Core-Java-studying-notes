package Chapter6;
import java.util.Scanner;
import static java.lang.Character.toLowerCase;
public class Exercise_20 {
    public static int countLetters(String s){
        int len = s.length(),count = 0;
        for(int i = 0;i < len;i++){
            char a = s.charAt(i);
            a = toLowerCase(a);
            if(a >= 'a' && a <= 'z')
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string:");
        String s = input.nextLine();
        System.out.print("the number of letters are : " + countLetters(s));
    }
}
