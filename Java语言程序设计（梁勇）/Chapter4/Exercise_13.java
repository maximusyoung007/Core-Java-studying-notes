package Chapter4;
import java.util.Scanner;
public class Exercise_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a letter grade:");
        String a = input.next();
        char aa = a.charAt(0);
        if(aa >= 'a' && aa <= 'z'){
            if(aa == 'a' || aa == 'e' || aa == 'i' || aa == 'o' || aa == 'u')
                System.out.print(aa + " is a vowel");
            else
                System.out.print(aa + " is a consonant");
        }
        else if(aa >= 'A' && aa <= 'Z'){
            if(aa == 'A' || aa == 'E' || aa == 'I' || aa == 'O' || aa == 'U')
                System.out.print(aa + " is a vowel");
            else
                System.out.print(aa + " is a consonant");
        }
        else
            System.out.print(aa + " is an invalid input");
    }
}
