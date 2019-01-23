package Chapter7;
import java.util.Scanner;
public class Exercise_31 {
    public static int[] bubbleSort(int[] array){
        for(int i = 0;i < array.length-1;i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] merge(int[] list1,int[] list2){
        int[] list3 = new int[list1.length + list2.length];
        for(int i = 0;i < list1.length;i++)
            list3[i] = list1[i];
        for(int i = list1.length,j = 0;j < list2.length;i++,j++)
            list3[i] = list2[j];
        int[] list4 = bubbleSort(list3);
        return list4;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter list1:");
        int n = input.nextInt();
        int[] list1 = new int[n];
        for(int i = 0;i < n;i++)
            list1[i] = input.nextInt();
        System.out.print("enter list2:");
        int m = input.nextInt();
        int[] list2 = new int[m];
        for(int i = 0;i < m;i++)
            list2[i] = input.nextInt();
        int[] list3 = merge(list1,list2);
        System.out.print("the merge list is:");
        for(int i = 0;i < list3.length;i++)
            System.out.print(list3[i] + " ");
    }
}
