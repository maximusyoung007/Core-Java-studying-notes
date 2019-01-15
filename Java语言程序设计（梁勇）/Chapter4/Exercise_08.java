package Chapter4;
import java.util.Scanner;
public class Exercise_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter an ASCII code:");
        int a = input.nextInt();
        char aa = (char)a;
        System.out.print("the character for ASCII code " + a + " is " + aa);
    }
}
