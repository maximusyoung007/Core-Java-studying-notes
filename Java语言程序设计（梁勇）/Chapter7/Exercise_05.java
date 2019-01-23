package Chapter7;
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args){
        int[] count = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.print("enter 10 numbers:");
        int n,num = 0;
        for(int i = 0;i < 10;i++){
            count[i] = 0;
        }
        for(int i = 0;i < 10;i++){
            n = input.nextInt();
            count[n]++;
            if(count[n] == 1)
                num++;
        }
        System.out.println("the number of distinct number is " + num);
        System.out.print("the distinct numbers are:" );
        for(int i =0;i < 10;i++){
            if(count[i] > 0)
                System.out.print(i + " ");
        }
    }
}
