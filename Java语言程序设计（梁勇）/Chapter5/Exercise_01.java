package Chapter5;
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int positives = 0,negatives = 0,total = 0,count = 0;
        System.out.println("enter an integer,tne input ends if it is 0:");
        do{
            n = input.nextInt();
            total += n;
            count++;
            if(n > 0)positives++;
            else if(n < 0)negatives++;
        }while(n != 0);
        if(count == 1)
            System.out.println("no numbers are entered except 0.");
        else {
            System.out.println("the number of positives:" + positives);
            System.out.println("the number of nrgatves:" + negatives);
            System.out.println("the total is:" + (float) total);
            System.out.println("the average is " + total * 1.0 / (count - 1));
        }
    }
}
