package Chapter7;
import java.util.Scanner;
public class Exercise_08 {
    public static int average(int[] array){
        int total = 0,count = 0;
        int len = array.length;
        for(int i = 0;i < len;i++){
            total += array[i];
            count++;
        }
        return total / count;
    }
    public static double average(double[] array){
        double total = 0,count = 0;
        int len = array.length;
        for(int i = 0;i < len;i++){
            total += array[i];
            count++;
        }
        return total / count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter 10 numbers:");
        double[] num = new double[10];
        for(int i = 0;i < 10;i++){
            num[i] = input.nextDouble();
        }
        System.out.print("the average is " + average(num));
    }
}
