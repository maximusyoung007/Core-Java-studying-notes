package Chapter7;
import java.util.Scanner;
public class Exercise_04 {
    public static void main(String[] args){
        int n;
        System.out.print("enter the number of students:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] score = new int[20];
        int total = 0,count = 0,ave = 0,countHigh = 0,countLow = 0;
        System.out.print("enter scores:");
        for(int i = 0;i < n;i++){
            score[i] = input.nextInt();
            total += score[i];
            count++;
        }
        ave = total / count;
        for(int i = 0;i < n;i++){
            if(score[i] > ave)
                countHigh++;
            else if(score[i] < ave)
                countLow++;
        }
        System.out.println("高于平均分的分数有" + countHigh + "个");
        System.out.print("低于平均分的分数有" + countLow + "个");
    }
}
