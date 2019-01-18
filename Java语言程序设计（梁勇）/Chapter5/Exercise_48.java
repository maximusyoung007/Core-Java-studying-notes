package Chapter5;
import java.util.Scanner;
public class Exercise_48 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string:");
        String s1 = input.nextLine();
        char a = ' ';
        for(int i = 0;i < s1.length();i++){
            if(i % 2 == 0) {
                a = s1.charAt(i);
                System.out.print(a);
            }
        }
    }
}
