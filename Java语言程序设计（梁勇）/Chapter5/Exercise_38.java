package Chapter5;
import java.util.Scanner;
public class Exercise_38 {
    public static void main(String[] args){
        int[] a = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("input an integer:");
        int num = input.nextInt();
        int i = 0,count = 0;
        while(num > 0){
            a[i++] = num % 8;
            num /= 8;
            count = i;
            //System.out.println(count);
        }
        for(int j = count - 1;j >= 0;j--){
            System.out.print(a[j]);
        }

    }
}
