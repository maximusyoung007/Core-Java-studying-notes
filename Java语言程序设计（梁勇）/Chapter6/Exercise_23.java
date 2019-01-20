package Chapter6;

import java.util.Scanner;

public class Exercise_23 {
    public static int counts(String str,char a){
        int len = str.length();
        int count = 0;
        for(int i = 0;i < len;i++){
            char b = str.charAt(i);
            if(a == b)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string");
        String str = input.nextLine();
        System.out.print("enter a letter:");
        String a = input.next();
        char b = a.charAt(0);
        System.out.print("the number of '" + b + "' is " + counts(str,b));
    }
}
