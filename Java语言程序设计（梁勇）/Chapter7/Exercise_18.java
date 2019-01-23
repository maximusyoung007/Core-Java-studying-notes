package Chapter7;
import java.util.Scanner;
public class Exercise_18 {
    public static double[] bubbleSort(double[] array){
        for(int i = 0;i < array.length-1;i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] num = new double[10];
        System.out.print("enter 10 numbers:");
        for(int i = 0;i < num.length;i++){
            num[i] = input.nextDouble();
        }
        double[] result = bubbleSort(num);
        for(int i = 0;i < result.length;i++)
            System.out.print(result[i] + " ");
    }
}
