package Chapter6;
import java.util.Scanner;
public class Exercise_18 {
    public static boolean check(String s){
        int len = s.length();
        if(len <= 8){
            return false;
        }
        int haveNumber = 0,haveLetter = 0;
        for(int i = 0;i < len;i++){
            char a = s.charAt(i);
            if(a <= '9' && a >= '0')
                haveNumber++;
            if((a <= 'z' && a >= 'a') || (a <= 'Z' && a >= 'A'))
                haveLetter++;
        }
        if(haveLetter >= 1 && haveNumber >= 2)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string:");
        String s = input.nextLine();
        if(check(s) == true)
            System.out.print("valid password.");
        else
            System.out.print("Invalid Password.");
    }
}
