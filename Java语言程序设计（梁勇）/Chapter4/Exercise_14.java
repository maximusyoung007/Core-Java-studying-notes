package Chapter4;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = "";
        switch (a){
            case "A" : b = "4";break;
            case "B" : b = "3";break;
            case "C" : b = "2";break;
            case "D" : b = "1";break;
            case "E" : b = "0";break;
            default:System.out.print(a + " is an invalid grade ");System.exit(1);
        }
        System.out.print("the numeric value for grade " + a + " is " + b);
    }
}
