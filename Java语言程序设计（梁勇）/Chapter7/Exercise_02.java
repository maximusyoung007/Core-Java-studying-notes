package Chapter7;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args){
        int[] a = new int[10];
        System.out.print("enter ten numbers:");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 10;i++){
            a[i] = input.nextInt();
        }
        for(int i = 9;i >= 0;i--){
            System.out.print(a[i] + " ");
        }
    }
}
