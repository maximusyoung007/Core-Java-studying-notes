package Chapter7;
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args){
        int[] score = new int[100];
        int best = 0,n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        n = input.nextInt();
        System.out.print("Enter " + n + " scores:");
        for(int i = 0;i < n;i++){
            score[i] = input.nextInt();
            if(score[i] > best)
                best = score[i];
        }
        for(int i = 0;i < n;i++){
            if(score[i] >= best - 10)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is:A");
            else if(score[i] >= best - 20)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is:B");
            else if(score[i] >= best - 30)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is:C");
            else if(score[i] >= best - 40)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is:D");
            else
                System.out.println("Student " + i + " score is " + score[i] + " and grade is:E");
        }
    }
}
