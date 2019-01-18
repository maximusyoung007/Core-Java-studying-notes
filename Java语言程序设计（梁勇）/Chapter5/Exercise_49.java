package Chapter5;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Exercise_49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a String:");
        char a = ' ';
        int numv = 0,numc = 0;
        String s1 = input.nextLine();
        for(int i = 0;i < s1.length();i++){
            a = s1.charAt(i);
            if((a <= 'z' && a >= 'a') || (a <= 'Z' && a >= 'A')){
                a = toLowerCase(a);
                if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                    numv++;
                }
                else
                    numc++;
            }
        }
        System.out.println("the number of vowels is:" + numv);
        System.out.println("the number of consonants is " + numc);
    }
}
