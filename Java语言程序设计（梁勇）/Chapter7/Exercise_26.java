package Chapter7;

import java.util.Scanner;

public class Exercise_26 {
    public static boolean equals(int[] list1,int[] list2){
        if(list1.length != list2.length)
            return false;
        for(int i = 0;i < list1.length;i++)
            if(list1[i] != list2[i])
                return false;
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] list1 = new int[6];
        int[] list2 = new int[6];
        System.out.print("enter list1:");
        for(int i = 0;i < list1.length;i++)
            list1[i] = input.nextInt();
        System.out.print("enter list2:");
        for(int i = 0;i < list2.length;i++)
            list2[i] = input.nextInt();
        if(equals(list1,list2))
            System.out.print("two lists are strictly identical");
        else if (!equals(list1,list2))
            System.out.print("two lists are not strictly identical");
    }
}
