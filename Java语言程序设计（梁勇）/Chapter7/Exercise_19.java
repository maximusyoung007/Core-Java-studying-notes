package Chapter7;
import java.util.Scanner;
public class Exercise_19 {
    public static boolean isSorted(int[] list){
        for(int i = 0;i < list.length - 1;i++)
            if(list[i] > list[i + 1])
                return false;
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 0;
        int[] num = new int[10];
        System.out.print("enter the list:");
        n = input.nextInt();
        for(int i = 0;i < n;i++){
            num[i] = input.nextInt();
        }
        boolean result = isSorted(num);
        if(result)
            System.out.print("the list is already sorted");
        else if(!result)
            System.out.print("the list is not sorted");
    }
}
