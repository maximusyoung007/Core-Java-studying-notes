package Chapter7;

import java.util.Scanner;

public class Exercise_30 {
    public static boolean isConsecutiveFour(int[] values){
        int count = 1,temp = values[0];
        boolean haveFour = false;
        for(int i = 1;i < values.length;i++){
            if(values[i] == temp)
                count++;
            else if(values[i] != temp){
                count = 1;
                temp = values[i];
            }
            if(count == 4){
                haveFour = true;
                break;
            }
        }
        return haveFour;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of values:");
        int n = input.nextInt();
        System.out.print("enter the values:");
        int[] values = new int[10];
        for(int i = 0;i < n;i++){
            values[i] = input.nextInt();
        }
        boolean result = isConsecutiveFour(values);
        if(result)
            System.out.print("the list has consecutive four");
        else if(!result)
            System.out.print("the list has no consecutive four");
    }
}
