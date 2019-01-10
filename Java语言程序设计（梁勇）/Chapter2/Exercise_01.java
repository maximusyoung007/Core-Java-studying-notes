package Chapter2;
import  java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args){
        int c;
        double f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        c = input.nextInt();
        f = (9.0 / 5) * c + 32;
        System.out.println(c + " Celsius is " + f + " Fahrenheit");
    }
}
