package Chapter7;
import java.util.Scanner;
public class Exercise_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] count = new int[100];
        for(int i = 0;i < 100;i++){
            count[i] = 0;
        }
        System.out.print("Enter the integers between 1 and 100:");
        int b = input.nextInt();
        while(b != 0){
            count[b]++;
            b = input.nextInt();
        }
        for(int i = 0;i < 100;i++){
            if(count[i] != 0){
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}
