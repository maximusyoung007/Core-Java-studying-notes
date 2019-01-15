package Chapter4;
import java.util.Scanner;
public class Exercise_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter two characters:");
        String m = input.next();
        char m1 = m.charAt(0);
        char year = m.charAt(1);
        String m2 = "";
        switch (m1){
            case 'M' : m2 = "Mathematics";break;
            case 'C' : m2 = "Computer Science";break;
            case 'I' : m2 = "Information Technology";break;
        }
        String year2 = "";
        switch (year){
            case '1' : year2 = "Freshman";break;
            case '2' : year2 = "Sophomore";break;
            case '3' : year2 = "Junior";break;
            case '4' : year2 = "Senior";break;
        }
        System.out.print(m2 + " " + year2);
    }
}
