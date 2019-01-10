package Chapter2;
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        long m = input.nextLong();
        long nd = m / 24 / 60;
        long nd2 = nd % 365;
        long ny = nd / 365;
        System.out.println(m + " minutes is approximately " + ny + " years and " + nd2 + " days");
    }
}
