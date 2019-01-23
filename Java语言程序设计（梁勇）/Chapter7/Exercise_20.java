package Chapter7;
import java.util.Scanner;
public class Exercise_20 {
    public static void selectionSort(double[] list){
        for(int i = list.length - 1;i >= 0;i--){
            double currentMax = list[i];
            int currentMaxIndex = i;
            for(int j = i - 1;j >= 0;j--){
                if(currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] num = new double[10];
        System.out.print("enter 10 numbers:");
        for(int i = 0;i < 10;i++){
            num[i] = input.nextInt();
        }
        selectionSort(num);
        for(int i = 0;i < 10;i++)
            System.out.print(num[i] + " ");
    }
}
