package Chapter5;
import java.util.Scanner;
public class Exercise_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input a number between 1 - 15:");
        int n = input.nextInt();
        for(int i = 1;i <= n;i++){
            for(int m = 1;m <= 3*(n - i);m++)
                System.out.print(" ");
            for(int j = i;j >= 2;j--)
                System.out.print(j + "  ");
            for(int k = 1;k <= i;k++)
                System.out.print(k + "  ");
            System.out.println();
        }
    }
}
