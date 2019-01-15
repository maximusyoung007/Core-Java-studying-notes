package Chapter4;
import java.util.Scanner;
public class Exercise_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a letter:");
        String a = input.next();
        String number = "";
        switch (a.toLowerCase()){
            case "a" : case "b" : case "c" : number = "2";break;
            case "d" : case "e" : case "f" : number = "3";break;
            case "g" : case "h" : case "i" : number = "4";break;
            case "j" : case "k" : case "l" : number = "5";break;
            case "m" : case "n" : case "o" : number = "6";break;
            case "p" : case "q" : case "r" : case "s" : number = "7";break;
            case "v" : case "t" : case "u" : number = "8";break;
            case "z" : case "w" : case "x" : case "y" : number = "9";break;
            default:System.out.print(a + " is an invalid input.");System.exit(1);
        }
        System.out.print("the corresponding number is " + number);
    }
}
