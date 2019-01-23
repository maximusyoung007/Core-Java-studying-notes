package Chapter7;
import java.util.Scanner;
public class Exercise_15 {
    public static int[] eliminateDuplicates(int[] list){
        int[] temp = new int[list.length];
        int size = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < i && !isInArray; j++)
                if (list[j] == list[i])
                    isInArray = true;
            if (!isInArray)
                temp[size++] = list[i];
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++)
            result[i] =temp[i];

        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter ten numbers:");
        int a[] = new int[10];
        for(int i = 0;i < a.length;i++){
            a[i] = input.nextInt();
        }
        int[] b = eliminateDuplicates(a);
        System.out.print("the distinct numbers are:");
        for(int i = 0;i < b.length;i++)
            System.out.print(b[i] + " ");
    }
}
