package Chapter4;
import java.util.Scanner;
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a hex digit:");
        String a = input.next();
        char aa = a.charAt(0);
        String bb = " ";
        switch (aa) {
            case '0': bb = "0"; break;
            case '1': bb = "1"; break;
            case '2': bb = "10"; break;
            case '3': bb = "11"; break;
            case '4': bb = "100"; break;
            case '5': bb = "101"; break;
            case '6': bb = "110"; break;
            case '7': bb = "111"; break;
            case '8': bb = "1000"; break;
            case '9': bb = "1001"; break;
            case 'A': bb = "1010"; break;
            case 'B': bb = "1011"; break;
            case 'C': bb = "1100"; break;
            case 'D': bb = "1101"; break;
            case 'E': bb = "1110"; break;
            case 'F': bb = "1111"; break;
            default: System.out.println(a + " is an invalid input"); System.exit(1);
        }
        System.out.print("the binary value is " + bb);
    }
}
