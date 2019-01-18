package Chapter5;
import java.util.Scanner;
public class Exercise_41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter numbers:");
        int n = input.nextInt();
        int max = 0,count = 0;
        if(n == 0){
            System.exit(1);
        }
        while(n != 0){
            if(n > max){
                max = n;
                count = 1;
            }
            else if(n == max){
                count++;
            }
            n = input.nextInt();
        }
        System.out.println("the biggest number is:" + max);
        System.out.println("the occurrence count of the largest number is:" + count);
    }
}
