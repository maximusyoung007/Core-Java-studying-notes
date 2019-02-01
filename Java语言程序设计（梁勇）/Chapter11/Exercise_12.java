package Chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_12 {
    public static void main(String[] args){
        System.out.print("enter five numbers:");
        double value;
        ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            value = input.nextDouble();
            list.add(value);
        }
        System.out.print("the sum is " + sum(list));
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for(int i = 0;i < list.size();i++)
            sum += list.get(i);
        return sum;
    }
}
